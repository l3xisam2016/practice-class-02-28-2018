package charAT;
import java.util.Scanner;
public class we12 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any String");
		String text=scanner.nextLine();
		System.out.println(secondtolast(text));	
	}
	
	
public static String secondtolast(String word) {
		
	
	char first=word.charAt(0);
	int AL =word.length()-2;
	char Almostlast=word.charAt(AL);
	String fl=first + " " + Almostlast;	
	
	return fl;
}	
		
		


}
