/**
 * 
 */
package javatutorial;

/**
 * @author tsuser
 *
 */
public class CodingExsersce {

	public static void main(String[] args) {
		int count = 0, steps = 5;
		for (int i = 1; i <= steps; i++) {
			if (i % 2 != 0) {
				for (int j = 1; j <= i; j++) {
					System.out.print(++count + " ");

				}
				System.out.println();
			} else {
				int temp = count;
				temp = temp + i;
				for (int k = 1; k <= i; k++) {
					System.out.print(temp-- + " ");
				}
				count += i;
				System.out.println();
			}
		}
	}
}
