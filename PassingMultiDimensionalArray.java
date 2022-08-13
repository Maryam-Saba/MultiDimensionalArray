class Array
{
	void display(int x[][])
{
	for(int i=0; i<2; i++)
		{
		for(int j=0; j<x[i].length; j++)
		{
			System.out.println(x[i][j]);
		}
}
}
}
public class PassingMultiDimensionalArray
{
	public static void main(String args[])
	{
		int x[][]= {{100,200},{300,400}};
		Array obj= new Array();
		obj.display(x);	
	}
}