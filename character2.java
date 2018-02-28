package charAT;
import java.util.Scanner;
public class character2 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any String");
		String a=scanner.nextLine();
		int b=a.length();
		char c1=a.charAt(b-1);
		System.out.println(c1);
	}

}
