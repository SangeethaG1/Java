package array;
public class BubbleSort{
    public static void main(String[] args) {
        int a[] = {6, 5, 3, 7, 8};
        int length =a.length;
        for (int i = 0; i < length; i++) {
            System.out.print(a[i] + " ");
        }
        for (int i = 0; i < length; i++) {
            for ( int j = 1; j < length - i; j++) {
                if (a[j - 1] > a[j]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }
        System.out.println( );
        System.out.println("sorted array is:");
            for(int i = 0; i < length; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
    }



