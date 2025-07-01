package com.demo.collections;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import com.demo.exceptions.Emp;

public class EmpMap {

	public static void main(String[] args) {
		//Map<Integer, Emp> empMap= new HashMap<Integer, Emp>();
		Map<Integer, Emp> empMap= new LinkedHashMap<Integer, Emp>();
		
		empMap.put(10, new Emp(10, "arun"));
		empMap.put(11, new Emp(11, "kiran"));
		empMap.put(12, new Emp(12, "ranga"));
		empMap.put(13, new Emp(13, "viswa"));
		empMap.put(14, new Emp(14, "raju"));
		
		System.out.println(empMap);
		
		Set<Integer> keys=empMap.keySet();
		
		for(Integer key:keys) {
			System.out.println(key+" ---- "+empMap.get(key));
		}
		
		
		Collection<Emp> emps=empMap.values();
		
		for(Emp e:emps) {
			System.out.println(e);
		}
		
		Set<Map.Entry<Integer, Emp>> entrySet=empMap.entrySet();
		for(Map.Entry<Integer, Emp> entry: entrySet) {
			System.out.println(entry.getValue());
		}
				

	}

}
