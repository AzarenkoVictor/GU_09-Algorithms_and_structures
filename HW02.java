import java.util.Arrays;

public class HW02 {
    public static void main(String[] args) {
        int[] array = { 1, 3, 8, 9, 6, 5, 3, 2, 1, 5, 4, 2, 2, 1, 2 };
        Heapsort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void Heapsort(int array[]) {

        for (int i = array.length / 2 - 1; i >= 0; i--) // Построение кучи (перегруппируем массив)
            heapify(array, array.length, i);

        for (int i = array.length - 1; i >= 0; i--) // Один за другим извлекаем элементы из кучи
        {
            int temp = array[0]; // Перемещаем текущий корень в конец
            array[0] = array[i];
            array[i] = temp;

            // Вызываем процедуру heapify на уменьшенной куче
            heapify(array, i, 0);
        }
    }

    public static void heapify(int array[], int n, int i) {
        int largest = i; // Инициализируем наибольший элемент как корень
        int leftChild = 2 * i + 1; // левый элемент = 2*i + 1
        int rightChild = 2 * i + 2; // правый элемент = 2*i + 2

        if (leftChild < n && array[leftChild] > array[largest]) // Если левый дочерний элемент больше корня
            largest = leftChild;

        if (rightChild < n && array[rightChild] > array[largest])// Если правый дочерний элемент больше, чем самый большой элемент
                                                       // на
            largest = rightChild;

        if (largest != i) { // Если самый большой элемент не корень
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            // Рекурсивно преобразуем в двоичную кучу затронутое поддерево
            heapify(array, n, largest);
        }
    }
}