package it.oshift.colorsbe;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "scelta_colore")
public class Scelta {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "colore")
	private String colore;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}
	
	
}
