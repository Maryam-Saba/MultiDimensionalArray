public class rowsum
{
	public static void main(String args[])
	{
		int a[][]= new int[2][2];
		int res[][]= new int[2][2];
		a[0][1]= 3;
		a[1][1]= 2;
		a[1][0]= 4;
		a[1][1]= 7;

	for(int i=0; i<2; i++)
	{
		for(int j=0; j<2; j++)
{
	res[0][i]= res[0][i] + a[i][j];
}
	System.out.println("output:" +res[0][i]);
	}
	}
}