package PracticeProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class CountNumOfWords_charAt {

    public static void main(String[] args) {

        //ArrayList<String> a = new ArrayList<>();
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String n = read.nextLine();
        int cnt = 0;
        for(int i=0; i<n.length();i++){
            if(n.charAt(i)== 32){
                cnt++;
            }

        }
        int finalCnt = cnt+1;
        System.out.println("number of words: "+ finalCnt );





    }

}
