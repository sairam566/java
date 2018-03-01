public class StringsMethods {

	public static String addAtTheRate(String str) {
		return str.trim().replaceAll(" ", "@");
	}

	public static String reverseWord(String str) {
		String result = "";
		String[] words = str.trim().split(" ");
		for (String x : words) {
			for (int i = x.length() - 1; i >= 0; i--) {
				result += x.charAt(i);
			}
			result += " ";
		}
		return result.trim();
	}

	public static String characterCombine(String str1, String str2) {
		String subStr = "", result = "";
		if (str1.length() > str2.length()) {
			subStr = str1.substring(str2.length(), str1.length());

		}
		if (str2.length() > str1.length()) {
			subStr = str2.substring(str1.length(), str2.length());

		}
		int sub = subStr.length();
		for (int i = 0; i < str1.length() - sub; i++) {
			result += str1.charAt(i) + "" + str2.charAt(i);
		}

		return result + subStr;
	}

	public static String Gsequence(String str) {
		int count = 0;
		int dotCount = 0;

		for (int i = 0; str.charAt(i) != '.'; i++) {
			count++;
		}

		String subIndex = str.substring(0, count);
		String lastIndex = str.substring(str.length() - count, str.length());
		int endIndex = Integer.valueOf(lastIndex);
		int startIndex = Integer.valueOf(subIndex);

		String result = "";

		for (int i = startIndex; i < endIndex; i++) {
			result += i + " ";

		}
		// System.out.println(result+lastIndex);
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
				// System.out.println(x);
				result += Gsequence(x) + " ";
			}

		}
		return result.trim();
	}

	public static int getMissingNo(int a[]) {

		int diff = findDifference(a);
		int startNo = a[0];

		for (int i = 0; i < a.length; i++) {
			// System.out.print(startNo+" ");
			if (a[i] != startNo) {
				return startNo;
			}

			startNo += diff;
		}

		// int i, total, n = a.length;
		// total = (n + 1) * (n + 2) / 2;
		// for (i = 0; i < n; i++)
		// total -= a[i];
		return -1;
	}

	public static int findDifference(int[] x) {
		int diff = 0, count = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i + 1] - x[i] == x[i + 2] - x[i + 1]) {
				diff = x[i + 1] - x[i];
				count++;
			}
			if (count == 2)
				break;
		}
		return diff;
	}

	public static void main(String[] args) {

		String atTheRate = "cat dog mat egg";
		String name = "Talent Sprint";
		String name1 = "SAIRAM", name2 = "thadi";
		String sequence = "1,2,3,6..9,15,16,19,21,24..28,33";
		String x = "1..2";
		// int[] array = { 3, 5 , 7, 9, 11,15};
		int[] array = { 1, 2, 4, 5, 6, 7 };
		 System.out.println(addAtTheRate(atTheRate));
		// System.out.println(reverseWord(name));
		// System.out.println(characterCombine(name1, name2));
		// System.out.println(sequence);
		// System.out.println("---------------------");
		// System.out.println(noName(sequence));
		// System.out.println(getMissingNo(array));
		// System.out.println(getMissingNo(array));
	}
}
