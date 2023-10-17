package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);
        printArray(sortArray(myIntegers));

    }

    private static int[] getIntegers(int number){
        int [] array = new int[number];
        System.out.println("Please enter " + number  + " integers to be sorted");
        for (int i= 0; i <array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static void printArray(int[] array){
        for (int i= 0; i< array.length; i++){
            System.out.println("Array at position " + i + " has value " + array[i]);
        }
    }

    private static int[] sortArray(int[] array) {
        boolean sorted = true;
        int temp;
        int[] sortedArray = array.clone();
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }
        while (sorted) {
            sorted = false;
            for (int j = 0; j < array.length - 1; j++) {
                if (sortedArray[j] < sortedArray[j + 1]) {
                    temp = sortedArray[j];
                    sortedArray[j] = sortedArray[j + 1];
                    sortedArray[j + 1] = temp;
                    sorted = true;
                }
            }
        }
        return sortedArray;
    }
}
