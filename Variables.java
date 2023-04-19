public class Variables {
    public static void main(String[] args) {
        String productName = "Shoes";
        int quantity = 5 ;
        Double price = 699.99;
        boolean isAvailable = true;

        System.out.println("Product name: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        if (isAvailable) {
            System.out.println("Product is Available");
        } else {
            System.out.println("Product is Not Available");
        }
    }
}
