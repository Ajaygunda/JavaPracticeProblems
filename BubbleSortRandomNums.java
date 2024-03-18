package PracticeProblems;

import java.util.Random;

public class BubbleSortRandomNums {

    public static void main(String[] args) {

        int[] a = new int[9];
        int n=a.length;
        Random r = new Random();
        for(int i=0; i<a.length;i++){
            a[i] = r.nextInt(100);
        }

       //bubble sort
        int i, j, temp;
        boolean swap;
        for (i = 0; i < n - 1; i++) {
            swap = false;
            for (j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swap = true;
                }
            }

            if (swap == false)
                break;
        }

        for (int e:a) {
            System.out.println(e);

        }
    }

}

