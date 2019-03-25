import java.util.Scanner;

public class SortAndSearch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a length of an array ");
		int length =scan.nextInt();
		int a=scan.nextInt();	// NOTE: confusing, because user expects to enter numbers of array not a
		int[] input = new int[length];
		for (int i =0;i<length;i++) {
			input[i] = scan.nextInt();
		}
		
		int[] result = bubbleSort(input);
		
		for (int k =0;k<result.length;k++) {
			
		
		
		System.out.println("The bubblesort is"+result[k]);
		
		}

		// NOTE: call to binSearch missing

		//System.out.println("The bubblesort is"+bubbleSort(result));
	//todo: Write a method bubbleSrt which gets an integer array as input and which sorts this array according to the bubblesort algorithm
	//If you don't know how bubblesort works you can read it here: http://www.pkirs.utep.edu/CIS3355/Tutorials/chapter9/tutorial9A/bubblesort.htm
	//Now write another method binSrch. This method again receives an integer array as input together with another integer n.
	//First, it sorts this array by using the bubblSrt method. Then, it searches for n.
	//You can look up the binary search algorithm here: https://www.khanacademy.org/computing/computer-science/algorithms/binary-search/a/binary-search

	
}
	public static int [] bubbleSort(int[] n) {
		int a;
		for (int j =0;j<n.length;j++) {	// NOTE: works, but the indices of inner and outer loop are not correct
										//       your implementation always checks to the end, even if the elements are already sorted
			for (int i =0;i<n.length-1;i++) {
			
				if (n[i]<n[i+1]) {
				n[i]=n[i];
			}
				else {
				a=n[i+1];
				n[i+1]=n[i];
				n[i]=a;
			}
		}
	}
		return n;	
	}
	public static int binSearch(int[] n,int a) {	// NOTE: implementation is wrong
		if(a==n[n.length/2]) {						//       with input {1,2,3,4,5} and search for 4 -> stackoverflow at line 64
			return n.length/2;						//       with input {5,4,3,2,1} and search for 4 -> stackoverflow at line 57
		}
		else if (a<n[n.length/2]) {
			return binSearch(n,a);
		}
		else {
			return binSearch(n,a);
		}
				
			
		
	}
}