package org.java.books;

public class Libro {
	private String titolo;
	private int nPagine;
	private String autore;
	private String editore;
	
	public Libro(String titolo, int nPagine, String autore, String editore) throws Exception {
		setTitolo(titolo);
		setnPagine(nPagine);
		setAutore(autore);
		setEditore(editore);
	}
//Quando vengono inseriti i dati, verificare che siano corretti 
//(*es.* non accettare titolo o autore o editore vuoto, numero pagine ≤ 0).
//Se ci sono errori, lanciare un’eccezione e gestirla mostrando in console il tipo di errore.
	
	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) throws Exception {
		if(titolo == null || titolo.isEmpty()|| titolo.length()<2)
			throw new Exception("title must be at least of 2 character");
		this.titolo = titolo;
	}

	public int getnPagine() {
		return nPagine;
	}

	public void setnPagine(int nPagine) throws Exception {
		if(nPagine <= 0 )
			throw new Exception("pages number must be at least 1");
		
		this.nPagine = nPagine;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) throws Exception {
		if(autore == null || autore.isEmpty()|| autore.length()<3)
			throw new Exception("autor must be at least 3 character");
		this.autore = autore;
	}

	public String getEditore() {
		return editore;
	}

	public void setEditore(String editore) throws Exception {
		if(editore == null || editore.isEmpty()|| editore.length()<5)
			throw new Exception("editor must be at least 5 character");
		this.editore = editore;
	}
	
	@Override
	public String toString() {
		
		return "Libro: " + getTitolo() + "\n"
				+ "autore: " + getAutore() + "\n"
				+ "editore: " + getEditore()+ "\n"
				+ "numero pagine: " + getnPagine() + "\n ---------------\n";
	}
}
