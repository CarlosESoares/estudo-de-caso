package controller;

import java.util.ArrayList;
import java.util.List;

import model.Inventario;

public class InventarioDAO {
	public List <Inventario> objetos;
	
	public InventarioDAO () {
		this.objetos = new ArrayList ();
	}
	
	public void InventarioAdd (Inventario objeto) {
		objetos.add(objeto);
	}
} 
