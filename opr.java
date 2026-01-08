import java.util.*;
public class opr

{

public static int add(int a,int b){

return a+b;

}
public static int sub(int a,int b){

return a-b;

}
public static int mul(int a ,int b){

return a* b;


}
public static int div(int a, int b){

return a/b;

}
public static void main(String [] args){


Scanner sc = new Scanner(System.in);
 System.out.println("enter the first value ");
int x= sc.nextInt();

 System.out.println("enter the second  value ");

int y = sc.nextInt();

 System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);

switch(op){

  case '+':
              System.out.println(add(x,y));
                break;

  case '-':
              System.out.println(sub(x,y));
                break;
  case '*':
              System.out.println(mul(x,y));
                break;
  case '/':
              System.out.println(div(x,y));
                break;
 default:
System.out.println("nothing else");


}




}
}