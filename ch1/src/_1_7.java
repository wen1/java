/*
 * Write an algorithm such that if an element in an MxN matrix is 0, 
 * its entire row and column is set to 0
 */
public class _1_7 {
	static int[][] matrix = {{1,2,0,4},{5,0,7,8},{9,10,11,12}};
	
	public static void main(String[] args){
		System.out.println("original:\n");
		printMatrix(matrix);
		
//		System.out.println("\nmethod 1 after set zero:\n");
//		printMatrix(setZeroOfMatrix(matrix));
		
		System.out.println("\nmethod 2 after set zero:\n");
		setZeroOfMatrixInPlace(matrix);
		printMatrix(matrix);
	}
	
	public static int[][] setZeroOfMatrix(int[][] matrix){
		int[][] newMatrix = copyMatrix(matrix);
		int col = matrix[0].length;
		int row = matrix.length;
		for (int i = 0; i < row; i++){
			for (int j = 0; j < col; j++){
				if (matrix[i][j] == 0) {
					for (int m = 0; m < col; m++) {
						newMatrix[i][m] = 0;
					}
					for (int n = 0; n < row; n++) {
						newMatrix[n][j] = 0; 
					}
				}
			}
		}
		// matrix = newMatrix; // would not work;
		return newMatrix;
	}
	
	public static void setZeroOfMatrixInPlace(int[][] matrix){
		int[] rows = new int[matrix.length];
		int[] cols = new int[matrix[0].length];
		for (int i = 0; i < matrix.length; i++){
			for (int j = 0; j <matrix[0].length; j++){
				if (matrix[i][j] == 0) {
					rows[i] = 1;
					cols[j] = 1;
				}
			}
		}
		
		for (int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++){
				if (rows[i] ==1 || cols[j] == 1) {
					matrix[i][j] =0;
				}
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
	
	public static int[][] copyMatrix(int[][] matrix) {
		int numOfCol = matrix[0].length;
		int numOfRow = matrix.length;
		int[][] newMatrix = new int[numOfRow][numOfCol];
		for (int i = 0; i < numOfRow; i++){
			for (int j = 0; j<numOfCol; j++){
				newMatrix[i][j] = matrix[i][j];
			}
		}
		return newMatrix;
	}
}
