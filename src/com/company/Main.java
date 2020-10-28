package com.company;

import java.io.BufferedReader;
import java.io.*;
import java.util.*;


public class Main {
    public static int n1; //Assistant for working with Arabic numerals
    public static int n2; //Assistant for working with Arabic numerals
    public static String mat; //Assistant for working with Arabic numerals
    public static int result; //outputs the result of Arabic numerals
    public static String romeNum; //outputs the result of Rome numerals

    public static void getMat() { //check what action the string does
        try {
            if (mat.contains("+")) {
                result = n1 + n2;
                System.out.println("Output:");
                System.out.println(result);
            }
            else if(mat.contains("-")) {
               result = n1 - n2;
                System.out.println("Output:");
                System.out.println(result);
            }
            else if (mat.contains("/")) {
                result = n1 / n2;
                System.out.println("Output:");
                System.out.println(result);
            }
            else if (mat.contains("*")) {
                result = n1 * n2;
                System.out.println("Output:");
                System.out.println(result);
            }
            else {
                throw new Exception("no mathematical action");
            }
        } catch(Exception e) {
            System.out.println(e);
            System.exit(0);
        }
    }
    public static void main(String[] args) throws IOException {
BufferedReader read = new BufferedReader(new InputStreamReader(System.in)); //Input string
        System.out.println("Input:");
        mat = read.readLine();                                              //assigns written in line

        if(mat.contains("I") || mat.contains("V") || mat.contains("X")) { //check Rome numerals or Arabic numerals
            RomeNum.getRomeNum();
        }
        else {
            Num.getNum();
            getMat();
        }

    }

    public static class Num{                                            //work with Arabic numerals
        public static void getNum() {
            try {
                n1 = Integer.parseInt(FoundNum.getFoundNum().get(0)); //take 2 digits from the string in another class
                n2 = Integer.parseInt(FoundNum.getFoundNum().get(2));

                if(n1 > 10 || n2 > 10) {                            //checking that the number is not more than 10
                    throw new Exception("number greater than 10");
                }
                if(FoundNum.getFoundNum().size() > 3) {            //checking that there are no more than 2 numbers and one action
                    throw new Exception("2 numbers and 1 action are accepted for entry");
                }
            }
            catch(Exception e) {
                System.out.println(e);
                System.exit(0);
            }
            }
    }

    public static class RomeNum {                              //work with Roman numerals

       public static void getRomeNum() {
           try {
               romeNum = FoundRomeNum.getFoundRomeNum();  //we go to another class for an answer
               System.out.println(romeNum);
           }
           catch(Exception e) {
               System.out.println(e);
               System.exit(0);
           }
       }
    }
}