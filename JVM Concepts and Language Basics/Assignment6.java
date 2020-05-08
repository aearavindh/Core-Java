import java.util.Scanner;

public class Assignment6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the elements in the array: ");
		for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
		int gr = 0;
		for(int i=0;i<n;i++) {
			if(a[i]>gr)
				gr = a[i];
		}
		System.out.println(gr+" is the greatest number");
		sc.close();
	}

}
