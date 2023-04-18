import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name;
        int testMark;
        String classType;

        System.out.print("Enter your name: ");
        name = scan.next();
        System.out.print("Enter your test mark: ");
        testMark = scan.nextInt();
        System.out.println("Enter class type (ENG for engineering and IT for infromation tech): ");
        classType = scan.next();

        System.out.println("Results for "+name);
        //switch statements
        switch (classType){
            case "ENG":
                System.out.println("Enrolled for engineering");
                break;
            case "IT":
                System.out.println("Enrolled for Information technology");
                break;
            default:
                System.out.println("Invalid class type entered");
        }
        //if else block
        if (testMark < 50){
            System.out.println("You have failed");
        } else if (testMark < 75) {
            System.out.println("You have passed");
        }else if(testMark > 75){
            System.out.println("You have passed by distinction");
        }else {
            System.out.println("Invalid input");
        }

    }
}

