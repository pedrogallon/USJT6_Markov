import java.text.DecimalFormat;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DecimalFormat fmt = new DecimalFormat("##.####");

//		 double[] e = { 0.1, 0.9 };
//		 double[][] p = { { 0.8, 0.6 }, { 0.2, 0.4 } };

		double[] e = { 0.33, 0.33 ,0.33}; // Estados
		double[][] p = { { 0.4, 0.5, 0.1 }, { 0.4, 0.3, 0.5 }, {0.2, 0.2, 0.4} }; // Probabilidade {{coluna}}

		int it = 10; // iteracoes

		for (int i = 0; i < it; i++) {
			double[] aux = new double[e.length];
			for (int j = 0; j < e.length; j++) {
				for (int k = 0; k < e.length; k++) {
					aux[j] += e[k] * p[j][k];
				}

			}
			e = aux;

			System.out.print("S" + (i + 1) + ":	[	");
			for(double s : e) {
				System.out.print(fmt.format(s) + "		");
			}
			System.out.print("	]\n");
		}
	}

}
