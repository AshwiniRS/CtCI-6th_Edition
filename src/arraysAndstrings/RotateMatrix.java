
public class RotateMatrix {

	public static void rotate(int[][] matrix){
		
		int n = matrix.length;
		System.out.println(n);
		for(int layer=0; layer<n/2; layer++){
			int first = layer;
			int last = n-1-layer;
			for(int i = first; i<last; i++){
				int offset = i - layer;
				int top = matrix[first][i]; //save top
				//left - top
				matrix[first][i] = matrix[last-offset][first];
				//bottom-left
				matrix[last-offset][first] = matrix[last][last-offset];
				//right-bottom
				matrix[last][last-offset] = matrix[i][last];
				//top-right
				matrix[i][last] = top;
			}
		}
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int n = 3;
		int[][] matrix = new int[n][n];
		int[] matArr = {3,3,0,9,2,5,7,5,6};
		int k =0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				matrix[i][j] = matArr[k];
				k++;
			}
		}
		rotate(matrix);
	}

}
