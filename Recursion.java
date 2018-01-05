/**
*La classe <code>Recursion/code> est utilis&eacute;e 
*pour d&eacute;terminer la fin d'une partie.
*
*
*@version 0.1
*@author Benjamin Declercq
*/
public class Recursion{
/**
*Parcours de manière r&eacute;cursive un tableau pour d&eacute;terminer les groupes adjacents.
*
*@param valeur
*repr&eacute;sente la valeur de d&eacute;part sur laquelle se base la r&eacute;cursion.
*@param x 
*repr&eacute;sente le num&eacute;ro de colonnes de la grille.
*@param y
*repr&eacute;sente le num&eacute;ro de lignes de la grille.
*@param grille
*
*@return
*Renvoie le tableau  parcourue.
*@throws
*/
	public static int[][] parcours(int valeur,int x, int y, Socle grille) { //parcour un tableau 2d et marque les cases déjà parcourues

		grille.checkSurvoler[y][x]=true;

		try{
			if (grille.Grille[y][x + 1] == valeur && x < 14 && grille.checkSurvoler[y][x + 1] != true){ 	// on verifie que la case suivante est libre, qu on ne depasse pas la limite de la grille et que la case n'est pas deja ete modifier
	    	//droite
	    		parcours (valeur, x + 1, y, grille);//on rappel la foncton
	    	}
	    }catch(ArrayIndexOutOfBoundsException e){
	    }
	 
	    try{
	    	if (grille.Grille[y][x - 1] == valeur && x > 0 && grille.checkSurvoler[y][x - 1] != true){
	        //gauche
	        	parcours (valeur,x - 1, y, grille);
	 		}
	 	}catch(ArrayIndexOutOfBoundsException e){
	    }

	 	try{
	    	if (grille.Grille[y - 1][x] == valeur && y > 0 && grille.checkSurvoler[y - 1][x] != true){
	        //haut
	        	parcours (valeur,x, y - 1, grille);
	    	}
	    }catch(ArrayIndexOutOfBoundsException e){
	    }	

	 	try{
	    	if (grille.Grille[y + 1][x] == valeur && y < 9 && grille.checkSurvoler[y + 1][x] != true){
	        //bas
	        	parcours (valeur,x, y + 1, grille);
	   		}
	   	}catch(ArrayIndexOutOfBoundsException e){
	    }
	    
	   	return grille.Grille;
	}
    
    /**
    *@author Axel Durand
*Parcours de manière r&eacute;cursive un tableau pour d&eacute;terminer les groupes adjacents.
*
*@param valeur
*repr&eacute;sente la valeur de d&eacute;part sur laquelle se base la r&eacute;cursion.
*@param x 
*repr&eacute;sente le num&eacute;ro de colonnes de la grille.
*@param y
*repr&eacute;sente le num&eacute;ro de lignes de la grille.
*@param grille
*
*@return
*Renvoie le tableau  parcourue.
*@throws
*/
    public static int[][] parcoursPhare(int valeur,int x, int y, Socle grille){
        grille.beaconTab[y][x]=true;

		try{
			if (grille.Grille[y][x + 1] == valeur && x < 14 && grille.beaconTab[y][x + 1] != true){ 	// on verifie que la case suivante est libre, qu on ne depasse pas la limite de la grille et que la case n'est pas deja ete modifier
	    	//droite
	    		parcoursPhare(valeur, x + 1, y, grille);//on rappel la foncton
	    	}
	    }catch(ArrayIndexOutOfBoundsException e){
	    }
	 
	    try{
	    	if (grille.Grille[y][x - 1] == valeur && x > 0 && grille.beaconTab[y][x - 1] != true){
	        //gauche
	        	parcoursPhare(valeur,x - 1, y, grille);
	 		}
	 	}catch(ArrayIndexOutOfBoundsException e){
	    }

	 	try{
	    	if (grille.Grille[y - 1][x] == valeur && y > 0 && grille.beaconTab[y - 1][x] != true){
	        //haut
	        	parcoursPhare(valeur,x, y - 1, grille);
	    	}
	    }catch(ArrayIndexOutOfBoundsException e){
	    }	

	 	try{
	    	if (grille.Grille[y + 1][x] == valeur && y < 9 && grille.beaconTab[y + 1][x] != true){
	        //bas
	        	parcoursPhare(valeur,x, y + 1, grille);
	   		}
	   	}catch(ArrayIndexOutOfBoundsException e){
	    }
	    
	   	return grille.Grille;
    }
}