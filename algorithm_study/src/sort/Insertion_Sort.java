package sort;

public class Insertion_Sort {

    private static void insertion_sort(int[] a){
        insertion_sort(a, a.length);
    }

    private static void insertion_sort(int[] a, int size){

        for (int i = 1; i<size; i++){
            int target = a[i];

            int j = i - 1;

            while (j >= 0 && a[j] > target){
                a[j + 1] = a[j];
                j--;
            }

            // i 가 아니라 j + 1 인 이유는 위치가 바뀌기 때문에
            a[j + 1] = target;
        }

    }

}
