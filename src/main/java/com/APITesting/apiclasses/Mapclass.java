package com.APITesting.apiclasses;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Mapclass {
	@Test
	public void map() {

		Map<String, Object> hm = new HashMap<String, Object>();
		hm.put("a", 100);
		hm.put("b", 200);
		hm.put("c", 300);
		hm.put("d", 400);

		// Set<Map.Entry<String, Integer>> st = hm.entrySet();
		
//		for(Object value : hm.values())
//		{
//			System.out.println(value.toString());
//		}

		for (String key : hm.keySet()) {

			//System.out.println(hm.get(key));

			Assert.assertTrue(hm.containsKey(key));
			//Assert.assertEquals(hm.get(key), hm.get(key));
			//System.out.println(key.equals(key.toString()));
			// System.out.print(me.getKey() + ":");
			// System.out.println(me.getValue());
			
		}
	}
}
