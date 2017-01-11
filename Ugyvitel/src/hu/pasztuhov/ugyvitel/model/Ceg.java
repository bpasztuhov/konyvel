package hu.pasztuhov.ugyvitel.model;

import javax.persistence.*;
import java.util.*;

@Entity
public class Ceg {
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
	private String telefon;
	@Column(length = 30)
	private String email;
	@OneToMany(mappedBy = "ceg")
	private List<User> dolgozoList = new ArrayList<>();
	@Column(length = 20)
	private String adoSzam;
	@Column(length = 30)
	private String bankSzamlaSzam;
	private int adozasModja;
	private int szamlaPeldanySzam;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public List<User> getDolgozoList() {
		return dolgozoList;
	}
	public void setDolgozoList(List<User> dolgozoList) {
		this.dolgozoList = dolgozoList;
	}
	public String getAdoSzam() {
		return adoSzam;
	}
	public void setAdoSzam(String adoSzam) {
		this.adoSzam = adoSzam;
	}
	public String getBankSzamlaSzam() {
		return bankSzamlaSzam;
	}
	public void setBankSzamlaSzam(String bankSzamlaSzam) {
		this.bankSzamlaSzam = bankSzamlaSzam;
	}
	public int getAdozasModja() {
		return adozasModja;
	}
	public void setAdozasModja(int adozasModja) {
		this.adozasModja = adozasModja;
	}
	public int getSzamlaPeldanySzam() {
		return szamlaPeldanySzam;
	}
	public void setSzamlaPeldanySzam(int szamlaPeldanySzam) {
		this.szamlaPeldanySzam = szamlaPeldanySzam;
	}
}
