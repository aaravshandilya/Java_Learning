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

        Scanner doubleScan = new Scanner(System.in);
        double num1 = doubleScan.nextDouble();
        double num2 = doubleScan.nextDouble();
        double num3 = doubleScan.nextDouble();
        System.out.println(num3 + " " + num2 + " " + num1);
        
        Scanner namescScanner = new Scanner(System.in);
        System.out.println("Hi there. What is your name?" );
        String nameInput2 = namescScanner.nextLine();
        System.our.println("Hi " + nameInput2 + " How old are you?");
        int age = namescScanner.nextInt();
        System.out.println(nameInput2 + " is " + age + " years old.");

        System.out.println("Java is an object-oriented programming language, true or false?");
        Scanner booleanScanner = new Scanner(System.in);
        boolean isJavaOOP = booleanScanner.nextBoolean();
        System.out.println("There are only 2 possible values which can be held by a boolean variable, true or false?");
        boolean isBooleanTrueFalse = booleanScanner.nextBoolean();
        System.out.println("Question 1- Your answer: " + isJavaOOP + ". Correct answer: true");
        System.out.println("Question 2- Your answer: " + isBooleanTrueFalse + ". Correct answer: true");

        Scanner num1Scanner = new Scanner(System.in);
        System.out.println("Enter a starting number (must be and integer)");
        int startNum = num1Scanner.nextInt();
        startNum++;
        System.out.println("number is now "   + startNum);
        startNum++;
        System.out.println("number is now "   + startNum);
        startNum++;
        System.out.println("number is now "   + startNum);
        startNum--;
        System.out.println("number is now "   + startNum);
        startNum--;
        System.out.println("number is now "   + startNum);
        startNum--;
        System.out.println("number is now "   + startNum);

    }
}
