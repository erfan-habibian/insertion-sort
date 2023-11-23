import java.util.Random;
public class Exercise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		
		
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = rand.nextInt(100);
		}
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}

}
