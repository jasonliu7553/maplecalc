
import java.util.HashMap;
import java.util.Map;

public class nameToNum {

	final Map<String, Integer> map = new HashMap<>();
	
	public nameToNum() {
		map.put("ring1", 0);
		map.put("ring2", 1);
		map.put("ring3", 2);
		map.put("ring4", 3);
		map.put("cup", 4);
		map.put("pendant1", 5);
		map.put("pendant2", 6);
		map.put("weapon", 7);
		map.put("belt", 8);
		map.put("hat", 9);
		map.put("eye", 10);
		map.put("face", 11);
		map.put("armor", 12);
		map.put("bottom", 13);
		map.put("shoes", 14);
		map.put("earring", 15);
		map.put("shoulder", 16);
		map.put("gloves", 17);
		map.put("android", 18);
		map.put("emblem", 19);
		map.put("badge", 20);
		map.put("medal", 21);
		map.put("secondary", 22);
		map.put("cape", 23);
		map.put("heart", 24);
	}
	
	public Map<String, Integer> getMap() {
		return this.map;
	}
	
}
