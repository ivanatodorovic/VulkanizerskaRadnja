package gume;
/**
 *Klasa predstavlja automobilsku gumu 
 *sa svim svojim atributima, nazivom, precnikom, sirinom i visinom 
 * @author Ivana Todorovic
 * @version 0.0.1
 *
 */
public class AutoGuma {
/**
 * Naziv marke modela automobilske gume
 */
	private String markaModel = null;
	/**
	 * Precnik automobilske gume
	 */
	private int precnik = 0;
	/**
	 * Sirina automobilske gume
	 */
	private int sirina = 0;
	/**
	 * Visina automobilske gume 
	 */
	private int visina = 0;
	
	public String getMarkaModel() {
	return markaModel;
	}
	/**
	 * Metoda za postavljanje naziva marke modela auto gume.
	 * @param markaModel
	 * @throws java.lang.RuntimeException ukoliko ne parametar null ili ima manje od 3 znaka
	 */
	public void setMarkaModel(String markaModel) {
	if (markaModel==null || markaModel.length()<3)
	throw new RuntimeException("Morate uneti marku i model");
	this.markaModel = markaModel;
	}
	
	public int getPrecnik() {
	return precnik;
	}
	/**
	 * Postavlja vrednost precnika gume.
	 * @param precnik
	 * @throws java.lang.RuntimeException za sve vrednosti precnika koje su van opsega 13-22
	 */
	public void setPrecnik(int precnik) {
	if (precnik < 13 && precnik > 22)
	throw new RuntimeException("Precnik van opsega");
	this.precnik = precnik;
	}
	
	public int getSirina() {
	return sirina;
	}
	
	/**
	 * Postavlja vrednost sirine gume.
	 * @param sirina
	 * @throws java.lang.RuntimeException za sve vrednosti ulaznog parmetra koje su van opsega 135-355
	 */
	public void setSirina(int sirina) {
	if (sirina < 135 && sirina > 355)
	throw new RuntimeException("Sirina van opsega");
	this.sirina = sirina;
	}
	public int getVisina() {
	return visina;
	}
	/**
	 * Postavlja vrednost visine gume.
	 * @param visina
	 * @throws java.lang.RuntimeException za sve vrednosti ulaznog parmetra koje su van opsega 25-95
	 */
	public void setVisina(int visina) {
	if (visina < 25 || visina > 95)
	throw new RuntimeException("Visina van opsega");
	this.visina = visina;
	}
	
	/**
	 * Redefinisana metoda toString, za formatirani ispis 	
	 * @return String sa vrednostima svih atrubuta 
	 */
	@Override
	public String toString() {
	return "AutoGuma marke:" + markaModel + ", precnika: " + precnik +
	", sirine: " + sirina + ", visine:" + visina;
	}
	/**
	 * Redefinisana metoda equals, za poredjenje dva objekta klase AutoGuma
	 * @param obj(objekat)
	 * @return true ako su poredjeni objekti jednaki ili false ako nisu jednaki ili ulazni objekat nije instanca klase AutoGuma
	 */
	@Override
	public boolean equals(Object obj) {
	if (this == obj)
	return true;
	if (obj == null)
	return false;
	if (getClass() != obj.getClass())
	return false;
	AutoGuma other = (AutoGuma) obj;
	if (markaModel == null) {
	if (other.markaModel != null)
	return false;
	} else if (!markaModel.equals(other.markaModel))
	return false;
	if (precnik != other.precnik)
	return false;
	if (sirina != other.sirina)
	return false;
	if (visina != other.visina)
	return false;
	return true;
	}

	
	
	
	
	
	
}
