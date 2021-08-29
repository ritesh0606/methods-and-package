import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int mins;
		int years;
		int days;
		System.out.println("Enter no. of minutes : ");
		Scanner s = new Scanner(System.in);
		mins = s.nextInt();
		years = mins/(60*24*365);
		days = (mins/60/24)%365;
		System.out.println(mins + " minutes is approximately "+ years +" years and "+ days + " days.");
	}
}
