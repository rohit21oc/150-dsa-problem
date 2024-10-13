import java.util.*;
public class armStrongNum{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = in.nextInt();
        if(isArmStrong(number)){
            System.out.println(number + " is an Armstrong number");
        }else{
            System.out.println(number + " is not an Armstrong number");
        }
        in.close();
    }

    public static Boolean isArmStrong(int number){
        int originalNumber =number;
        int sum = 0;
        int digitCount = String.valueOf(number).length();

        while(number !=0){
            int digit = number % 10;
            sum += Math.pow(digit, digitCount);
            number /= 10;
        }
        return sum == originalNumber;

    }
}