class InsertionSort {
    void sort(int array[]) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j -1;
            }
            array[j + 1] = key;
        }

    }
    static void printArray(int array[]) {
        int n = array.length;
        for (int i = 0; i < n; ++i) System.out.print ( array[i] + " " );
        System.out.println ();
    }




    public static void main(String args[]) {

        int array[] = { 10, 250, 3, 24, 35,};

        InsertionSort ob = new InsertionSort ();
        ob.sort(array);
        printArray ( array );
    }
}