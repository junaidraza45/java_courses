package junaid.assign1p;


import java.util.ArrayList;

public class Multiples {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        ArrayList<Integer> x = new ArrayList<Integer>();
        ArrayList<Integer> y = new ArrayList<Integer>();
        int totalforthree = 0;
        int totalforfive = 0;

        int total = 0;

        System.out.print("Multiple of 3 : ");
        for(int temp =0; temp < 100 ; temp++){
            if(temp % 3 == 0){
                System.out.print(","+temp);
                x.add(temp);
                totalforthree += temp;

            }
        }
        System.out.println("");
        System.out.print("Multiple of 7 : ");
        for(int temp =0; temp < 100 ; temp++){
            if(temp % 7 == 0){
                System.out.print(","+temp);
                y.add(temp);
                totalforfive += temp;
            }
        }

        total = totalforfive + totalforthree;

        System.out.println();
        System.out.println("The sum of multiples of 3 or 7 up to 100 are: " + total);


    }
}
