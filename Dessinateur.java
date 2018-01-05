import javax.swing.JComponent;

import javax.swing.JFrame;

import java.awt.Color;

import java.awt.GridLayout;

import java.awt.Graphics;

import java.awt.Image;

import java.awt.Toolkit;

import java.awt.Font;



/**

*La classe <code>Dessinateur</code> est utilis&eacute;e 

*pour d&eacute;finir quel type d'image doit être dessin&eacute;e en fonction des méthodes de <code>Pierre</code>.

*

*@version 0.1

*@author Axel Durand

*/



public class Dessinateur extends JComponent{



/**

*Composante priv&eacute;e permettant de d&eacute;finir le chargement de l'image correspondant au pion rouge.

*/



private Image red;



/**

*Composante priv&eacute;e permettant de d&eacute;finir le chargement de l'image correspondant au pion bleu.

*/



private Image blue;



/**

*Composante priv&eacute;e permettant de d&eacute;finir le chargement de l'image correspondant au pion vert.

*/



private Image green;



/**

*Composante priv&eacute;e qui contiendra les valeurs dans un tableau bidimensionnel remplis avec remplissageAleatoire ou remplissageCombinatoire.

*/



private Socle Grille;



/**

*Composante priv&eacute;epermettant de d&eacute;finir une case du tableau.

*/



private int i;



/**

*Composante priv&eacute;e permettant de d&eacute;finir une case du tableau.

*/



private int j;



/**

*Constructeur chargeant les trois images de chaque pion en  les attribuants au variables cit&eacute;s pr&eacute;cedemment.Il doit être crée dans une boucle.

*@param Grille

* demande un objet Socle remplis.

*@param i

*doit être lanc&eacute; dans une boucle.

*@param j 

*doit être lanc&eacute; dans une boucle.

*/

private int mode;


    public Dessinateur(Socle Grille,int i,int j) {

        super();

        /*Chargement des images*/

        red= Toolkit.getDefaultToolkit().getImage("Red2.png");

        blue= Toolkit.getDefaultToolkit().getImage("Blue2.png");

        green= Toolkit.getDefaultToolkit().getImage("Green2.png");

        /*Liaison des paramètres à la classe*/

        this.Grille=Grille;

        this.i = i;

        this.j = j;

    }
    public Dessinateur(Socle Grille,int i,int j,int mode) {

        super();

        /*Chargement des images*/

        red= Toolkit.getDefaultToolkit().getImage("Red2.png");

        blue= Toolkit.getDefaultToolkit().getImage("Blue2.png");

        green= Toolkit.getDefaultToolkit().getImage("Green2.png");

        /*Liaison des paramètres à la classe*/

        this.Grille=Grille;

        this.i = i;

        this.j = j;
        
        this.mode=mode;

    }



/**

*@return 

* R&eacute;cupère les coordonn&eacute;es de i.

*/



    public int getCoordonneeAbscisse(){

      return this.i;

    }



/**

*@return

*R&eacute;cup&egrave;re les coordonn&eacute;es de j.

*/



    public int getCoordonneeOrdonnee(){

      return this.j;

    }



/**

*Dessine les images en fonction du résultat de estRouge,estVert et estBleu de la classe <code>Pierre</code> donnée aux coordonnées i et j

*

*/



    @Override

    public void paintComponent(Graphics pinceau) 

    {

        // on crée un nouveau pinceau pour pouvoir le modifier plus tard

        Graphics secondPinceau = pinceau.create();

        // si le composant n'est pas censé être transparent

        if(this.isOpaque()) {

        // on repeint toute la surface avec la couleur de fond

        secondPinceau.setColor(this.getBackground());

        secondPinceau.fillRect(0, 0, this.getWidth(), this.getHeight());

        }

        

        /*En reponse a MouseExited:*/

        if(this.Grille.checkSurvoler[this.i][this.j] == false){

            secondPinceau.setColor(Color.WHITE);

            secondPinceau.fillRect(0,0,100,100);

        }
                /*En réponse à l appel de la fonction de tour */
               if(this.Grille.beaconTab[this.i][this.j] == true && this.Grille.Grille[this.i][this.j] != 0){

            secondPinceau.setColor(Color.RED);
            System.out.println("true");
            secondPinceau.fillRect(0,0,100,100);
        }

        /*En Réponse a MouseEntered*/

        if(this.Grille.checkSurvoler[this.i][this.j] == true && this.Grille.Grille[this.i][this.j] != 0){

            secondPinceau.setColor(Color.YELLOW);

            secondPinceau.fillRect(0,0,100,100);

        }


        /*Affichage des Oursons au rang i j */

        if(Pierre.estRouge(this.Grille.Grille[this.i][this.j]) == true) secondPinceau.drawImage(red,0,0,this);

        else if(Pierre.estBleu(this.Grille.Grille[this.i][this.j]) == true) secondPinceau.drawImage(blue,0,0,this);

        else if(Pierre.estVert(this.Grille.Grille[this.i][this.j]) == true) secondPinceau.drawImage(green,0,0,this);

    }

}