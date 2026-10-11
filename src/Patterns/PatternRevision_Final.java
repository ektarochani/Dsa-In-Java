package Patterns;

public class PatternRevision_Final {
    public static void main(String [] args){
//        1.solid rectangle...!
        for(int i=0; i<5 ;i++){
            for(int j=0; j<=5 ;j++){
                System.out.print(" * ");
            }
            System.out.println("");
        }

//        holo rectangle..!!
        for(int i=1; i<=5 ;i++){
            for(int j=1;j<=5;j++){
                if(i==1 || i==5 || j==1 || j==5){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

//        half pyramid..!
        for(int i=1; i<=5; i++){
            for(int j=1 ; j<=i ;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

//        half pyramid in numbers..!!
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }

//        inverted half pyramid...!!
        for(int i=1 ;i<=5; i++){
            for(int j=5;j>=i;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
//          inverted half pyramid with no's...!!
        for(int i=1;i<=5;i++){
            for (int j=5;j>=i;j--){
                System.out.print(j);
            }
            System.out.println("");
        }
//        inverted half pyramid with no's 1 to 5
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
//        inverted half pyramid rotated 180 deg...!!
        int n=5;
        for(int i=1;i<=n;i++){
//            inner loop for spaces n-i
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
//            2nd inner loop for stars..>!!
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

//        inverted half pyramid rotated 180 deg with no's..!
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }

//         fylo triangle..>! 1 23 567 78910 (11 12 13 14 15)
        int numbers=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+numbers+" ");
                numbers++;
            }
            System.out.println("");
        }
//        if i+j=even then 1 odd then 0
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                int sum=i+j;
                if(sum%2==0){
                    System.out.print(" 1 ");
                }
                else{
                    System.out.print(" 0 ");
                }

            }
            System.out.println("");
        }
    }
}
