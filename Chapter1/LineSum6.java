import java.io.File;
import java.util.Scanner;

class LineSum6 {
	public static void main(String[] args) {
		try {
			File file = new File("Testcase6.txt");
			Scanner input = new Scanner(file);

			int ans, k;
			while(input.hasNextLine()) {
				k = input.nextInt();
				ans = 0;
				while(k > 0) {
					ans = ans + input.nextInt();
					k--;
				}
				System.out.println(ans);
			}
		} catch (Exception ex) {}
	}
}