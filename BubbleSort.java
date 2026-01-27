public class BubbleSort {

    public static void bubble(int arr[]) {
boolean flag;

        for (int i = 0; i < arr.length - 1; i++) {

flag= false;
            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
if(!flag){
break;
}
        }
    }

    public static void main(String args[]) {

        int arr[] = {5, 4, 7, 3, 1};

        bubble(arr); 

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
