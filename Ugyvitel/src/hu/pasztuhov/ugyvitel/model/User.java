package hu.pasztuhov.ugyvitel.model;
import java.util.*;

import javax.persistence.*;

@Entity
@Table(name="FELHASZNALO")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	@Column(length = 20)
	private String azonosito;
	@Column(length = 50)
	private String jelszo;
	@Column(length = 30)
	private String nev;
	@Column(length = 20)
	private String telefon;
	@Column(length = 30)
	private String email;
	private List<String> szerepek = new ArrayList<>();
	private Ceg ceg;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAzonosito() {
		return azonosito;
	}
	public void setAzonosito(String azonosito) {
		this.azonosito = azonosito;
	}
	public String getJelszo() {
		return jelszo;
	}
	public void setJelszo(String jelszo) {
		this.jelszo = jelszo;
	}
	public String getNev() {
		return nev;
	}
	public void setNev(String nev) {
		this.nev = nev;
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
	public Ceg getCeg() {
		return ceg;
	}
	public void setCeg(Ceg ceg) {
		this.ceg = ceg;
	}
	public List<String> getSzerepek() {
		return szerepek;
	}
	public void setSzerepek(List<String> szerepek) {
		this.szerepek = szerepek;
	}
}
