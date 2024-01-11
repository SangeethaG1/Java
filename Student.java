public class Student {
    String name;
    public String getName()
    {
        name="Geetha";
        return name;
    }

    public static void main(String[] args) {
        Student S1 = new Student();
        System.out.println(S1.getName());
    }
}