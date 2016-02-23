import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner QBrating = new Scanner(System.in);
		System.out.print("Insert Quarterback's Touchdowns: ");
		double td = QBrating.nextDouble();
		System.out.print("Insert Quarterback's Total Yards: ");
		double yds = QBrating.nextDouble();
		System.out.print("Insert Quarterback's Interceptions: ");
		double intcept = QBrating.nextDouble();
		System.out.print("Insert Quarterback's Completions: ");
		double comp = QBrating.nextDouble();
		System.out.print("Insert Quarterback's Number of Passes Attempted: ");
		double att = QBrating.nextDouble();
		QBrating.close();
		
		System.out.println();
		
		double a = ((comp/att)-.3)*5;
		double b = ((yds/att)-3)*.25;
		double c = ((td/att)*20);
		double d = 2.375-((intcept/att)*25);
		double passerrating = ((a+b+c+d)/6)*100;
		System.out.println("Quarterback Rating is "+ String.format("%.1f %n", passerrating));
	}
}
