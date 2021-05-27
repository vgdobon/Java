
public class MatrizBidimensionalII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double [][] matriz = new double[5][10];
		double interes = 0.10;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 1; j < matriz[i].length; j++) {
				matriz[i][0] = 10000;
				matriz[i][j]= matriz[i][j-1] + matriz[i][j-1]*interes;
			}
			
			interes+= 0.01;
		}
		
		for (double[] ds : matriz) {
			for (double ds2 : ds) {
				System.out.print(ds2 + " ");
			}
			
			System.out.println();
		}
	}

}
