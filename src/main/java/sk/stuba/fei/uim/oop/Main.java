package sk.stuba.fei.uim.oop;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(104546, "Igor", "Najsel", 22);
        student.printStudent();

        int[] cisla = new int[]{45, 125, 364, 258, 32, 20, 5, 48, 69, 90, 91};
        System.out.println("Pred zmenou: " + Arrays.toString(cisla));

        mergeSort(cisla, cisla.length);

        System.out.println("po zmene: " + Arrays.toString(cisla));
    }

    public static void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    public static void merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
}
