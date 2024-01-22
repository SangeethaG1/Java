package array;
public class RelativeOrder {
    public static void main(String[] args)
    {
        int[] A = { 0, 3, 3, 4, 0, 9, 0, 6 };
        int n = A.length;
        int[] B = new int[n];
        int j = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] != 0) {
                B[j] = A[i];
                j++;
            }
            else {
                count++;
            }
        }
        while (count > 0) {
            B[j] = 0;
            count--;
            j++;
        }
        for (int i = 0; i < n; i++) {
            A[i] = B[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + " ");
        }
    }
}