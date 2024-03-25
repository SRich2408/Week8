import java.util.Scanner; 

public class Factorial {
    public static void main (String[] args){
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = userInput.nextInt();
        int factorial = 1;
        
        userInput.close();

        for(int number = 1; number <= num; number++ ){

            factorial = factorial * number;
            System.out.println(number);
            
        }
        System.out.println(factorial);
        

    }
}