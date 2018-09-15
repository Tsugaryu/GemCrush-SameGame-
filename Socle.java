import java.util.Random;
/**
*La classe <code>Socle</code> est utilis&eacute;e 
*pour remplir une Grille par un fichier ou de manière aléatoire.
*
*@version 0.1
*@author Axel Durand
*/
public class Socle{
    /**
    *Grille servant au remplissage.
    */
          public  int[][] Grille;
          public boolean[][] checkEffacer;
          public boolean[][] checkSurvoler;

    /**
    *Constructeur permettant de d&eacute;finir la hauteur et la largeur de la grille 
    qui sera de
    *@param largeur  10 
    *@param hauteur 15
    *et cr&eacute;e ainsi un tableau bidimensionnelle
    */
          public Socle(int largeur,int hauteur){
            int[][] tab=new int[largeur][hauteur];
            boolean[][] tab2=new boolean[largeur][hauteur];
            this.Grille=tab;
            this.checkEffacer=tab2;
            this.checkSurvoler=tab2;
            Socle.setFalse(this.checkEffacer);
            Socle.setFalse(this.checkSurvoler);
          }
    /**
    *Renvoie un tableau bidimensionnel d'un objet Socle qui sera rempli al&eacute;atoirement.
    */
          public static int[][] remplissageAleatoire(Socle Grille){
            Random generateur=new Random();//création générateur aleatoire
            try{//on vérifie l'erreur de génération
                   for(int i=0;i<10;i++){
                    for(int j=0;j<15;j++){
                        int valeur= generateur.nextInt(3+1-1);//passage des valeurs entre 0 et 2 
                        Grille.Grille[i][j]=valeur;
                        Grille.Grille[i][j]+=1;/*rajoute 1 pour avoir des valeurs entre 1 et 3*/
                                  /*remplacer les valeurs par des lettres */
                    }
                   }
            }catch(NullPointerException e){
             System.err.println("Erreur de génération");
            }
            return Grille.Grille;//renvoie le tableau bidimensionnelle
            }
          public static boolean[][] setFalse(boolean[][] tab){
            for(int i=0;i<10;i++){
             for(int j=0;j<15;j++){
                 tab[i][j]=false;
             }
            }
            return tab;
          }
/*public int[][] remplissageCombinatoire(){}*/


/*       Main de Test

public static void main(String[] args){
Socle s=new Socle(10,15);
s.remplissageAleatoire(s);
for(int i=0;i<10;i++){
for(int j=0;j<15;j++){
System.out.println(s.Grille[i][j] + ",");
}
System.out.println();
}

} */
}
