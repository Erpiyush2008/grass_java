import java.util.*;
public class practice

{
public static void main(String [] args){

 Scanner sc=new Scanner(System.in);



/*    7
char letter = sc.next().charAt(0);

if(letter =='a'|| letter =='e'|| letter =='i'|| letter =='o'|| letter =='u'|| 
letter =='A'|| letter =='E'|| letter =='I'|| letter =='O'||  letter =='U'){

System.out.println("vowel");
}

else{

System.out.println("constant");
}


*/

 /*
int number = sc.nextInt();

if(number>=10 && number<=50){

System.out.println("number is lies  the range");

}

else{

System.out.println("number is  not lies  the range");
}  
*/

/*
int a=80;
int b=90;
int c=10;

if(a+b+c == 180){

System.out.println("valid triangle");
}
else{
System.out.println("invalid triangle");
}

*/

/*
int day =sc.nextInt();

if(day==1){
System.out.println("monday");
}

 else if(day==2){
System.out.println("tuesday");
}

 else if(day==3){
System.out.println("Wednesday");
}

 else if(day==3){
System.out.println("thursaday");
}

 else if(day==5){
System.out.println("friday");
}

 else if(day==6){
System.out.println("satuarday");
}

 else if(day==7){
System.out.println("sunday");
}

else{
System.out.println("invalide  case");
}
*/

/*
        int balance = sc.nextInt();
        int amount = sc.nextInt();
        int limit = 20000;

        if (amount > 0 && amount <= balance && amount <= limit) {
            balance = balance - amount;
            System.out.println("Transaction Successful");
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Transaction Failed");
        }

*/
        int year = sc.nextInt();

        if (year % 400 == 0) {
            System.out.println("Century Leap Year");
        } else if (year % 100 == 0) {
            System.out.println("Century Year but Not a Leap Year");
        } else if (year % 4 == 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not leap year");

}


}
}