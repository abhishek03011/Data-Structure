import java.util.Scanner;
public class Matrix 
{
   int [][] mat1,mat2,transpose,result;

   
   Matrix(int row, int col)
   {
	   mat1 = new int[row][col];
	   mat2 = new int[row][col];
	   result = new int[row][col];
	   transpose = new int[row][col];
   }
	
   public int[][] createMatrix1(int row, int col)
	{
	 System.out.println("Enter matrix elements");
	  
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);	
	 
		for(int i = 0; i<row ;i++)
		{
		 for(int j= 0;j < col;j++)
		 {
			 mat1[i][j] = sc.nextInt();
		 }
	 }
	return mat1;
	}
 
   public int[][] createMatrix2(int row, int col)
 	{
 	 System.out.println("Enter matrix elements");
 	  
 		@SuppressWarnings("resource")
 		Scanner sc = new Scanner(System.in);	
 	 
 		for(int i = 0; i<row ;i++)
 		{
 		 for(int j= 0;j < col;j++)
 		 {
 			 mat2[i][j] = sc.nextInt();
 		 }
 	 }
 	return mat2;
 	}
   
	public void print(int row , int col, int[][]matrix)
	{
		for(int i = 0; i< row;i++)
		{
			for(int j = 0; j< col; j++)
				{
				System.out.print(matrix[i][j]+"\t");
				}
		System.out.println("");
		}
	}
	
	public int[][] MatrixAddition(int[][]first,int[][]second,int row1,int col1)
	{
	
		for(int i = 0;i<row1;i++)
		{
			for(int j =0 ;j <col1;j++)
			{
				result[i][j] = first[i][j] + second[i][j];
			}

		}
			
		return result;
	}
   

	public int[][] MatrixSubstraction(int[][]first,int[][]second,int row1,int col1)
	{
	for(int i = 0;i<row1;i++)
		{
			for(int j =0 ;j <col1;j++)
			{
				result[i][j] = first[i][j] - second[i][j];
			}

		}	
		return result;
	}
   
	public int[][] MatrixTranspose(int[][]first,int row,int col)
	{
		for(int i = 0;i<row;i++)
			for(int j =0; j< col;j++)
				result[j][i] = first[i][j]; 
	return 	result;
	}
	public static void main(String...args)
	{
		 @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter row");
		 int row = sc.nextInt();
		 System.out.println("Enter Column");
		 int col = sc.nextInt();
		 System.out.println("row "+ row + "Column "+col);
		 Matrix x = new Matrix(row, col);
		 System.out.println("Create first matrix");
		 int [][]y = x.createMatrix1(row, col);
		 System.out.println("Create second matrix");
		 int [][]z = x.createMatrix2(row, col);
		 System.out.println("Printing Matrix");
		 x.print(row,col,y);
		 System.out.println("Printing Matrix");
		 x.print(row,col,z);
		 System.out.println("Added Matrix");
		 int[][]add = x.MatrixAddition(y, z, row, col);
		 x.print(row, col, add);
		 int[][]sub = x.MatrixSubstraction(y, z, row, col);
		 System.out.println("Substracted Matrix");
		 x.print(row, col, sub);
		 System.out.println("Transposed Matrix");
		 int [][] transpose =  x.MatrixTranspose(y,row,col);
		 x.print(row, col, transpose);
				 
	}
}