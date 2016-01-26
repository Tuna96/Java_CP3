import java.io.File;
import java.util.Scanner;

class LineSum3 {
	public static void main(String[] args) {
		try {
			File file = new File("Testcase3.txt");
			Scanner input = new Scanner(file);
			int a, b;

			while(input.hasNextLine()) {
				a = input.nextInt();
				b = input.nextInt();
				System.out.println(a+b);
			}
		} catch (Exception ex) {
			//ex.printStackTrace();
		}
	}
}