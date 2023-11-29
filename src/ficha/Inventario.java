package ficha;

public class Inventario {
	String objeto;
	String descObjeto;
	
	public String getObjeto() {
		return objeto;
	}

	public void setObjeto(String objeto) {
		this.objeto = objeto;
	}

	public String getDescObjeto() {
		return descObjeto;
	}

	public void setDescObjeto(String descObjeto) {
		this.descObjeto = descObjeto;
	}

	public Inventario(String objeto, String descObjeto) {
		super();
		this.objeto = objeto;
		this.descObjeto = descObjeto;
	}
	
	public void exibir () {
		System.out.println("nome:" + objeto);
		System.out.println("descrição" + descObjeto);
	}
	
}
