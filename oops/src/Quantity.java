package oops.src;
public class Quantity {

    public static void main(String[] args) {

        Product product = new Product();

        System.out.println("Price for a quantity "+ product.getprice());


        System.out.println("Total Calculated Price "+ product.getprice(5));
    }
}