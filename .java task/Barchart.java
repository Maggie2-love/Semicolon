import java.util.Scanner;
public class Barchart{ 
public static void main (String[] args){

    Scanner input=new Scanner(System.in);
    System.out.print("Enter five numbers between 1 and 30");
    int number=input.nextInt();
    if(number>=1 && number<=30) {
    for(int count=1; count<=number; count++) {
     
      System.out.println("*");
     }
     }else{
     System.out.println("Invalid number. Enter a number between 1 and 30");    
     }
    
    }
    
    }
    
    
