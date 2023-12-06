package controller;

import java.util.ArrayList;
import java.util.List;

import model.Armas;

public class ArmasDAO {
	public List <Armas> armmas;
	
	public ArmasDAO () {
		this.armmas = new ArrayList ();
	}
	
	public void ArmasAdd (Armas armas) {
		armmas.add(armas);
	}
	
	
}
