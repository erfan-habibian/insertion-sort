import java.util.Random;
public class Sort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		System.out.println("2");
		int[] arr = new int[40];
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = i;
		}
		int n = arr.length;
		long startTime = System.nanoTime();
		insertionSort(arr, n);
		long endTime = System.nanoTime();		
//		for(int i=0; i<n; i++){
//		System.out.print(arr[i] + " ");
//		}
		System.out.print("\n\nthe time computed for the program is: " + (endTime - startTime));
	}
	public static void insertionSort(int[] arr, int n)
	{
		int temp;
		for(int i=0; i<n; i++)
		{
			for(int j=i; j>0; j--)
			{
				if(arr[j-1]>arr[j])
				{
					temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
	}
	

}
