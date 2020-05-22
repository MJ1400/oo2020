import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eesti ID - 1 | Soome ID - 2");
        int option = Integer.parseInt(scanner.nextLine());
        EstonianID estonian;
        FinnishID finnish;
        if (option == 1) {

            System.out.println("Sisestage oma isikukood: ");
            String isikukood = scanner.nextLine();
            estonian = new EstonianID(isikukood);
            System.out.println(estonian.getBirthday());
            System.out.println(estonian.getGender());
            } else if (option == 2) {
            System.out.println("Sisestage oma isikukood: ");
            String isikukood = scanner.nextLine();
            finnish = new FinnishID(isikukood);
            System.out.println(finnish.getBirthday());
            System.out.println(finnish.getGender());
            } else {
                System.out.println("Palun sisestage kas 1 voi 2!");
            }

            scanner.close();

        }


    }
