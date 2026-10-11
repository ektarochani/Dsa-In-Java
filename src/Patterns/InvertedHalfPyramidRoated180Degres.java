package Patterns;

public class InvertedHalfPyramidRoated180Degres {
        public static void main(String []args){
            int n=5;
//        outer loop
            for (int i=1;i<=5;i++){
//            inner loop-space
                for(int j=1;j<=5;j++){
                    if(j<=5-i){
                        System.out.print(" ");
                    }
                    else {
                        System.out.print("*");
                    }
                }
                System.out.println("");
            }

//
        }
}

