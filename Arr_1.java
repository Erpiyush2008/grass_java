import java.util.Scanner;

class Arr_1 {


 public static void display1(int arr[]){

for(int i=0;i<arr.length;i++)
{

System.out.print(arr[i] + " ");
}

}

public static void display2(int arr[]){
int i=0;
while(i<arr.length){
System.out.print(arr[i] + " ");
i++;
}

}


public static void display3(int arr[]){
int i=0;

do{
System.out.print(arr[i] + " ");
i++;
}while(i<arr.length);


}

 public static void display4(int arr[]){

for(int i:arr){

System.out.print(i + " ");
}

}

    public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);

   int[] arr = new int[5];

for(int i=0;i<5;i++){
arr[i]= sc.nextInt();
}

display1(arr);
System.out.println();
display2(arr);
System.out.println();
display3(arr);
System.out.println();
display4(arr);




 }
}
