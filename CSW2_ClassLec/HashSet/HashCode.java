package HashSet;
import java.util.*;
public class HashCode {

	public static void main(String[] args) {
		HashMap<Integer,String> hmap1=new HashMap<Integer,String>();
		hmap1.put(10,"ball");
		hmap1.put(20,"Bat");
		hmap1.put(30,"Wicket");
		hmap1.put(40,"Tennis bat");
		
		System.out.println("----------HashMap-----------");
		for(Map.Entry m:hmap1.entrySet()) {
			System.out.println(m.getKey()+"-6+"+m.getValue());
		}
		
		// TODO Auto-generated method stub

	}

}
