import java.util.Scanner;
public class PrimeFactor{ 
public static void main (String[] args){

    Scanner input=new Scanner(System.in);
    System.out.print("Enter a number:");
    int number=input.nextInt();
    
    for(int counter=2; counter<number; counter++){
    if(number % counter==0){
    
   }
    System.out.println(counter);
    number=number/counter;
    counter--;
    
    
    }
    
    }
    
    }
