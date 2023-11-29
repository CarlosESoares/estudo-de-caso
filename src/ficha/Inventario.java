package ficha;

public class Inventario {
	String objeto;
	String descObjeto;

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
