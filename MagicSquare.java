import java.util.Scanner;

// NOTE: doesn't compile
//       Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
//       at MagicSquare.main(MagicSquare.java:21)

//Bonus 2D Arrays
public class MagicSquare {
	/*
	 * Todo: A magic square is a quadratic matrix where the sums of each row and
	 * each column are equal. All possible numbers from 1 to (side length)^2 have to occur
	 * in the square. Write a method that takes a 2D Array as input and checks if it is a magic
	 * square or not.
	 * */
	public static void main(String[] args) {
	 	int R = 4;	// NOTE: variables are written in lowercase
	    int C=4;
	    int[][] matrix=new int [R][C];
	    Scanner scan = new Scanner(System.in);
		for (int i=0; i<matrix.length;i++) {
			for (int j =0;j<matrix[R].length;j++) {	// NOTE: if you create an array with 4 elements (-> R), then last index is 3!
				System.out.println("enter the elementss for the Matrix");
				matrix[i][j] = scan.nextInt();

		}
		
		}
		
		// NOTE: call to isSquare missing
}
	public static boolean isSquare(int [] R,int [] C) {	// NOTE: implementation is nearly missing
		if (R.length!=C.length) {
			return false;
		}
		else {
			
		}
		return true;
	}
	public static boolean add(int [] R,int [] C) {
//		int Rsum=0;
//		int Csum=0;
		for(int i =0;i<R.length;i++) {
			for(int j =0;j<C.length;j++) {
				int Rsum=R[i]+R[i+j];
				int Csum=C[i]+C[i+j];
				//int Rdig=
				if(Rsum!=Csum) {
					return false;
				}
			}
		}
		return true;
	}
}