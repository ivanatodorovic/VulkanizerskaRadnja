package gume.radnja;

import java.util.LinkedList;

import gume.AutoGuma;
/**
 * Klasa koja predstavlja vulkanizersku radnju.
 * @author Ivana Todorovic
 * @version 0.0.1
 *
 */
public class VulkanizerskaRadnja {
	/**
	 * Lista (ponuda) guma tipa {@link LinkedList} koje sadrzi jedna Vulkanizerska radnja
	 */
	private LinkedList<AutoGuma> gume =
			new LinkedList<AutoGuma>();
	/**
	 * Metoda koja unosi novu gumu na prvom mestu u listi gume		
	 * @param a nova guma (objekat tipa {@ link AutoGuma})
	 * @throws {@link java.lang.NullPointerException} ukoliko je ulazni parametar (tj. guma) null
	 * @throws {@link java.lang.RuntimeException} ukoliko uneta guma vec postoji u listi
	 */
	public void dodajGumu(AutoGuma a) {
		if (a == null)
			throw new NullPointerException("Guma ne sme biti null");
				if (gume.contains(a))
					throw new RuntimeException("Guma vec postoji");
			gume.addFirst(a);
			}
	/**
	 * Metoda trazi da li postoje u listi  gume sa trazenom markom 
	 * @param markaModel naziv marke modela gume kao {@String}
	 * @return null u slucaju da je uneti parametar null
	 * @return {@link LinkedList} novaLista sa elementima tipa {@link AutoGuma} koji imaju istu markaModel
	 */
	public LinkedList<AutoGuma> pronadjiGumu(String markaModel) {
		if (markaModel == null)
			return null;
		LinkedList<AutoGuma> novaLista = new LinkedList<AutoGuma>();
			for(int i=0;i<gume.size();i++)
				if (gume.get(i).equals(markaModel))
					novaLista.add(gume.get(i));
			return novaLista;
			}

}
