package heapsort;

public class HeapSort {

    public static void sort(int[] array) {
        // build a heap
        for (int i = array.length / 2 - 1; i >= 0 ; i--) {
            heapify(array, array.length, i);
        }
        for (int i = array.length - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);

        }


    }
    private static void heapify(int[] array, int heapSize, int rootIndex) {
        int largest = rootIndex; //the largest element of the array
        int leftChild = 2 * rootIndex + 1;
        int rightChild = 2 * rootIndex + 2;

        // if leftChild > largest -> largest = leftChild
        if (leftChild < heapSize && array[leftChild] > array[largest]) largest = leftChild;

        // if rightChild > largest -> largest = rightChild
        if (rightChild < heapSize && array[rightChild] > array[largest]) largest = rightChild;

        // if largest not rootIndex(left or right child)
        if (largest != rootIndex){
            int temp = array[rootIndex];
            array[rootIndex] = array[largest];
            array[largest] = temp;

            heapify(array, heapSize, largest);
        }


    }
}
