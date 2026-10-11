package AdvancePattern;

public class ButteryFlyPattern {
    public static void main(String [] args){
        int n=4;
        int space=2*n;
        for(int i=1;i<=n;i++){
//            stars first part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
//            spaces second part
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
//            stars 3rd part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println("");
        }
        for(int i=n;i>=1;i--){
//            stars f-part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
//            spaces s-part
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
//            stars t-part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
