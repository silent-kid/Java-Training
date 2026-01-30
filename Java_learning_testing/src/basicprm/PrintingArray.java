package basicprm;

public class PrintingArray
{
	int a=0;
	int arr[]= new int[20];
	public void arr2()
	{
		for(int i=a;i<arr.length;i++) 
		{
			i++;
			arr[i]=i;
			System.out.println(arr[i]);
		}
		
	}
	public static void main(String []a)
	{
		PrintingArray pa= new PrintingArray();
		pa.arr2();
		
	}
	
	
	
}
