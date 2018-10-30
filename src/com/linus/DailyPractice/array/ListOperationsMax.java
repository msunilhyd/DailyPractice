package com.linus.DailyPractice.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class ListOperationsMax
{
	public static void main(String[] args) 
	{
        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        String[] arr = name.split(" ");
        
        int sizeOfArray = Integer.parseInt(arr[0]);
        int noOfOps = Integer.parseInt(arr[1]);
        
        int a;
        int b;
        int k;
        
        int ans[] = new int[sizeOfArray+1];
        for(int i=1;i<=sizeOfArray;i++)
        {
        	ans[i] = 0;
        }
        int max = ans[0];
        for(int i=0;i<noOfOps;i++)
        {
            String ops = s.nextLine();
            String[] opsArr = ops.split(" ");
            a = Integer.parseInt(opsArr[0]);
            b = Integer.parseInt(opsArr[1]);
            k = Integer.parseInt(opsArr[2]);
            
            for(int j=a-1;j<=b-1;j++)
            {
            	ans[j] += k;
            	if(ans[j] > max)
            	{
            		max = ans[j];
            	}
            }
        }
        s.close();
        System.out.println(max);
	}
}
