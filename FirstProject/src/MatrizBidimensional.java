import java.util.Iterator;

public class MatrizBidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [][] matrix = new double [4][5];
		matrix[0][2] = 2;
		
//		for (double[] is : matrix) {
//			for (double is2 : is ) {
//				is2 = Math.random()*10;
//			}
//		}
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = Math.random()*10;
			}
		}
		
		for (double[] is : matrix) {
			for (double is2 : is) {
				System.out.println(is2);
			}
		}
		
	}

}
