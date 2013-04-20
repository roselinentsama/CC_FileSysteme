package fileSysTest;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

import fileSys.RACINE;
import fileSys.REPERTOIRE;

public class testRepertoire1 {

	/*
	 * ce test lève une exception si l'utilisateur ajoute un repertoire de même dans le repertoire
	 */
	@Test(expected=repertoireException.class)
	public void testAjoutMemeRepertoire() {
		REPERTOIRE rep = new REPERTOIRE("reper");
		rep.Ajouter(rep);
		assertSame(rep, rep);
			
	}
	
	/*
	 * ce test léve une exception si l'utilisateur ajoute une reference de meme nom dans un repertoire
	 */
	
	@Test(expected=repertoireException.class)
	public void testAjoutMemeFichier() {
		REPERTOIRE rep = new REPERTOIRE("reper");
		RACINE fiche=null;
		rep.Ajouter(fiche);
		rep.Ajouter(fiche);
		assertSame(fiche, fiche);
			
		
	}
	
	/*
	 * ce test lève une exception parce qu'on ne peut pas ajouter une référence nulle dans un repertoire
	 */
	
	@Test(expected=repertoireException.class)
	public void testAjoutReferenceNull() {
		REPERTOIRE rep = new REPERTOIRE("reper");
		RACINE fiche=null;
		rep.Ajouter(fiche);
		assertNull(fiche);
		
			
		
	}
	/*
	 * ce test leve l'exception parce que la taille d'un repertoire ne peut pas etre null
	 */
	
	@Test(expected=repertoireException.class)
	public void testtailleNull() {
		REPERTOIRE rep = new REPERTOIRE("reper");
		RACINE fiche1=null;
		rep.Ajouter(fiche1);
		
		rep.Taille();
		assertTrue(rep.Taille()==0);
		
				
		
	}
	
	/*@Test(expected=repertoireException.class)
	public void testtailleNegatif() {
		REPERTOIRE rep = new REPERTOIRE("reper");
		FICHIER fiche = new FICHIER("fiche", -1);
		rep.Ajouter(fiche);
		
		rep.Taille();
		assertTrue(rep.Taille() < -1);
		
	}	*/


}
