package Week2;
import java.util.Scanner;
public class ProjectSTEM_Assignments {
    public static void main(String[] args) {
        //Assignments for Project STEM Code here
        Scanner scan = new Scanner(System.in);
        String food = scan.nextLine();
        System.out.println("I like to eat " + food + " as well!");

        Scanner name1 = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = name1.nextLine();
        String name2 = name1.nextLine();
        String name3 = name1.nextLine();
        String name4 = name1.nextLine();
        System.out.println(name4 + " " + name2 + " " + name3 + " " + name );

        Scanner nameScan = new Scanner(System.in);
        System.out.println("Hi there! What is your name?");
        String nameInput = nameScan.nextLine();
        System.out.println("What State do you live in?");
        String stateInput = nameScan.nextLine();
        System.out.println("My name is " + nameInput + ". I live in " + stateInput + ".");

    }
}
