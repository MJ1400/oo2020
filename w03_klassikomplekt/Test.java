import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class Test {

  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    HashSet <String> hashlist = new HashSet<String>();
    HashMap<String, String> fullnames = new HashMap<String, String>();

    hashlist.add("Eesti");
    hashlist.add("Soome");
    hashlist.add("Rootsi");
    System.out.println(hashlist);
    System.out.println("Kas hashlist sisaldab Eestit?: " + hashlist.contains("Eesti"));
    System.out.println("-----------------------------------");
    fullnames.put("Marten", "Jyrgens");
    fullnames.put("Karmo", "Pihlakas");
    fullnames.put("Rasmus", "Tamm");
    System.out.println(fullnames);
    System.out.println("-----------------------------------");
    list.add("Hello");
    list.add("world");
    list.add(String.valueOf(5));
    list.add(10 + "");

  for(String name : list) {
    System.out.println(name);
  }

  for(int i = 0; i < list.size(); i++) {
    System.out.println(list.get(i));
  }

  }
}
