import java.io.File;
import java.util.Scanner;

class LineSum1 {
	public static void main(String[] args) {
		try {
			File file = new File("Testcase1.txt");
			Scanner input = new Scanner(file);

			int TC, a, b;
			TC = input.nextInt();
			while(TC > 0) {
				a = input.nextInt();
				b = input.nextInt();
				System.out.println(a + b);
				TC--;
			} 
		} catch (Exception ex) {
				ex.printStackTrace();
		}
	}
}