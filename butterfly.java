package AdvancePattern;

public class butterfly {
    public static void butterflyPattern(int n){
        // First half butterfly
        for(int i=1;i<=n;i++){
            // left Star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // Middle spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            // Right star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Second half butterfly
        for(int i=n; i>=1; i--){
            // left Star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // Middle spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            // Right star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        butterflyPattern(5);
    }
}
