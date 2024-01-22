package objectarray;
public class Products implements Comparable<Products> {
    private double weight;
    private double price;
    private int id;
    public Products(double weight, double price, int id) {
        this.weight = weight;
        this.price = price;
        this.id = id;
    }
    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }


    @Override
    public int compareTo(Products otherProduct) {

        return Double.compare(this.price, otherProduct.price);
    }


    @Override
    public String toString() {
        return "Product{" +
                "weight=" + weight +
                ", price=" + price +
                ", id=" + id +
                '}';
    }


    public static void main(String[] args) {

        Products product1 = new Products(1.5, 25.99, 101);
        Products product2 = new Products(2.0, 19.99, 102);
        Products product3 = new Products(1.0, 29.99, 103);

        int result = product1.compareTo(product2);


        if (result < 0) {
            System.out.println(product1 + " is cheaper than " + product2);
        } else if (result > 0) {
            System.out.println(product1 + " is more expensive than " + product2);
        } else {
            System.out.println(product1 + " has the same price as " + product2);
        }
    }
}