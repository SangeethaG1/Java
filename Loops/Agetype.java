import java.util.Scanner;
public class Agetype {
    public static void main(String[] args) {
int age;
        System.out.println("Enter age");
        Scanner scanner=new Scanner(System.in);
        age=scanner.nextInt();

        if (age >= 13 && age <= 19)
            System.out.println("The person is a teen");
        else if (age < 13)
            System.out.println("The person is a kid");
        else
            System.out.println("The person is an adult");
    }


    }