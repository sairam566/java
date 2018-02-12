package day.one;
import java.util.ArrayList;

public class ArrayList_clone_Demo {
	public static void main(String[] args) {
		ArrayList<StringBuffer> arrayList = new ArrayList<StringBuffer>();
		arrayList.add(new StringBuffer("Thadi "));
		ArrayList<StringBuffer> arrayList2 = new ArrayList<StringBuffer>();
		arrayList2 = (ArrayList<StringBuffer>) arrayList.clone();
		StringBuffer buffer = arrayList.get(0);
		buffer.append("Sairam");

		for (int i = 0; i < arrayList2.size(); i++) {
			System.out.println(arrayList2.get(i));
		}

	}

}
