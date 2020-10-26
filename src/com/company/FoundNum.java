package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class FoundNum {
    public static  ArrayList<String> getFoundNum() {
        ArrayList<String> list = new ArrayList<String>();
        Scanner sc = new Scanner(Main.mat);
        while (sc.hasNext()) {
            list.add(sc.next());
        }
        return list;
    }

}
