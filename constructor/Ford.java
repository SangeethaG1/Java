package constructor;
public class Ford extends Car {
    String name;

    public Ford(String name, String carType) {
        super(carType);
        this.name = name;
    }

    public Ford(String name) {
        super("suv");
        this.name = name;
    }

    public static void main(String[] args) {
        Ford ford = new Ford("suv");
        System.out.println(ford.cartype);
        System.out.println(ford.name);

        ford = new Ford("Classic", "ford");
        System.out.println(ford.name);
        System.out.println(ford.cartype);
    }
}