package com.company;

import java.io.BufferedReader;
import java.io.*;
import java.util.*;


public class Main {
    public static int n1;
    public static int n2;
    public static String mat;
    public static int result;
    public static String romeNum;

    public static void getMat() {
        try {
            if (mat.contains("+")) {
                result = n1 + n2;
                System.out.println(result);
            }
            else if(mat.contains("-")) {
               result = n1 - n2;
                System.out.println(result);
            }
            else if (mat.contains("/")) {
                result = n1 / n2;
                System.out.println(result);
            }
            else if (mat.contains("*")) {
                result = n1 * n2;
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
BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input");
        mat = read.readLine();

        if(mat.contains("I") || mat.contains("V") || mat.contains("X")) {
            RomeNum.getRomeNum();
        }
        else {
            Num.getNum();
            getMat();
        }

    }

    public static class Num{
        public static void getNum() {
            try {
                n1 = Integer.parseInt(FoundNum.getFoundNum().get(0));
                n2 = Integer.parseInt(FoundNum.getFoundNum().get(2));
                if(mat.contains("I") || mat.contains("V") || mat.contains("X")) {
                    System.exit(0);
                }
                if(n1 > 10 || n2 > 10) {
                    throw new Exception("number greater than 10");
                }
                if(FoundNum.getFoundNum().size() > 3) {
                    throw new Exception("2 numbers and 1 action are accepted for entry");
                }
            }
            catch(Exception e) {
                System.out.println(e);
                System.exit(0);
            }
            }
    }

    public static class RomeNum {

       public static void getRomeNum() {
           try {
               romeNum = FoundRomeNum.getFoundRomeNum();
               System.out.println(romeNum);
           }
           catch(Exception e) {
               System.out.println(e);
               System.exit(0);
           }
       }
    }
}