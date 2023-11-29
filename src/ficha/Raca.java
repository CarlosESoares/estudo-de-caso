package ficha;

public class Raca {
	 double [] raca = new double [7];
	
	public double[] getRaca() {
		return raca;
	}

	public void setRaca(double[] raca) {
		this.raca = raca;
	}

	public double [] anao () {
		raca [0] = 8 ; //forca
 		raca [1] = 8; // deztreza
		raca [2] = 10; // contituição
		raca [3] = 8; // inteligencia
		raca [4] = 8; // sabedoria
		raca [5] = 8; // carisma
		raca [6] = 7.5; // deslocamento
		return raca;
	}
	
	public double [] elfo () {
		raca [0] = 8 ;
		raca [1] = 10 ;
		raca [2] = 8 ;
		raca [3] = 8 ;
		raca [4] = 8 ;
		raca [5] = 8;
		raca [6] = 9;
		return raca;
	}
	
	public double [] pequenino () {
		raca [0] = 8 ;
		raca [1] = 10;
		raca [2] = 8;
		raca [3] = 8;
		raca [4] = 8;
		raca [5] = 8;
		raca [6] = 7.5;
		return raca;
	}
	
	public double [] humano () {
		raca [0] = 9 ;
		raca [1] = 9 ;
		raca [2] = 9 ;
		raca [3] = 9 ;
		raca [4] = 9 ;
		raca [5] = 9;
		raca [6] = 9 ;
		return raca;
	}
	
	public double [] draconato () {
		raca [0] = 10 ;
		raca [1] = 8 ;
		raca [2] = 8 ;
		raca [3] = 8 ;
		raca [4] = 8 ;
		raca [5] = 9 ;
		raca [6] = 9 ;
		return raca;
	}
	
	public double [] gnomo () {
		raca [0] = 8 ;
		raca [1] = 8 ;
		raca [2] = 8 ;
		raca [3] = 10 ;
		raca [4] = 8 ;
		raca [5] = 8 ;
		raca [6] = 7.5 ;
		return raca;
	}
	
	public double [] meioElfo (double [] raca) {
		raca [0] = 8 ;
		raca [1] = 8 ;
		raca [2] = 8 ;
		raca [3] = 8 ;
		raca [4] = 8 ;
		raca [5] = 10 ;
		raca [6] = 9 ;
		return raca;
	}
	
	public double [] meioOrc () {
		raca [0] = 10 ;
		raca [1] = 8 ;
		raca [2] = 9 ;
		raca [3] = 8 ;
		raca [4] = 8 ;
		raca [5] = 8 ;
		raca [6] = 9 ;
		return raca;
	}
	
	public double [] tiefling () {
		raca [0] = 8 ;
		raca [1] = 8 ;
		raca [2] = 8 ;
		raca [3] = 9 ;
		raca [4] = 8 ;
		raca [5] = 10 ;
		raca [6] = 9 ;
		return raca;
		
	}


}
