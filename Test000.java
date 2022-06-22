
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapPrint 
	{
		public static void main(String[] args) 
	{
// HashMap ¡ÿ∫Ò
Map<Integer, String> map = new HashMap<Integer, String>();
map.put(1, "Apple");
map.put(2, "Banana");
map.put(3, "Orange");
// for loop (entrySet())
for (Entry<Integer, String> entrySet : map.entrySet()) {
System.out.println(entrySet.getKey() + " : " + entrySet.getValue());
}
}
}
