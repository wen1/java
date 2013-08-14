/*
 * Given an image represented by an NxN matrix,
 *  where each pixel in the image is 4 bytes, 
 *  write a method to rotate the image by 90 degrees Can you do this in place?
 */
public class _1_6 {
	static int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
	
	public static void main(String[] args){
		System.out.println("orignial matrix:\n");
		printMatrix(matrix);
		System.out.println("\nafter rotating:\n");
		rotate(matrix);
		printMatrix(matrix);
	}
	
	public static void rotate(int[][] matrix) {
		int layer = 0;
		int n = matrix[0].length;
		for (layer = 0; layer < matrix[0].length/2; layer++){
			int first = layer;
			int last = n-layer-1;
			for (int i = first;i < last; i++){ // start from first, end at last-1
				int temp = matrix[layer][i];
				int offset = i-first;
				// left to top;
				matrix[layer][i] = matrix[last-offset][layer];
//				System.out.println(matrix[last-offset][layer]+"-> top");
				// bottom to left;
				matrix[last-offset][layer] = matrix[last][last-offset];
//				System.out.println(matrix[last][last-offset]+"-> left");
				// right to bottom:
				matrix[last][last-offset] = matrix[i][last];
//				System.out.println(matrix[last][last-offset]+"-> bottom");
				// top to right :
				matrix[i][last] = temp;
//				System.out.println(temp+"->right");
			}
		}
	}
	
	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++){
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
