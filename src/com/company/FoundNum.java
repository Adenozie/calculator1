package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class FoundNum {
    public static  ArrayList<String> getFoundNum() {
        ArrayList<String> list = new ArrayList<String>();
        Scanner sc = new Scanner(Main.mat); //assign a string to the scanner
        while (sc.hasNext()) {
            list.add(sc.next());  //add it to ArrayList to distribute across indices
        }
        return list;
    }

}
