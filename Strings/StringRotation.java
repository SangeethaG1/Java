package Strings;
public class StringRotation{
    public static void main(String[] args) {
        String str1 = "JavaJ2eeStrutsHibernate";
        String str2 = "StrutsHibernateJavaJ2ee";

        boolean isRotation = isRotation(str1, str2);
        System.out.println("Is '" + str2 + "' a rotation of '" + str1 + "'? " + isRotation);
    }
    private static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length() || s1.isEmpty() || s2.isEmpty()) {
            return false;
        }
        String concatenatedString = s1 + s1;
        return concatenatedString.contains(s2);
    }
}