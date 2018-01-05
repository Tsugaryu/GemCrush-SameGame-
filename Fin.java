/**
*La classe <code>Fin</code> est utilis&eacute;e 
*pour d&eacute;finir la fin d'une partie.
*
*
*@version 0.1
*@author Benjamin Declercq 
*/
public class Fin{
/**
*Permet de d&eacute;finir la fin du jeu 
*@param grille
*Objet sur lequel la v&eacute;rification s' applique.
*
*@return 
*renvoie un booleen true si la partie est fini.
*/
	public static boolean end(Socle grille){
            int gameover = 0;
		for(int i=9;i>=1;i--){
                  for(int j=0;j<15;j++){
            	     if (grille.Grille[i][j]!=0){
                              try{
            	                 if (grille.Grille[i][j] == grille.Grille[i+1][j] || grille.Grille[i][j] == grille.Grille[i-1][j] || grille.Grille[i][j] == grille.Grille[i][j+1] || grille.Grille[i][j] == grille.Grille[i][j-1])
                                    gameover = 1;
                              }catch(ArrayIndexOutOfBoundsException e){
                              }
                        }
                  }
            }
            if (gameover==0){
                  System.out.println("Fin de partie.");
                  return true;
            }
            else
                  return false;
	}
}