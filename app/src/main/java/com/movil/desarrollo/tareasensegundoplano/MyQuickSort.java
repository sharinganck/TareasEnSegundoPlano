package com.movil.desarrollo.tareasensegundoplano;

/**
 * Created by DiegoArmando on 29/04/2015.
 */
public class MyQuickSort {

    private double[] array;
    private int length;
//Init

    public void sort(double[] inputArr) {

        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        quickSort(0, length - 1);
    }

    private void quickSort(int lowerIndex, int higherIndex) {

        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        double pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        // Divide into two arrays
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which
             * is greater then the pivot value, and also we will identify a number
             * from right side which is less then the pivot value. Once the search
             * is done, then we exchange both numbers.
             */
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }

    private void exchangeNumbers(int i, int j) {
        double temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

   /* public static void main(String a[]){





        MyQuickSort sorter = new MyQuickSort();
        double[] input = {543,65,23,4,7,2,5,6,76,0,4,1,23,4,71,40,2,4};
        sorter.sort(input);
        for(double i:input){
            System.out.print(i);
            System.out.print(" ");
        }
    }*/
}