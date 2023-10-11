public class SelectionSort {
    public static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int min = arr[i];

            int indexOfMin = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < min) {

                    min = arr[j];

                    indexOfMin = j;
                }
            }
            swap(arr, i, indexOfMin);
        }
    }

    private static void swap(int[] arr, int i, int indexOfMin) {
        int temp = arr[i];
        arr[i] = arr[indexOfMin];
        arr[indexOfMin] = temp;
    }
}
