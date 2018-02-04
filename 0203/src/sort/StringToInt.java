package sort;

public class StringToInt {
	public static void main3(String[] args) {
		String s = "-214748";
		String2Int(s);
	}

	public static void String2Int(String s) {
		int len = s.length();
		int res = 0, i = 0;
		if (s.charAt(i) == '-') {
			++i;
			while (i < len) {
				res = 10 * res + (s.charAt(i) - 48);
				++i;
			}
			System.out.println(res * (-1));
		}

	}
}
