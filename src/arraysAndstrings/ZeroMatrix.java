
public class ZeroMatrix {

	public static void zeroMat(int[][] matrix){
		int n = matrix.length;
		int i=0,j=0;
		int flag = 0;
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				if(matrix[i][j] == 0){
					flag = 1;
					break;
				}
			}if(flag == 1) break;
		}
		System.out.println(i + " " + j);
		for(int k=0;k<n;k++){
			matrix[k][j] = 0;
		}

		for(int k=0;k<n;k++){
			matrix[i][k] = 0;
		}
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
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
		zeroMat(matrix);
	}

}
