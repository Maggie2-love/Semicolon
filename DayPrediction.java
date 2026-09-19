import java.util.Scanner;
public class DayPrediction{ 
public static void main (String[] args){

    Scanner input=new Scanner(System.in);
    System.out.print("How many days ?");
    int number=input.nextInt();
    
    if(number%7==0){
    System.out.println("Monday");
    }

 if(number%7==1){
    System.out.println("Tuesday");
    }

 if(number%7==2){
    System.out.println("Wednesday");
    }
    
     if(number%7==3){
    System.out.println("Thursday");
    }
    
     if(number%7==4){
    System.out.println("Friday");
    }
    
     if(number%7==5){
    System.out.println("Saturday");
    }
    
     if(number%7==6){
    System.out.println("Sunday");
    }
    }
} 






