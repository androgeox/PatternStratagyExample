package pattern.strategy.example;

import java.util.Arrays;

/**
 * Created by Georgiy on 18.07.2016.
 */ //Selection sorting strategy (Сортировка выборками)
class SelectionSort implements Sorting {
    public void sort(int[] arr) {
        System.out.println("Сортировка выборками");
        System.out.println("до:\t" + Arrays.toString(arr));
        for (int barier = 0; barier < arr.length - 1; barier++) {
            for (int i = barier + 1; i < arr.length; i++) {
                if (arr[i] < arr[barier]) {
                    int tmp = arr[i];
                    arr[i] = arr[barier];
                    arr[barier] = tmp;

                }
            }
        }
        System.out.println("после:\t" + Arrays.toString(arr));
    }
}
