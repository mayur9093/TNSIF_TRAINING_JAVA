package org.tnsif.acc.c2tc.Collections;


import java.util.List;
import java.util.Vector;
public class Vector1Demo {
    

	public static void main(String[] args) {
	    List<Integer> numbers=new Vector<>();
	    
	    numbers.add(10);
	    numbers.add(20);
	    numbers.add(30);
	    numbers.add(40);
	    
	    System.out.println("First number "+ numbers.get(0));
	    
	    numbers.set(1,25);
	    System.out.println(numbers);
	    
	    numbers.remove(3);
	    System.out.println(numbers);
	    
	    if(numbers.contains(10))
	    {
	    	System.out.println("10 is present");
	    }
	    else
	    {
	    	System.out.println("10 is not present");
	    }
         
        Iterable<Integer> iterableFruits = numbers;

        System.out.println("Traversing using Iterable: "+ iterableFruits);

	    
	    for(Integer num  :numbers)
	    {
	    	System.out.println(num);
	    }
	    
	    System.out.println("Size of vector data: " + numbers.size());
	    
	    numbers.clear();
	    System.out.println("List after clear operation: " + numbers);
	}
}

