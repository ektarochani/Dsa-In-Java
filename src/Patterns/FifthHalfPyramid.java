package Patterns;

public class FifthHalfPyramid {
    public static void main(String [] args){
//        half pyramid of stars
        for (int i = 1; i <=4 ; i++) {
            for(int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
//        half pyramid of no's from 1 to n
        for (int i = 1; i <=10 ; i++) {
            for(int j=1;j<=i;j++){
                System.out.print(" "+j+" ");
            }
            System.out.println(" ");
        }
//        HoloRectangleee
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i==1 || j==1 || i==5 || j==5){
                    System.out.print(" * ");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.println(" ");
        }

    }
}
