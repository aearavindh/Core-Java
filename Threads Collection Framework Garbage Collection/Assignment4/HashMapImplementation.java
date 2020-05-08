package Assignment4;

import java.util.HashMap;

public class HashMapImplementation {

	public static void main(String[] args) {
		
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("Aragon","6565378989");
		hm.put("Gimli","9867584647");
		hm.put("Legolas","8756575858");
		System.out.println(hm.get("Aragon"));
		System.out.println(hm.get("Gimli"));
		System.out.println(hm.get("Legolas"));
	}

}
