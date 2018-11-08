package com.linus.DailyPractice.array;

	import java.util.List;
	import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

	 
	public class NextHigherNumber {

	    public static void nextHigherNumber(Integer num) {
	        Integer temp = num;
	        ArrayList<Integer> digits = new ArrayList<Integer>();
	
	        while (temp > 0) {
	            int digit = temp % 10;
	            temp = temp / 10;
	            digits.add(digit);
	        }
	
	        System.out.println(Arrays.toString(digits.toArray()));
	        
	        int j = 0;
	        int i = j + 1;
	
	        if (digits.size() > 1) {
	
	            while (i < digits.size()) {
	                if (digits.get(i) < digits.get(j)) {
	                	System.out.println("digits.get(i) = " + digits.get(i));
	                	System.out.println("digits.get(j) = " + digits.get(j));
	                	
	                    break;
	                }
	                j++;
	                i++;
	            }
	
	            if (i >= digits.size()) {
	                System.out.println("None" );
	                return;
	            }
	
	             
	            j = 0;
	
	            while (j < i) {
	                if (digits.get(j) > digits.get(i))
	                    break;
	                j++;
	            }
	             
	            int dg = digits.get(i);
	            digits.set(i, digits.get(j));
	            digits.set(j, dg);
	        } else {
	            System.out.println("None" );
	            return;
	        }
	
	        List<Integer> subList = digits.subList(0, i);
	        Collections.sort(subList);
	        int m = digits.size() - 1;
	        while (m >= i) {
	            System.out.print(digits.get(m));
	            m--;
	        }
	
	        m = 0;
	        while (m < subList.size()) {
	            System.out.print(subList.get(m));
	            m++;
	        }
	
	        System.out.println();
	
	    }
	
	    public static void main(String args[]) {
	        nextHigherNumber(12543);
	        nextHigherNumber(4132);
	        nextHigherNumber(1234);
	        nextHigherNumber(32841);
	        nextHigherNumber(30102);
	        nextHigherNumber(98765);
	    }
	}