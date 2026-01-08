import java.util.*;
public class loop 
{
public static void main (String[] args)
{

/*

for(int i=1;i<=5;i++){
for(int j=1;j<=i-1;j++){
System.out.print(" ");

}

for(int k=1;k<=5-i+1;k++){
System.out.print("*");
}

System.out.println();

}

*/

/*
for(int i=1;i<=5;i++){


for(int k=1;k<=5-i+1;k++){
System.out.print("*");
}
for(int j=1;j<=i-1;j++){
System.out.print(" ");

}

System.out.println();

}
*/




        int n = 3;
        for(int i = n; i >= 1; i--) {

            for(int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }

            for(int k = 1; k <= 2*i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i = 1; i <= n; i++) {

            for(int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }

            for(int k = 1; k <= 2*i - 1; k++) {
                System.out.print("*");
            }

 System.out.println();
        }
}

}