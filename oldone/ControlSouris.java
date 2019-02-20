import javax.swing.JLabel;

import javax.swing.JFrame;

import java.awt.event.MouseEvent;

import java.awt.event.MouseListener;

import java.awt.event.MouseMotionListener;



/**
*La classe <code>ControlSouris</code> est utilis&eacute;e 
*pour d&eacute;finir les actions d'une classe au moment d'un clic ou d'un survol grâce aux interfaces MouseListener et MouseMotionListener
*
*@version 0.1
*@author Axel Durand
*/

public class ControlSouris implements MouseListener,MouseMotionListener{

    /**
    *Composante priv&eacute; qui permet de faire les modifications n&eacute;cessaires à l'objet qui a &eacute;t&eacute; pris en param&egrave;tre dans le constructeur.
    */

      private Dessinateur dessin;

   /**
    * Composante priv&eacute; qui permet d' &eacute;tablir le repaint sur la fenêtre enti&egrave;re
    */

      private JFrame frame;

           /**
         * Composante priv&eacute; qui récup&egrave;re la grille et effectue des op&eacute;rations dessus
         */

        private Socle grille;

 /**
         * Composante priv&eacute; qui récup&egrave;re le score en mémoire
         */

        private  Score res;

                /**
         * Composante priv&eacute; qui récup&egrave;re le label sur lequel s'affiche le Score.
         */

       

        private JLabel label;

/**
    *Constructeur qui demande de prendre en param&egrave;tre le Dessinateur qui sera à l'&eacute;coute,le Socle contenant les tableaux de donn&eacute;es et la fenêtre qui permet de redessiner totalement la grille.
    *@param dessin
    *Prend en écoute l'instance Dessinateur.
    *@param grille
    *Prend la grille à l'écoute.
    *@param fenetre 
    *fenetre sur laquelle s'applique les repaints.
    *@param resultat
    *Permet le calcul et l affichage des resultats.
    *@param etiquette
    *label sur lequel apparait le score.
    */

      public ControlSouris(Dessinateur dessin,Socle Grille,JFrame fenetre,Score resultat,JLabel etiquette)

      {

          this.dessin=dessin;//fait la liaison entre dessin de la classe et dessin donné en paramètre au constructeur 

           this.grille=Grille;

           this.frame=fenetre;

           this.res=resultat;

           this.label=etiquette;

          

      }

     /**
    *Fonction qui au moment du clic fait disparaître toutes les images qui sont survol&eacute;es  .
    */

      @Override

      public void mouseClicked(MouseEvent e){

      Deplacement deplacer=new Deplacement();

      this.grille.survolerAEffacer(this.grille.checkSurvoler, this.grille.checkEffacer);

      this.grille.setEffaceGrille(this.grille.checkEffacer,this.grille.Grille);

      //Score.calcul(this.res,this.grille.checkSurvoler);

      

      

      int temp = Score.calcul(this.res,this.grille.checkSurvoler);

      this.label.setText("Score : "+temp);

      this.grille.setFalse(this.grille.checkSurvoler);

      deplacer.deplacementVerticale(this.grille.Grille);

      deplacer.deplacementHorizontale(this.grille.Grille);

      if(Fin.end(this.grille)==true){

            this.label.setText("Game Over: "+temp);
            this.frame.dispose();
            EcranFin end=new EcranFin(temp);
            
      }

      this.frame.repaint();

      }

     /**
    *Fonction qui au moment du clic fait disparaître toutes les images qui sont survol&eacute;es  .
    */

      @Override

      public void mouseEntered(MouseEvent e){



           for(int i=0;i<=this.dessin.getCoordonneeAbscisse();i++){

           for(int j=0;j<=this.dessin.getCoordonneeOrdonnee();j++){

           if(this.grille.checkEffacer[i][j]==false && i==this.dessin.getCoordonneeAbscisse() && j==this.dessin.getCoordonneeOrdonnee()){

            this.grille.checkSurvoler[i][j]=true;

            Recursion.parcours(this.grille.Grille[i][j],j,i,this.grille);

          if(this.grille.comparaisonPhareJoueur(this.grille.beaconTab,this.grille.checkSurvoler)==true){ 
                int temp = Score.soustraction(this.res,this.grille.checkSurvoler);

              this.label.setText("Score : "+temp);
              this.grille.survolerAEffacer(this.grille.checkSurvoler, this.grille.checkEffacer);

             this.grille.setEffaceGrille(this.grille.checkEffacer,this.grille.Grille);

            }

           }

           }

      }

  

      this.frame.repaint();

      }

           /**
    *Fonction qui s'il n' y a pas eu de clic, retire la couleur de l'image survol&eacute;es quand on sort de la zone d'une image.
        */

      @Override

public void mouseExited(MouseEvent e){

              for(int i=0;i<10;i++){

           for(int j=0;j<15;j++){

           if(this.grille.checkEffacer[i][j]==false)  this.grille.setFalse(this.grille.checkSurvoler);

         }

       }



      this.frame.repaint();

      }

@Override

public void mouseReleased(MouseEvent e) {

     

}

public void mousePressed(MouseEvent e){}

public void mouseMoved(MouseEvent e){}

public void mouseDragged(MouseEvent e){}

}

/*

Rapport:structure presentation des classes en générale

*/
