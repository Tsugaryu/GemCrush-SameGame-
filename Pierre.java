
import java.util.*;

/**
 *La classe <code>Pierre</code> est utilis&eacute;e
*pour d&eacute;finir l' &eacute;tat d' une "Pierre" à savoir sa couleur : rouge, vert, bleu, jaune, blanc ou rose.
*et si elle est survol&eacute ou pas
*
*@version 2.0
*@author Axel Durand
 */
public class Pierre {

    /**
     * @param case case du plateau de jeu.
     * @return renvoie true si la case contient l'élément identificateur bleu.
     */
    public static boolean estBleu(int case) {
        if(case==1)return true;
        return false;
    }

    /**
     * @param case case du plateau de jeu.
     * @return renvoie true si la case contient l'élément identificateur rouge
     */
    public static boolean estRouge(int case) {
        if(case==2)return true;
        return false;
    }

    /**
     * @param case case du plateau de jeu.
     * @return renvoie true si la case contient l'élément identificateur vert
     */
    public static boolean estVert(int case) {
        if(case==3)return true;
        return false;
    }

    /**
     * @param case case du plateau de jeu.
     * @return renvoie true si la case contient l'élément identificateur rose
     */
    public static boolean estRose(int case) {
        if(case==4)return true;
        return false;
    }

    /**
     * @param case case du plateau de jeu.
     * @return renvoie true si la case contient l'élément identificateur jaune
     */
    public static boolean estJaune(int case) {
        if(case==5)return true;
        return false;
    }

    /**
     * @param case case du plateau de jeu.
     * @return renvoie true si la case contient l'élément identificateur blanc
     */
    public static boolean estBlanc(int case) {
        if(case==6)return true;
        return false;
    }

}
