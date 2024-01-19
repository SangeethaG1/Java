public class Quantity {

    public static void main(String[] args) {

        Products product = new Products();

        System.out.println("Price for a quantity "+ product.getprice());


        System.out.println("Total Calculated Price "+ product.getprice(5));
    }
}