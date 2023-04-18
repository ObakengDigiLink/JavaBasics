import java.util.Scanner;

public class Arrays2D {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double[][] testMarks = new double[5][3];

        String[] names = new String[5];

        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter your name: ");
            names[i] = scan.next();

            for (int j = 0; j < 3 ; j++) {
                System.out.print("Enter test"+(j + 1)+" marks: ");
                testMarks[i][j] = scan.nextDouble();
            }
        }
        System.out.println();

        //display output
        System.out.println("Names\t\tTest1\tTest2\tTest3");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]+ "\t\t");
            for (int j = 0; j < 3; j++) {
                System.out.print(testMarks[i][j]+ "\t");
            }

            System.out.println();
        }
    }
}

