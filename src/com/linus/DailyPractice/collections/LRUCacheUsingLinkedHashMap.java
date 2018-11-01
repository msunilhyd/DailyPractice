package com.linus.DailyPractice.collections;

import java.util.Map.Entry;
import java.util.Set;

public class LRUCacheUsingLinkedHashMap
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee(1009, "Sam", "sam@infotech.com", 90000.00);
		Employee e2 = new Employee(2009, "Ambay", "martin@infotech.com", 30000.00);
		Employee e3 = new Employee(3009, "Joya", "joya@infotech.com", 50000.00);
		Employee e4 = new Employee(4009, "Boya", "harry@infotech.com", 70000.00);
		Employee e5 = new Employee(5009, "Sean", "sean@infotech.com", 80000.00);
		

		Department d1 = new Department(10001, "IT", "Boston");
		Department d2 = new Department(10002, "Finance", "Chennai");
		
		LRUCache<Employee, Department> cache = LRUCache.newInstance(3);
		
		cache.put(e1, d1);
		cache.put(e2, d2);
		cache.put(e3, d2);
		
		cache.put(e4, d2);
		cache.put(e5, d1);
		
		Set<Entry<Employee, Department>> entrySet = cache.entrySet();
		
		for(Entry<Employee, Department> e : entrySet)
		{
			Employee employee = e.getKey();
			Department department = e.getValue();
			
			System.out.println(employee);
			System.err.println(department);
		}
		
	}
}
