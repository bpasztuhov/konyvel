package hu.pasztuhov.ugyvitel.model;
import java.util.*;

import javax.persistence.*;

@Entity
public class SzamlaTetel {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	private Szamla szamla;
	@Column(length = 50)
	private String megnevezes;
	@Column(length = 10)
	private String egyseg;
	private float mennyiseg;
	private float egysegar;
	private float afaKulcs;
	@Column(length = 24)
	private String termekJegyzek;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Szamla getSzamla() {
		return szamla;
	}
	public void setSzamla(Szamla szamla) {
		this.szamla = szamla;
	}
	public String getMegnevezes() {
		return megnevezes;
	}
	public void setMegnevezes(String megnevezes) {
		this.megnevezes = megnevezes;
	}
	public String getEgyseg() {
		return egyseg;
	}
	public void setEgyseg(String egyseg) {
		this.egyseg = egyseg;
	}
	public float getMennyiseg() {
		return mennyiseg;
	}
	public void setMennyiseg(float mennyiseg) {
		this.mennyiseg = mennyiseg;
	}
	public float getEgysegar() {
		return egysegar;
	}
	public void setEgysegar(float egysegar) {
		this.egysegar = egysegar;
	}
	public float getAfaKulcs() {
		return afaKulcs;
	}
	public void setAfaKulcs(float afaKulcs) {
		this.afaKulcs = afaKulcs;
	}
	public String getTermekJegyzek() {
		return termekJegyzek;
	}
	public void setTermekJegyzek(String termekJegyzek) {
		this.termekJegyzek = termekJegyzek;
	}
	
}
