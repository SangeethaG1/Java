public class Overloading {

    public static void main(String[] args) {

        System.out.println(multiply(5,4));
        System.out.println(multiply(5,4,6));
    }

    public static int multiply(int a , int b) {
        return a*b;
    }

    public static int multiply(int a , int b , int c) {
        return a*b*c;
    }
}