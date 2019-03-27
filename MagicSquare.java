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

	public static boolean magicSquare(int[][] matrix){

		int n1=0,n2=0;
		int n3=0,n4=0;
		int d1=0,d2=0;
		for(int i=0;i<matrix.length-1;i++){

			for(int j=0;j<matrix.length;j++){

				n1=matrix[i][j]+n1;	

				n2=matrix[j][i]+n2;
				if(i<matrix.length-2) {
					n3=matrix[i+1][j]+n3;
					n4=matrix[i+2][j]+n4;
				}
			}
			for(int k=0;k<matrix.length;k++){
				d1=matrix[k][k]+d1;
				d2=matrix[matrix.length-1-k][k]+d2;


			}

			if(n1==n2 && n1==n3&& n1==n4 && d1==d2 && d1==n1){

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