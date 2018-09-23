package junaid.assign1p;

public class Fibonacci {

    public static void main(String a[]) {
        int Fibcnt = 25;
        int[] feb = new int[Fibcnt];
        feb[0] = 0;
        feb[1] = 1;
        for (int i = 2; i < Fibcnt ; i++) {
            feb[i] = feb[i - 1] + feb[i - 2];
            if(feb[i] < 1000 ) {
                System.out.print(feb[i] + " ");
            }else{
                break;
            }
        }




        int sum_odd = 0;

        for (int i = 0; i < feb.length; i++) {
            if (feb[i] % 2 == 1 && feb[i] < 1000) {
                sum_odd += feb[i];
                //System.out.print(feb[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Total of odd numbers: " + sum_odd);
    }
}

