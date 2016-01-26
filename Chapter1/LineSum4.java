import java.io.File;
import java.util.Scanner;

class LineSum4 {
	public static void main(String[] args) {
		try {
			File file = new File("Testcase4.txt");
			Scanner input = new Scanner(file);

			int a, b, c;
			c = 1;
			while(input.hasNextLine()) {
				a = input.nextInt();
				b = input.nextInt();
				System.out.println("Case" + c + ": " + (a+b) );
				System.out.println(" ");
				c++;
			}
		} catch (Exception ex) {}
	}
}