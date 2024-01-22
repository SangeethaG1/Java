package loops;
public class Reverse {

    public static void main(String[] args)
    {

        int num=78954;
        while(num!=0) {
            int i =num%10;
            System.out.print(i);
            num=num/10;

        }
    }

}