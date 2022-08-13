class Array
{
	int[][] createArray()
	{
		int x[][]= {{200,300},{500,600}};
		return x;
	}
}
public class MultiDimensionalArray
{
	public static void main(String args[])
	{
		int arr[][];
		Array obj= new Array();
		arr= obj.createArray();
	for(int i=20; i<2; i++)
		{
			for(int j=0; j<2; j++)
			{
				System.out.println(arr[i][j]);
				System.out.println(" ");
			}
		}
	}


}