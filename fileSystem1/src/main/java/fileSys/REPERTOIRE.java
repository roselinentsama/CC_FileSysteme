package fileSys;

/*
 * Auteur: Roseline et Amine
 * cette classe est une impl�mentation d'un repertoire qui int�gre d'autre repertoire 
 * et des fichiers
 */
  
import fileSysTest.repertoireException;

import java.util.ArrayList;

public class REPERTOIRE extends RACINE {
	
	private ArrayList <RACINE> doc = new ArrayList<RACINE>();

	/*
	 * initialisation du repertoire 
	 */
	public REPERTOIRE(String nom) {
		super(nom);
		
	}

/*
 * Ajout d'une refernce dans un repertoire 
 */
public void Ajouter(RACINE f){
	if(f==null)throw new repertoireException("on ne peut pas ajouter une r�f�rence nulle dans un repertoire");
	System.out.println("erreur,il faut saisir une r�f�rence");
	for(RACINE r : doc)
	{
		if(r.getNom().equals(f.getNom()))throw new repertoireException("on ne peut pas ajouter une r�ference de meme nom");
		System.out.println("erreur,d'ajout");
			
	}
	if(this.equals(f))throw new repertoireException("on ne peut pas ajouter un repertoire dans un repertoire");
	
	doc.add(f);
}

	/*
	 * 
	 * @see fileSys.RACINE#ouvrir()
	 * consultation de tout ce qui se trouve dans le repertoire
	 */
	@Override
	public void ouvrir() {
		System.out.println("\n Nom du repertoire :" + super.getNom()  +   " ; Nom de la r�f�rence : " + this.doc);
		
		
	}
/*
 * 
 * cette m�thode permet de calculer la somme de taille de tous les fichiers qui se trouve dans un repertoire
 */
	@Override
	public int Taille() {
		int taille=1;
		if(taille==0)throw new repertoireException("erreur sur le calcul de la taille");
		{System.out.println("erreur la taille ne peut pas etre 0");}
		if(taille<1)throw new repertoireException("erreur sur le calcul de la taille");
		{System.out.println("erreur la taille ne peut pas etre n�gatif");}
		
		for (RACINE r : doc){
			
			taille+=r.Taille();
			
		System.out.println("\n la taille est :" + taille);
		}
		
		return taille;
		
	}
	 
	

}
