// Coded by: Paul Hughes
// Date: 10/3/2020
// Referenced from: "The Algorithm Design Manual" by Steven S. Skiena

class InsertionSort {

    // 1.) Define the InsertSort function
    void sort(int array[]) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            // 2.) Move the elements of the array that are greater than the key.
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j -1;
            }
            array[j + 1] = key;
        }

    }
    // 3.) Create a utility function to print the array of size n
    static void printArray(int array[]) {
        int n = array.length;
        for (int i = 0; i < n; ++i) System.out.print ( array[i] + " " );
        System.out.println ();
    }


    // 4.) The main function to output to console.
    public static void main(String args[]) {

        int array[] = { 10, 250, 3, 24, 35,};
        InsertionSort ob = new InsertionSort ();
        ob.sort(array);
        printArray ( array );
    }
}