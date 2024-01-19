

public class Fibonacci {
    public static void main(String[] args)
    {
        int a=0, b=1, i, N=10, result;

        for(i=0; i<N; i++) {
            System.out.println(a);
            result = a + b;
            a = b;
            b = result;
        }




    }
}
