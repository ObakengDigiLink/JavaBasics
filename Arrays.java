public class Arrays {
    public static void main(String[] args) {
        //1D Array
        int[] squares = new int[10];

        //storing squares of the first 10 numbers from 1
        for(int x = 0; x < squares.length; x++){
            squares[x] = (x + 1) * (x + 1);
        }

        System.out.println("Squares of 10 numbers from 1");
        for (int i = 0; i < squares.length ; i++) {
            System.out.println(squares[i]);
        }
        System.out.println();

        String[] names = new String[3];
        names[0] = "Obakeng";
        names[1] = "Desmond";
        names[2] = "Pitse";

        //for each loop
        System.out.println("Names Array");
        for(String name: names){
            System.out.println(name);
        }
    }
}

