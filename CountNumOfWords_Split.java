package PracticeProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class CountNumOfWords_Split {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String n = read.nextLine();
        String[] N = n.split(" ");
        System.out.println("Number of words: "+ N.length);

    }
}
