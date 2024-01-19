public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(170.0, 70.0, "123-45-6789", "555-1234");
        Person person2 = new Person(165.0, 65.0, "987-65-4321", "555-5678");
        Person person3 = new Person(175.0, 75.0, "123-45-6789", "555-9999");

        System.out.println("person1 equals person2: " + person1.equals(person2));  // false
        System.out.println("person1 equals person3: " + person1.equals(person3));  // true
    }
}