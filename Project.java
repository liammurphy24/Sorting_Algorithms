/**
 * Project
 */
public class Project {

    public static void main(String[] args) {
        int[] arr = {3, 54, 21, 1, 58, 87, 89, 9000, 2, 1};
        System.out.println(arr);

        for(int value : arr) {
            System.out.print(" " + value);
        }

        // BubbleSort(arr);

        System.out.println();

        
        for(int value : arr) {
            System.out.print(" " + value);
        
    }
    }

    public static void BubbleSort(int[] arr) {
        int temp;

        for(int i = 0; i < arr.length -1; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                //swapping
                if(arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j +1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void SelectionSort(int[] arr) {
        int minIndex, temp;

        for(int i = 0; i < arr.length; i++) {
            minIndex = i;

            for(int j = i; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }


            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }
    
    }


    } 


//public static void Swap() {

