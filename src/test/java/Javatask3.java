import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Javatask3 {
	public static void main(String[] args) {

		String s = "Aspiresystems";
		String res = "";

		LinkedHashMap<Character, Integer> mp = new LinkedHashMap();

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);

			if (mp.containsKey(c)) {

				Integer count = mp.get(c);
				mp.put(c, count + 1);

			} else {

				mp.put(c, 1);
			}

		}

		Set<Entry<Character, Integer>> entries = mp.entrySet();
		for (Entry<Character, Integer> entry : entries) {

			Integer value = entry.getValue();
			if (value > 1) {

				Character key = entry.getKey();
				System.out.print(key);
				System.out.print(value);

			} else {
				Character c = entry.getKey();
				res = res + c;
			}

		}
		
		System.out.println(res);

	}

}



