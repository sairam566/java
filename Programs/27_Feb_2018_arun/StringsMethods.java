public class StringsMethods {

	public static String addAtTheRate(String str) {
		return str.trim().replaceAll(" ", "@");
	}

	public static String reverseWord(String str) {
		String result = "";
		String[] words = str.trim().split(" ");
		for (String x : words) {
			for (int i = x.length() - 1; i >= 0; i--) {
				result += x.charAt(i) + "";
			}
			result += " ";
		}
		return result.trim();
	}

	public static String characterCombine(String str1, String str2) {
		String subStr = "", result = "";
		if (str1.length() > str2.length()) {
			subStr = str1.substring(str2.length(), str1.length());
			str1 = str1.replaceFirst(subStr, "");
		}
		if (str2.length() > str1.length()) {
			subStr = str2.substring(str1.length(), str2.length());
			str2 = str2.replaceFirst(subStr, "");
		}
		for (int i = 0; i < str1.length(); i++) {
			result += str1.charAt(i) + "" + str2.charAt(i);
		}

		return result + subStr;
	}

	public static String Gsequence(String str) {
		int count = 0;
		int dotCount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '.') {
				dotCount++;
			}
		}

		for (int i = 0; str.charAt(i) != '.'; i++) {
			count++;
		}

		String subIndex = str.substring(0, count);
		String lastIndex = str.substring(str.length() - count, str.length());
		// int endIndex=Integer.valueOf(lastIndex);
		String result = "";

		int startIndex = Integer.valueOf(subIndex);

		for (int i = 0; i <= dotCount; i++) {
			result += startIndex + " ";
			startIndex++;
		}

		return result + lastIndex;
	}

	public static String noName(String str) {
		String[] num = str.split(",");
		String result = "";
		for (String x : num) {
			if (x.length() <= 2) {
				result += x + " ";
			}
			if (x.length() > 2) {
				result += Gsequence(x) + " ";
			}

		}
		return result.trim();
	}

	public static int getMissingNo(int a[]) {

		int i, total, n = a.length;
		total = (n + 1) * (n + 2) / 2;
		for (i = 0; i < n; i++)
			total -= a[i];
		return total;
	}

	public static void main(String[] args) {

		String atTheRate = "cat dog mat egg";
		String name = "Talent Sprint";
		String name1 = "Sairam", name2 = "Arun";
		String sequence = "1,2,3,6..9,15,16,19,21,24..28,33";
		String x = "1..2";
		int[] array = { 1, 2, 3, 4, 6, 7 };
		// System.out.println(addAtTheRate(atTheRate));
		// System.out.println(reverseWord(name));
		// System.out.println(characterCombine(name1, name2));
		// noName(sequence);
		// System.out.println(noName(sequence));
		System.out.println(getMissingNo(array));
	}
}