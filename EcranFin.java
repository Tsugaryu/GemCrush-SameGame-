import javax.swing.*;
import java.awt.*;

/** La classe EcranFin affiche le score final et permet soit de quitter le jeu,soit de revenir à l'écran de d&eacute;part.
*Elle est &eacute;cout&eacute;e par EcranFinControl.
*@author Axel Durand
*@version 1.0
*/

public class EcranFin extends JFrame{
    private int score;
    public EcranFin(int score){
        
        this.score=score;//récupération du score final

        JFrame fenetre=new JFrame("SameGame-Fin");

        fenetre.setSize(400,400);

        fenetre.setLocation(0,0);

        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

             /* Création de REMPLISSAGE ALEATOIRE */

        JPanel panneau=new JPanel();

        JLabel scoreFinal=new JLabel();
        scoreFinal.setText("Game Over : "+this.score);
        scoreFinal.setHorizontalAlignment(JLabel.CENTER);
        
         JButton retour=new JButton("REJOUER");
         retour.setPreferredSize(new Dimension(1500/6,750/6));
         //retour.setVerticalAlignment(JButton.SOUTH);
         retour.setHorizontalAlignment(JButton.LEFT);
         
          JButton quit=new JButton("QUITTER");
          quit.setPreferredSize(new Dimension(1500/6,750/6));
          //quit.setVerticalAlignment(JButton.SOUTH);
          quit.setHorizontalAlignment(JButton.RIGHT);
          
          panneau.add(retour);
          panneau.add(quit);
           
          EcranFinControl control=new EcranFinControl(retour,quit,fenetre);
          retour.addActionListener(control);
          quit.addActionListener(control);
           
          fenetre.add(scoreFinal,BorderLayout.NORTH);
          fenetre.add(panneau);
          fenetre.setVisible(true);
          this.setVisible(true);
    }
}