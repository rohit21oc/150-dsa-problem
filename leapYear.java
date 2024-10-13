import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int year = in.nextInt();
        // if(year %4 == 0){
        //     System.out.println(year + " is a leap year");
        // }else{
        //     System.out.println(year + " is not a leap year");
        // }

        System.out.println("Enter the start year: ");
        int startYear = in.nextInt();
        System.out.println("Enter the end year: ");
        int endYear = in.nextInt();

        for(int year = startYear; year<=endYear;year++){
            if(leapyear(year)){
                System.out.println(year + " is a leap year");
            }else{
                System.out.println(year + " is not a leap year");
            }
        }
    }
    public static boolean leapyear(int year){
        if(year %4 ==0){
            if(year % 100 == 0){
                if(year % 400==0){
                    return true;
                }else{
                    return false;
                }
            }
            return true; 
        }
        return false;
    }
}
