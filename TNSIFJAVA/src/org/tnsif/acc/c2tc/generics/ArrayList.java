package org.tnsif.acc.c2tc.generics;


import java.util.List;


public class ArrayList {

    public static void main(String[] args) {

        List<String> list = new java.util.ArrayList<>();

        list.add("abc");
        list.add("def");

        for (String str : list) {

            System.out.println(str);
        }
    }
}