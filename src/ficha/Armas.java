package ficha;

public class Armas extends Inventario {
	int dano;
	double peso;

	public int getDano() {
		return dano;
	}

	public void setDano(int dano) {
		this.dano = dano;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Armas(String objeto, String descObjeto, int dano, double peso) {
		super(objeto, descObjeto);
		this.dano = dano;
		this.peso = peso;
	}
	
	public void exibirArmas () {
		System.out.println("nome: " + objeto);
		System.out.println("descrição" + descObjeto);
		System.out.println("dano: " + dano);
		System.out.println("peso: " + peso);
	}
}
