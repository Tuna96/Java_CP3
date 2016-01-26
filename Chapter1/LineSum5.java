import java.io.File;
import java.util.Scanner;

class LineSum5 {
	public static void main(String[] args) {
		try {
			File file = new File("Testcase5.txt");
			Scanner input = new Scanner(file);

			int a, b, c;
			c = 1;
			while(input.hasNextLine()) {
				if(c > 1)
					System.out.println(" ");
				a = input.nextInt();
				b = input.nextInt();
				System.out.println("Case"+c+": "+(a+b));
				c++;
			}
		} catch (Exception ex) {}
	}
}