/**
*La classe <code>Score</code> est utilis&eacute;e 
*pour calculer le score d'un SameGame au moment d'un clic.
*
*
*@version 0.1
*@author Benjamin Declercq
*/
public class Score{
/** 
*Composante priv&eacute;e  m&eacute;morisant le score de la partie.
*/
    private int calculateur;
/**
*Constructeur qui initialise le Score à 0 au moment de sa cr&eacute;ation.
*/
//Auteur constructeur:Axel Durand

    public Score(){
    this.calculateur=0;
    }

/**
*M&eacute;thode qui permet le calcul du score.
*@param calculScore
*Objet Score qui est appel&eacute; à chaque clic et qui calcule le score. 
*@param tabsurvoler
*Contient les valeurs des cases survol&eacute;es qui correspondent aux cases qui seront effac&eacute;es lors du clic.
*@return 
*Renvoie la valeur du score
*/

    public static int calcul (Score calculScore,boolean[][] tabsurvoler){

        int nbrCasesSuprimes=0;

        //System.out.println("Entree"+calculScore.calculateur);

        for(int i=0;i<10;i++){//balayage horizontale

            for(int j=0;j<15;j++){//balayage verticale

            if(tabsurvoler[i][j]==true){

            nbrCasesSuprimes++;

            }
            }
        }

        if(nbrCasesSuprimes == 0 || nbrCasesSuprimes == 1){

        return calculScore.calculateur;

        }
        else 

        //System.out.println(nbrCasesSuprimes);

        calculScore.calculateur+=((nbrCasesSuprimes-2)*(nbrCasesSuprimes-2));//calcul du score (score precedant +point obtenus)

        //System.out.println("AvantSortie"+calculScore.calculateur);

        return calculScore.calculateur;

    }
/**
*@author Axel Durand
*M&eacute;thode qui permet le calcul du score soustrait.
*@param calculScore
*Objet Score qui est appel&eacute; à chaque clic et qui calcule le score. 
*@param tabsurvoler
*Contient les valeurs des cases survol&eacute;es qui correspondent aux cases qui seront effac&eacute;es lors du clic.
*@return 
*Renvoie la valeur du score
*/

    public static int soustraction(Score calculScore,boolean[][] tabsurvoler){
         int nbrCasesSuprimes=0;
        for(int i=0;i<10;i++){//balayage horizontale

            for(int j=0;j<15;j++){//balayage verticale

            if(tabsurvoler[i][j]==true){

            nbrCasesSuprimes++;

            }

            }

            

        }

        if(nbrCasesSuprimes == 0 || nbrCasesSuprimes == 1){

        return calculScore.calculateur;

        }
        else

        //System.out.println(nbrCasesSuprimes);

        calculScore.calculateur-=((nbrCasesSuprimes-2)*(nbrCasesSuprimes-2));//calcul du score (score precedant +point obtenus)

        //System.out.println("AvantSortie"+calculScore.calculateur);

        return calculScore.calculateur;

    }
    /**
    *@author Axel Durand
    */
    public int getScore(){
        return this.calculateur;
    }

}