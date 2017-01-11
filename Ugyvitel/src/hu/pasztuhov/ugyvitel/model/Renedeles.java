package hu.pasztuhov.ugyvitel.model;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Renedeles {
	public static final int ELKESZULT = 0;
	public static final int KIKULDVE = 1;
	public static final int ELFOGADVA = 2;
	public static final int SZAMLAZVA = 3;
	
	public static final int KESZPENZ = 0;
	public static final int ATUTALAS = 1;
	public static final int BANKKARTYA = 2;

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	@Column(length = 50)
	private String cegnev;
	@Column(length = 10)
	private String irszam;
	@Column(length = 30)
	private String varos;
	@Column(length = 0)
	private String cim;
	@Column(length = 20)
	private String adoszam;
	@Column(length = 20)
	private String telefon;
	@Column(length = 30)
	private String email;
	@Column(length = 50)
	private String vevoCegnev;
	@Column(length = 10)
	private String vevoIrszam;
	@Column(length = 30)
	private String vevoVaros;
	@Column(length = 30)
	private String vevoCim;
	@Column(length = 20)
	private String vevoAdoszam;
	@Column(length = 20)
	private String vevoTelefon;
	@Column(length = 30)
	private String vevoEmail;
	private Date kiallitas;
	private Date fizetesiDatum;
	private int fizetesModja;
	@Column(length = 30)
	private String kiallitoNeve;
	private int kiallitoId;
	private BitSet allapot = new BitSet();
	@OneToMany(mappedBy = "szamla")
	private List<SzamlaTetel> tetelLista = new ArrayList();
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
	public String getVevoCegnev() {
		return vevoCegnev;
	}
	public void setVevoCegnev(String vevoCegnev) {
		this.vevoCegnev = vevoCegnev;
	}
	public String getVevoIrszam() {
		return vevoIrszam;
	}
	public void setVevoIrszam(String vevoIrszam) {
		this.vevoIrszam = vevoIrszam;
	}
	public String getVevoVaros() {
		return vevoVaros;
	}
	public void setVevoVaros(String vevoVaros) {
		this.vevoVaros = vevoVaros;
	}
	public String getVevoCim() {
		return vevoCim;
	}
	public void setVevoCim(String vevoCim) {
		this.vevoCim = vevoCim;
	}
	public String getVevoAdoszam() {
		return vevoAdoszam;
	}
	public void setVevoAdoszam(String vevoAdoszam) {
		this.vevoAdoszam = vevoAdoszam;
	}
	public String getVevoTelefon() {
		return vevoTelefon;
	}
	public void setVevoTelefon(String vevoTelefon) {
		this.vevoTelefon = vevoTelefon;
	}
	public String getVevoEmail() {
		return vevoEmail;
	}
	public void setVevoEmail(String vevoEmail) {
		this.vevoEmail = vevoEmail;
	}
	public Date getKiallitas() {
		return kiallitas;
	}
	public void setKiallitas(Date kiallitas) {
		this.kiallitas = kiallitas;
	}
	public Date getFizetesiDatum() {
		return fizetesiDatum;
	}
	public void setFizetesiDatum(Date fizetesiDatum) {
		this.fizetesiDatum = fizetesiDatum;
	}
	public int getFizetesModja() {
		return fizetesModja;
	}
	public void setFizetesModja(int fizetesModja) {
		this.fizetesModja = fizetesModja;
	}
	public String getKiallitoNeve() {
		return kiallitoNeve;
	}
	public void setKiallitoNeve(String kiallitoNeve) {
		this.kiallitoNeve = kiallitoNeve;
	}
	public int getKiallitoId() {
		return kiallitoId;
	}
	public void setKiallitoId(int kiallitoId) {
		this.kiallitoId = kiallitoId;
	}
	public BitSet getAllapot() {
		return allapot;
	}
	public void setAllapot(BitSet allapot) {
		this.allapot = allapot;
	}
	public List<SzamlaTetel> getTetelLista() {
		return tetelLista;
	}
	public void setTetelLista(List<SzamlaTetel> tetelLista) {
		this.tetelLista = tetelLista;
	}

}
