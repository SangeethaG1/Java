package array;
public class SimpleSearch {

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        int searchElement = 12;

        int index = linearSearch(array, searchElement);

        if (index != -1) {
            System.out.println("Element " + searchElement + " found at index " + index);
        } else {
            System.out.println("Element " + searchElement + " not found in the array");
        }
    }

    static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
}