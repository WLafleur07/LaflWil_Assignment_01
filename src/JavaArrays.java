/**
 *   William Lafleur
 *   Date: February 1st, 2022
 *   Description: In this assignment I built a class that performs a few operations on the array(s) passed to
 *   them:
 *   1. Determine if two arrays are equal.
 *   2. Copy a portion of a given array to a new array.
 *   3. Calculate the sum of the rows in a 2-dimensional array (or matrix).
 *   4. Calculate the Hamming distance between two arrays.
 *   5. Perform a recursive binary search for a key in a sorted array (see below for more details).
 */

public class JavaArrays {
    public static void main(String[] args) {
        ArrayOperations operations = new ArrayOperations();

        int[] arrayAtoCompare = {1, 2, 3, 4, 5};
        int[] arrayBtoCompare = {1, 2, 3, 4, 5};
        System.out.printf("Array A = Array B?: %s", operations.Equals(arrayAtoCompare, arrayBtoCompare));
        System.out.print("\n");

        /* Testing of Copy method */
        int[] arrayAtoCopy = {1, 2, 3, 4, 5};
        int[] arrayBtoCopy = {6, 7, 8, 9, 10};
        int[] newArray = operations.Copy(arrayAtoCopy, arrayBtoCopy, 4);
        operations.Print1DArray(newArray);

        /* Testing of SumRows method */
        int[][] arrayAtoSum = {{1, 2, 3, 4, 5},{19, 16, 3, 2, 21}, {9, 3, 2, 8, 2}};
        int[][] arrayBtoSum = {{6, 7, 8, 9, 10},{11, 7, 24, 9, 10}, {99, 7, 41, 9, 70}};
        int sum = operations.SumRows(arrayAtoSum, arrayBtoSum, 0, 0);
        System.out.println(sum);
        System.out.print("\n");

        /* Testing of HammingDistance method */
        int[] arrayA = {1, 0, 0, 1, 1};
        int[] arrayB = {0, 1, 0, 1, 0};
        int distance = operations.HammingDistance(arrayA, arrayB);
        System.out.printf("Hamming distance is: %d\n", distance);
        System.out.print("\n");

        /* Testing of BinarySearch method */
        int[] arrayToSearch = {0, 22, 44, 68, 100, 255, 344, 371};
        int key = 371;
        int value = operations.BinarySearch(arrayToSearch, 0, arrayToSearch.length, key);
        System.out.printf("Key: %d found at Index: %d", key, value);
        System.out.print("\n");
        key = 0;
        value = operations.BinarySearch(arrayToSearch, 0, arrayToSearch.length, key);
        System.out.printf("Key: %d found at Index: %d", key, value);
        System.out.print("\n");
        key = 100;
        value = operations.BinarySearch(arrayToSearch, 0, arrayToSearch.length, key);
        System.out.printf("Key: %d found at Index: %d", key, value);
        System.out.print("\n");
        key = 44;
        value = operations.BinarySearch(arrayToSearch, 0, arrayToSearch.length, key);
        System.out.printf("Key: %d found at Index: %d", key, value);
        System.out.print("\n");

    }
}

