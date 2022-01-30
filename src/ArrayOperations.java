public class ArrayOperations {
    /**
     * Empty constructor for class
     */
    public ArrayOperations() {};

    public static void Print1DArray(int[] arrayPrint) {
        int size = arrayPrint.length;

        for(int i = 0; i < size; i++) {
            if (i < (size - 1)) {
                System.out.print(arrayPrint[i] + ", ");
            } else {
                System.out.println(arrayPrint[i] + "\n");
            }
        }
    }

    /**
     *
     * @param A 1D integer array
     * @param B 1D integer array
     * @return boolean True or False if arrays are equal
     */
    public static boolean Equals(int[] A, int[] B) {
        boolean isEqual = false;
        int sizeA = A.length;
        int sizeB = B.length;

        if (sizeA == sizeB) {
            for (int i = 0; i < sizeA; i++) {
                if (A[i] == B[i]) {
                    isEqual = true;
                } else {
                    return isEqual = false;
                }
            }
        }

        return isEqual;
    }

    /**
     *
     * @param A 1D integer array
     * @param B 1D integer array to be spliced into array A
     * @param copyAmount Amount of array B to be copied
     * @return A new array with array A and a specified portion of array B copied
     */
    public static int[] Copy(int[] A, int[] B, int copyAmount) {
        int[] newArray = new int[copyAmount + A.length];

        if (copyAmount < B.length) {
            for (int i = 0; i < A.length; i++) {
                newArray[i] = A[i];
            }

            for (int i = 0; i < copyAmount; i++) {
                newArray[i + A.length] = B[i];
            }
        } else {
            System.out.println("Error: Amount to copy is larger than Length of second array");
        }

        return newArray;
    }

    /**
     *
     * @param A 2D Array to add sum between
     * @param B 2D Array to add sum between
     * @param rowA Desired row of array A to sum
     * @param rowB Desired row of array B to sum
     * @return
     */
    public static int SumRows(int[][] A, int[][] B, int rowA, int rowB) {
        int sizeA = A[0].length;
        int sizeB = B[0].length;
        int sum = 0;

        if (sizeA == sizeB) {
            if (rowA < A.length && rowB < B.length) {
                for (int i = 0; i < sizeA; i++) {
                    sum = sum + A[rowA][i] + B[rowB][i];
                }
            } else {
                System.out.println("Error: Desired rows to sum exceed array index");
            }
        } else {
            System.out.println("Error: Arrays are not the same length");
        }

        return sum;
    }

    /**
     *
     * @param A 1D int array to compare
     * @param B 1D int array to compare
     * @return The Hamming distance value found between the two arrays passed in
     */
    public static int HammingDistance(int[] A, int[] B) {
        int distance = 0;
        int size = A.length;

        for(int i = 0; i < size; i++) {
            if (A[i] <= 1 && A[i] >= 0 && B[i] <= 1 && B[i] >= 0) {
                if (A[i] != B[i]) {
                    distance++;
                }
            } else {
                System.out.println("Error: Array values must be 0 or 1. Returning -1 as error");
                return distance = -1;
            }
        }

        return distance;
    }

    /**
     *
     * @param sortedArray Takes in an Array previously sorted
     * @param startingIndex Lower limit of the array to search between
     * @param lastIndex Highest limit of the array to search between
     * @param key The desired value searched for
     * @return Returns the method again to run recursvely or a -1 to throw an error
     */
    public static int BinarySearch(int[] sortedArray, int startingIndex, int lastIndex, int key) {
        int mid = startingIndex + (lastIndex - startingIndex) / 2;

        if (lastIndex >= startingIndex) {
            if (sortedArray[mid] == key)
                return mid;

            if (sortedArray[mid] > key) {
                return BinarySearch(sortedArray, startingIndex, mid - 1, key);
            } else {
                return BinarySearch(sortedArray, mid + 1, lastIndex, key);
            }
        }

        return -1;
    }
}
