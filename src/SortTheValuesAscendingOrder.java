class SortTheValuesAscendingOrder
{
    public static void main(String[] args)  // static main method
    {

        //Initialize array
        int [] arr = new int [] {9, 2, 8, 7, 1};
        int temp = 0;

        //Displaying elements of original array
        System.out.println("Elements of original array: " );
        System.out.print(arr[0] + " ");
        System.out.print(arr[1] + " ");
        System.out.print(arr[2] + " ");
        System.out.print(arr[3] + " ");
        System.out.print(arr[4] + " ");

        //Sort the array in ascending order
       for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                   temp = arr[i];
                    arr[i] = arr[j];
                   arr[j] = temp;
                }
            }
        }

        System.out.println();

        //Displaying elements of array after sorting
        System.out.println("Elements of array sorted in ascending order: ");
        for (int j : arr) {
           System.out.print(j + " ");
        }
    }
}



