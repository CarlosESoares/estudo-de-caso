package ficha;

public class AtribRaca {
	private int [] Atrib = new int [6];
	
	public AtribRaca(int[] atrib) {
		super();
		Atrib [0] = 8;
		Atrib [1] = 8;
		Atrib [2] = 8;
		Atrib [3] = 8;
		Atrib [4] = 8;
		Atrib [5] = 8;
	}

	public AtribRaca() {
		super();
		Atrib [0] = 8;
		Atrib [1] = 8;
		Atrib [2] = 8;
		Atrib [3] = 8;
		Atrib [4] = 8;
		Atrib [5] = 8;
		
	}

	public int[] getAtrib() {
		return Atrib;
	}

	public void setAtrib(int[] atrib) {
		Atrib = atrib;
	}

	public int[] anao () {
		getAtrib() [2] = (getAtrib()[2] + 2);
		return getAtrib();
	}
	
	public int[] elfo () {
		getAtrib() [1] = (getAtrib()[1] + 2);
		return getAtrib();
	}
	
	public int[] pequenino () {
		getAtrib() [1] = (getAtrib()[1] + 2);
		return getAtrib();
	}
	
	public int[] humano () {
		Atrib [0] += 1;
		Atrib [1] += 1;
		Atrib [2] += 1;
		Atrib [3] += 1;
		Atrib [4] += 1;
		Atrib [5] += 1;
		return getAtrib();
	}
	
	public int[] draconato () {
		getAtrib() [0] = (getAtrib()[0] + 2);
		getAtrib() [5] = (getAtrib()[5] + 1);
		return getAtrib();
	}
	
	public int[] gnomo () {
		getAtrib() [2] = (getAtrib()[2] + 1);
		return getAtrib();
	}
	
	public int[] meioElfo () {
		getAtrib() [5] = (getAtrib()[5] + 2);
		return getAtrib();
	}
	
	public int[] meioOrc () {
		getAtrib() [0] = (getAtrib()[0] + 2);
		getAtrib() [2] = (getAtrib()[2] + 1);
		return getAtrib();
	}
	
	public int[] tiferino () {
		getAtrib() [3] = (getAtrib()[3] + 1);
		getAtrib() [5] = (getAtrib()[5] + 2);
		return getAtrib();
	}
}
