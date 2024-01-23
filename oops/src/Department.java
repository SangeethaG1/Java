package oops.src;
public abstract class Department {
    abstract int getDepartmentSize();

    public static void main(String[] args)
    {
        SubDepartment sub = new SubDepartment();
        System.out.println(sub.getDepartmentSize());
    }



}
