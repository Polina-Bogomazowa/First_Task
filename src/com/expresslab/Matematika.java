package com.expresslab;



public class Matematika {
    public static void main (String[]args){

        for(int i=0; i<10000;i++){
            if ( i% 7==0 & i!=0){

                System.out.println(i);
            }

        }
    }
}
/////////////////////////////////////

/*  public class Matesha {
    public static void main (String[]args){
        double SumOfNumbers=0;
        double SrArifm=0;
        int kolichestwo=0;
        for(int i=0;i<=200;i++){
            if(i%10==0 & i!=0){
                System.out.println(i);

                kolichestwo++;
                SumOfNumbers+=i;
            }



        }
        SrArifm=SumOfNumbers/kolichestwo;
        System.out.println("среднее арифметическое = " + SrArifm);

    }
}
*/