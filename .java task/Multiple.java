import java.util.Scanner;
public class MultipleFactor{ 
public static void main (String[] args){

    Scanner input=new Scanner(System.in);
    System.out.print("Enter a number:");
    int number=input.nextInt();
    
    int index=0;
    while(index <= number){
          index++;
          if(number % index == 0){
    System.out.printf("%d " ,index);
    
}
    
    
    }
    
    }
    
    }
