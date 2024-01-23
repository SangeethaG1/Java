package oops.src;
public class Paints {

    public static void main(String[] args) {

        Oilpaints oilpaints = new Oilpaints();
        oilpaints.sketch();
        Acrylics acrylics = new Acrylics();
        acrylics.sketch();
    }
    public void sketch() {
        System.out.println("Its a Sketch");
    }
}