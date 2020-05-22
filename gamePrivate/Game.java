
/**
 * Main
 */
import java.util.Arrays;
import java.util.Scanner;

public class Game {

  public static void main(String[] args) {
    World world = new World(20, 10);
    Character player = new Character("Marten", CharacterType.PLAYER, "X");
    Character enemy = new Character(5, 5, "Sipsik", CharacterType.MONSTER, "M", 100.0);
    Character npc = new Character(3, 3, "Helper", CharacterType.NPC, "N", 100.0);
    Item[] itemList = new Item[5];
    itemList[0] = new Item(7, 7, "Saabas", ItemType.WEAPON, 1.5, "S");

    world.addItems(itemList[0]);

    world.addCharacters(Arrays.asList(enemy, npc, player));
    Scanner scanner = new Scanner(System.in);

    String input = "";

    world.render();
    while (!input.equals("end")) {
      input = scanner.nextLine();

      if (input.equals("")) {
        player.move();
      } else if (input.equals("u")) {
        player.changeDirection(Direction.UP);
      } else if (input.equals("d")) {
        player.changeDirection(Direction.DOWN);
      } else if (input.equals("l")) {
        player.changeDirection(Direction.LEFT);
      } else if (input.equals("r")) {
        player.changeDirection(Direction.RIGHT);
      }

      if (player.x == npc.x && player.y == npc.y) {

        // ternary operator
        enemy.isVisible = enemy.isVisible == true ? false : true;
      }

      if (player.x == itemList[0].x && player.y == itemList[0].y) {
        itemList[0].isVisible = false;

      }

      if (player.x == enemy.x && player.y == enemy.y) {
        while (player.health != 0 && enemy.health != 0) {
          enemy.health = enemy.health - Math.round(Math.random());
          player.health = player.health - Math.round(Math.random());
        }
      }

      world.render();

    }
    scanner.close();
  }

}
