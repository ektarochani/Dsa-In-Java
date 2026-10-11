package Patterns;

public class PatternRevision {
    public static void main(String[] args){

//        1:solid rectangle...!!
        for (int i=1;i<=4;i++){
            for (int j=1;j<=5;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();
//        2:holo rectangle...!!
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(i==1|| j==1||i==5||j==5){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println();
//        3:half pyramid...!!
        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();

//        inverted half pyramid...!!
        for(int i=5;i>=1;i--){
            for (int j=i;j>=1;j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println();

//        5:inverted half pyramid roated 180 deg 1 outer loop nd 2 inner loops 1 for spaces and 1 for stars...!
         for (int i=1;i<=5;i++){
//             for white spaces 1st inner loop n-i eg in first row n=5 i=i and 5-1=4 means 4 white spaces...!!
             for (int j=1;j<=5-i;j++){
                 System.out.print("   ");
             }
             for (int k=1;k<=i;k++){
                 System.out.print(" * ");
             }
             System.out.println();
         }
        System.out.println();

//         half pyramid with no's 1 12 123 1234 etc
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

//        inverted half pyramid with no 12345 1234 123 12 1

        for(int i=5;i>=1;i--){
            int counter=1;
            for (int j=i;j>=1;j--){
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }

//        second method
        System.out.println();

        for(int i=5;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

//        floyd's triangle...!!
        int count=1;
        for(int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" "+count);
                count++;
            }
            System.out.println("  ");
        }
    }
}
