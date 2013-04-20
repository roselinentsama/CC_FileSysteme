package fileSysTest;

import static org.junit.Assert.*;
import junit.framework.TestCase;


import org.junit.Before;

import org.junit.Test;

import fileSys.FICHIER;
import fileSys.RACINE;
import fileSys.REPERTOIRE;

public class testRepertoire extends TestCase{
	
	
	private REPERTOIRE rep;
	private FICHIER fiche;

	public testRepertoire(String name) {
		super(name);
	}
	@Before
	public void setUp() throws Exception {
		 
		rep = new REPERTOIRE("reper");
		fiche = new FICHIER("fiche", 5);
		
	}
     /* 
      * le test d'initialiation
      */
	@Test
	public void testIntialisation() {
		//REPERTOIRE rep = new REPERTOIRE("reper");
		assertTrue(rep.getNom()=="reper");
		
	}
	/*
	 * initialisation du fichier
	 */
	
	@Test
	public void testIntialisationfichier() {
		//FICHIER fiche = new FICHIER("fiche", 5);
		assertTrue(fiche.getNom()=="fiche");
		assertTrue(fiche.getTaille()==5);
	}
	
	/*
	 * vÈrification si la reference a ete bien ajoute
	 */
	@Test
	public void testAjoutFichier() {
		//REPERTOIRE rep = new REPERTOIRE("reper");
		//FICHIER fiche = new FICHIER("fiche", 5);
		rep.Ajouter(fiche);
		assertNotNull(fiche);
	}
	/*
	 * vÈrification si le repertoire a ÈtÈ bien ajoutÈ
	 */
	@Test
	public void testAjoutRepertoire() {
		//REPERTOIRE rep = new REPERTOIRE("reper");
		REPERTOIRE rep1 = new REPERTOIRE("repertoire");
		rep.Ajouter(rep1);
		assertNotSame(rep, rep1);
		
		}
	/*
	 * VÈrification de la taille du repertoire
	 */
	@Test
	public void testTaille() {
		//REPERTOIRE rep = new REPERTOIRE("reper");
		//FICHIER fiche = new FICHIER("fiche", 5);
		rep.Ajouter(fiche);
		rep.Taille();
		assertFalse(rep.Taille()==5);
		
	}
	
	
	/*
	 * calcule de la taille après ajout de plusieurs fichiers
	 */
	
	@Test
	public void testaille() {
		//REPERTOIRE rep = new REPERTOIRE("reper");
		FICHIER fiche = new FICHIER("fiche", 7);
		FICHIER fic = new FICHIER("fiche1", 6);
		
		rep.Ajouter(fiche);
		rep.Ajouter(fic);
		
		rep.Taille();
		assertTrue(rep.Taille()==14);
		
	}	
	
	/*
	 * consultation du repertoire 
	 */
	@Test
	public void testOuvrirRepertoire() {
		//REPERTOIRE rep = new REPERTOIRE("reper");
		//FICHIER fiche = new FICHIER("fiche", 5);
		rep.Ajouter(fiche);
		rep.ouvrir();
		assertNotNull(fiche);
	}

}

