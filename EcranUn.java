import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.BorderLayout;

/**
*La classe <code>EcranUn</code> est utilis&eacute;e 
*pour cr&eacute;er l'environnement n&eacute;cessaire au fonctionnement de la classe <code>EcranUnControl</code>
*
*@version 0.1
*@author Axel Durand
*/
public class EcranUn{
  
    public static void main(String[] args){
        JFrame fenetre=new JFrame("TestEcran");
        fenetre.setSize(1500,750);
        fenetre.setLocation(0,0);
    	fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //ButtonGroup bg=new ButtonGroup();
        JPanel panneau=new JPanel();
        JButton alea=new JButton("alea");
        JButton combi=new JButton("combi");
        
        
        fenetre.add(alea,BorderLayout.NORTH);
        fenetre.add(combi,BorderLayout.SOUTH);

        EcranUnControl control=new EcranUnControl(alea,combi);
        
        alea.addActionListener(control);
        combi.addActionListener(control);
         
        fenetre.setVisible(true);
    }
    


}