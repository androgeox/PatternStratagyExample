package pattern.strategy.example;

import java.util.Arrays;

/**
 * Created by Georgiy on 18.07.2016.
 */ //Inserting sorting strategy (Сортировка вставками)
class InsertingSort implements Sorting {
    public void sort(int[] arr) {
        System.out.println("Сортировка вставками");
        System.out.println("до:\t" + Arrays.toString(arr));
        for (int barier = 1; barier < arr.length; barier++) {
            int index = barier;
            while (index - 1 >= 0 && arr[index] < arr[index - 1]) {
                int tmp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = tmp;
                index--;
            }
        }
        System.out.println("после:\t" + Arrays.toString(arr));
    }
}
