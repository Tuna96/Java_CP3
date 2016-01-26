import java.io.File;
import java.util.Scanner;

class LineSum2 {
	public static void main(String[] args) {
		try {
			File file = new File("Testcase2.txt");
			Scanner input = new Scanner(file);

			int a, b;
			a = input.nextInt();
			b = input.nextInt();
			while( (a != 0 ) || (b != 0) ) {
				System.out.println(a+b);
				a = input.nextInt();
				b = input.nextInt();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}