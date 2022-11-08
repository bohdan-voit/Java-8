import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String [] args) {
        ArrayList<String> menu=new ArrayList<>();
        Scanner sc=new Scanner(System.in);


        while (true) {
            displayMenu();
            int option=sc.nextInt();

            if (option == 1) {
                System.out.println("Enter an animal name to ad :");
                menu.add(sc.next());
                System.out.println("Added");

            }
            else if (option == 2) {
                System.out.println("Enter an animal to remove from the menu :");

                String elementToRemove = sc.next();
                if(menu.contains(elementToRemove)){
                    menu.remove(String.valueOf(elementToRemove));
                    System.out.println("Removed");
                }else {
                    System.out.println("Element not found");
                }

            }
            else if (option == 3) {
                System.out.println(menu);
            }
            else if(option == 4){

                Collections.sort(menu);
                System.out.println("sorted");

            }
            else if (option == 5) {
                System.out.println("bye");
                break;
            }
        }
    }
    public static void displayMenu(){



        System.out.println("Please choose an element from menu:");
        System.out.println("1. add");
        System.out.println("2. delete");
        System.out.println("3. display");
        System.out.println("4. sort");
        System.out.println("5. exit ");
        System.out.println("pick an option ");
    }
}
