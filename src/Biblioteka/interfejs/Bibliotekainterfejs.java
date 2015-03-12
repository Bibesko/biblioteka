package Biblioteka.interfejs;

import java.util.LinkedList;

import Biblioteka.Autor;
import Biblioteka.Knjiga;

public interface Bibliotekainterfejs {

	public void dodajKnjigu (Knjiga	knjiga);
	public void obrisiKnjigu (Knjiga knjiga);
	public LinkedList<Knjiga> pronadjiKnjigu(String naslov, long ISBN, String izdavac, Autor autor);
	
	
	
}
