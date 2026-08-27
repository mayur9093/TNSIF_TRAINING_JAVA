package org.tnsif.acc.c2tc.Collections;

import java.util.Stack;

public class StackDemo2 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
     stack.push(34); 
       stack.push(56); 
       stack.push(78); 
       stack.push(90); 
           
       System.out.println("Pos of 34 : "+stack.search(34));
       System.out.println("Pos of 56 : "+stack.search(90));
    }
    
}
