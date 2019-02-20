/**

*La classe <code>Deplacement</code> est utilis&eacute;e 

*pour d&eacute;finir les d&eacute;placements horizontaux et verticaux au moment d'un clic.

*

*@version 0.1

*@author Benjamin Declercq

*/

    public class Deplacement{

/**

*Renvoie  à partir d'un tableau qui a subit des clics une version de celui-ci où les valeurs cliqu&eacute;es sont d&eacute;plac&eacute;es selon le principe du Same Game de mani&egrave;re    *verticale.

*@param  tab

*Ce tableau doit être le tableau principale sur lequel se d&eacute;roule le jeu.

*@return

*Renvoie le tableau avec ses cases modifi&eacute;es.

*/

        public static int[][] deplacementVerticale(int tab[][]){

            for(int i = 9; i >= 1 ; i--){

                for(int j = 0; j < 15 ; j++){

                    if(tab[i][j] == 0){ //on verif si la case au dessus

                        int up=i-1;

                        while(tab[up][j] ==0 && up!=0){

                            up =up-1;

                        }

                        tab[i][j] = tab[up][j];

                        tab[up][j] = 0;

                    }

                }

            }

            return tab;

        }

/**

*Renvoie  à partir d'un tableau qui a subit des clics une version de celui-ci où les valeurs cliqu&eacute;es sont d&eacute;plac&eacute;es selon le principe du Same Game de mani&egrave;re    *horizontale.

*@param tab

*Ce tableau doit être le tableau principale sur lequel se d&eacute;roule le jeu.

*@return

*Renvoie le tableau avec ses cases modifi&eacute;es.

*/

        public static int[][] deplacementHorizontale(int tab [][]){

            try{

                for(int j = 0; j < 14 ; j++){

                    int ligneVide = 0;

                    for(int i = 0; i < 10; i++){

                        if(tab[i][j] == 0)  ligneVide++;

                            if(ligneVide == 10){

                                int left = j+1;

                                while(tab[i][left] ==0 && left!=0){

                                    left =left+1;

                                }

                                for(int k = 0; k < 10 ; k++){//balayage vertical

                                    tab[k][j] = tab[k][left];

                                    tab[k][left] = 0;

                                }

                            }

                        }

                    }

                }catch(ArrayIndexOutOfBoundsException e){

                   System.err.println("Limite dépassée ");

                

                }

                return tab;

            }

        }