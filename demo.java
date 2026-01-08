import java.util.Scanner;
public class demo
{
public static void main (String[] args)
{
/*
int a=10;
float b=19.0f;
byte c=15;
double d= 14.0;
long f=17;
 String name= "piyush";

System.out.println("hello world");

System.out.println(a);

System.out.println(b);

System.out.println(c);

System.out.println(d);

System.out.println(f);

System.out.println(name);
*/

/*
int age =25;




if(age==0||age==100){

System.out.println("invlaid case");

}
else if(age>=18){

System.out.println("eligible for vote");

}

else{
System.out.println("not eligible for vote");

}
*/


 Scanner sc = new Scanner(System.in);
 int marks = sc.nextInt();
if (marks<=33){
System.out.print("student are fail");

}
else if(marks<=45){
 
System.out.print("student are  D grade");

}

else if(marks<=75){
 
System.out.print("student are  c grade");

}
else if(marks<=85){
 
System.out.print("student are   B grade");

}
else{
System.out.println("student are A grade ");
}

}
}
