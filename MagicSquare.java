import java.util.Scanner;

//Bonus 2D Arrays
public class MagicSquare {
	/*
	 * Todo: A magic square is a quadratic matrix where the sums of each row and
	 * each column are equal. All possible numbers from 1 to (side length)^2 have to occur
	 * in the square. Write a method that takes a 2D Array as input and checks if it is a magic
	 * square or not.
	 * */
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the dimensions of your matrix");
		int R=scan.nextInt();
		int C=scan.nextInt();
		int[][] matrix=new int [R][C];
		for (int i=0; i<matrix.length;i++) {
			for (int j =0;j<matrix[i].length;j++) {
				System.out.println("enter the elementss for the Matrix");
				matrix[i][j] = scan.nextInt();
			}
		}
		for (int i=0; i<matrix.length;i++) {
			for (int j =0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	if(magicSquare(matrix)==true) {
		System.out.println("MAGIC SQUARE");
	}
	else {
		System.out.println("NOT A MAGIC SQUARE");
	}
	
	}
//	public static boolean isSquare(int [] R,int [] C) {
//		if (R.length!=C.length) {
//			return false;
//		}
//		else {
//
//		}
//		return true;
//	}
//	public static boolean add(int [] R,int [] C) {
//		
//		for(int i =0;i<R.length;i++) {
//			for(int j =0;j<C.length;j++) {
//				int Rsum=R[i]+R[i+j];
//				int Csum=C[i]+C[i+j];
//				
//				if(Rsum!=Csum) {
//					return false;
//				}
//			}
//		}
//		return true;
//	}
//}
	public static boolean magicSquare(int[][] matrix){

		int n1=0, n2=0;

		for(int i=0;i<matrix.length-1;i++){

			for(int j=0;j<matrix.length;j++){

				n1=matrix[i][j]+n1;	

				n2=matrix[j][i]+n2;

			}

             if(n1==n2){

                n1=0;n2=0;

                return true;

            }

            else{

           

                return false;

            }
		}
		return false;
	}
}