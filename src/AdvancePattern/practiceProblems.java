package AdvancePattern;

public class practiceProblems {
    public static void main(String [] args) {
        //holo butterfly...!!
        int n=5;
        for(int i =1 ; i<= n; i++){
//            stars
            for(int j=1 ; j<=i ; j++){
                if(j==1 ||  j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            // space
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            // stars..!
            for(int j=1;j<=i;j++){
                if(j==1 || j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        for(int i=n;i>=1;i--){
            //stars
            for(int j=1;j<=i;j++){
                if(j==1 || j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            //space
            for(int j=1; j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(j==1 || j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
