public class MergeSortedArraysDemo {

    public static void merge(int[] a, int m, int[] b, int n, int[] r) {
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (a[i] < b[j]) {
                r[k] = a[i];
                k++;
                i++;
            } else {
                r[k] = b[j];
                k++;
                j++;
            }
        }

        while (i < m) {
            r[k] = a[i];
            k++;
            i++;
        }

        while (j < n) {
            r[k] = b[j];
            k++;
            j++;
        }
    }

    public static void main(String[] args) {
        int[] a1 = {1, 3, 5, 7, 9};
        int[] a2 = {2, 4, 5, 6, 8};
        int[] r = new int[10];

        merge(a1, 5, a2, 5, r);

        for (int i = 0; i < 10; i++) {
            System.out.println("r[" + i + "] = " + r[i]);
        }
    }
}

//time complexitty is O(N)
