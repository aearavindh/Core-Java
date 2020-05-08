
public class Assignment3 {

	public static void main(String[] args) {
		try {
			float average = 0;
			for(int i=0;i<5;i++)
				average += Integer.parseInt(args[i]);
			System.out.println("Average: "+average/5);
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}

}
