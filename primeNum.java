import java.util.Scanner;

public class primeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();

        if(isPrime(number)){
            System.out.println(number + " is a prime number");
        }else{
            System.out.println(number + " is not a prime number");
        }
    }
    public static boolean isPrime(int number){
        if(number <= 1){
            return false;
        }
        for(int i = 2;i<Math.sqrt(number);i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
        
    }
}
