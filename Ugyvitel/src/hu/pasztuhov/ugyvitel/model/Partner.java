package hu.pasztuhov.ugyvitel.model;

import java.util.*;

import javax.persistence.*;

@Entity
public class Partner {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	@Column(length = 50)
	private String cegnev;
	@Column(length = 10)
	private String irszam;
	@Column(length = 30)
	private String varos;
	@Column(length = 30)
	private String cim;
	@Column(length = 20)
	private String adoszam;
	@Column(length = 20)
	private String telefon;
	@Column(length = 30)
	private String email;
	private BitSet fizetesiModok;
	private float kedvezmeny;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}	public static final int BANKKARTYA = 2;

	public String getCegnev() {
		return cegnev;
	}
	public void setCegnev(String cegnev) {
		this.cegnev = cegnev;
	}
	public String getIrszam() {
		return irszam;
	}
	public void setIrszam(String irszam) {
		this.irszam = irszam;
	}
	public String getVaros() {
		return varos;
	}
	public void setVaros(String varos) {
		this.varos = varos;
	}
	public String getCim() {
		return cim;
	}
	public void setCim(String cim) {
		this.cim = cim;
	}
	public String getAdoszam() {
		return adoszam;
	}
	public void setAdoszam(String adoszam) {
		this.adoszam = adoszam;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public BitSet getFizetesiModok() {
		return fizetesiModok;
	}
	public void setFizetesiModok(BitSet fizetesiModok) {
		this.fizetesiModok = fizetesiModok;
	}
	public float getKedvezmeny() {
		return kedvezmeny;
	}
	public void setKedvezmeny(float kedvezmeny) {
		this.kedvezmeny = kedvezmeny;
	}

}
