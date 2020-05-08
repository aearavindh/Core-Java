import java.util.Scanner;

public class Assignment3 {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the minutes: ");
	int minutes = sc.nextInt();
	int years = minutes / 525600;
	int days = (minutes % 525600)/1440;
    System.out.println(years+" years and "+days+" days");
    sc.close();
    }
}
