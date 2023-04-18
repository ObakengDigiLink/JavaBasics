public class Loops {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        //for loop
        System.out.println("For Loop");
        for(int x = 0; x < numbers.length; x++){
            System.out.println(numbers[x]);
        }
        System.out.println();

        //While loop
        System.out.println("While Loop");
        int y = 0;
        while(y < numbers.length){
            System.out.println(numbers[y]);
            y++;
        }
        System.out.println();

        System.out.println("do...while Loop");
        int j = 0;
        do{
            System.out.println(numbers[j]);
            j++;
        }while(j < numbers.length);
    }
}

