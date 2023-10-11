public class CycleSort {

    public static void cycleSort(int[] arr) {

        int i = 0;

        while (i < arr.length) {

            int correctIndex = arr[i] - 1;

            if (arr[correctIndex] != arr[i]) {

                swap(arr, i, correctIndex);

            } else {
                i++;
            }
        }
    }

    private static void swap(int[] arr, int i, int correctIndex) {
        int temp = arr[correctIndex];
        arr[correctIndex] = arr[i];
        arr[i] = temp;

    }
}
