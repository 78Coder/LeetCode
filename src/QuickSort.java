import java.util.Arrays;

public class QuickSort {

    void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int pos = partition(a, low, high);
            quickSort(a, low, pos - 1);
            quickSort(a, pos + 1, high);
        }
    }

    int partition(int[] a, int low,int high) {
        int pivot = a[low];
        while (low < high) {
            while (low < high && a[high] >= pivot) {
                high--;
            }
            a[low] = a[high];
            while (low < high && a[low] <= pivot) {
                low++;
            }
            a[high] = a[low];
        }
        a[low] = pivot;
        return low;
    }

    public static void main(String[] args) {
    }
}
