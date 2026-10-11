package AdvancePattern;

public class halfAndFullPyamidNos {
    public static void main(String [] args){
//        pyramid with no's...!!
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println(" ");
        }

//        inverted half pyramid 1111 222 33 4
        for(int i=1;i<=n;i++){
            for(int j=5;j>=i;j--){
                System.out.print(i);
            }
            System.out.println(" ");
        }
    }
}
