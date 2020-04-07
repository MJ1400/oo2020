import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Character character = new Character();
        Character character2 = new Character();
        Obstacle obstacle = new Obstacle();

        System.out.println(Arrays.toString(character.getXY()));

        World world = new World();
        world.worldObjects.add(character);
        world.worldObjects.add(character2);
        world.worldObjects.add(obstacle);

        System.out.println(world.worldObjects.size());

        System.out.println(
            world.worldObjects.get(0) + " " +
            world.worldObjects.get(1) + " " +
            world.worldObjects.get(2)
        );

        for (WorldObject wo : world.worldObjects){
            System.out.println(wo);
        }

    }
}