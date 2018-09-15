
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
    *Permet de faire les modifications n&eacute;cessaires à l'objet qui a été pris en paramètre dans le constructeur.
    */
      public Dessinateur dessin;
    /**
    *Constructeur qui demande de prendre en paramètre le Dessinateur qui sera à l'écoute.
    */
      public ControlSouris(Dessinateur dessin)
      {
          this.dessin=dessin;//fait la liaison entre dessin de la classe et dessin donné en paramètre au constructeur 
          dessin.addMouseListener(this);
      }
     /**
    *Fonction qui au moment du clic fait disparaitre une image  .
    */
      @Override
      public void mouseClicked(MouseEvent e){
          this.dessin.flagEffacer=true;//on set le flag à true qui est dans la classe Dessinateur à false pour faire disparaitre l'image sur l'écran de jeu
          dessin.repaint();
          //effacer groupe :parcours le tableau pour regarder qui a flagSurvoler=true et a la position correspondante place true à flagEffacer puis repaint();
      }
      public void mouseMoved(MouseEvent e)
      {
          System.out.println("Survol plus");
      }
      public void mouseDragged(MouseEvent e){}
      public void mouseExited(MouseEvent e)
      {
      
      this.dessin.flagSurvoler=true;
      dessin.repaint();
      }
      public void mouseEntered(MouseEvent e){}
      public void mouseReleased(MouseEvent e){}
      public void mousePressed(MouseEvent e){}
}