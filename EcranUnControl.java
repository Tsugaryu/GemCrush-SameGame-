import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
*La classe <code>EcranUnControl</code> est utilis&eacute;e 
*pour controler le clic sur un bouton al&eacute;atoire et appeler alors le deuxième écran et l'une des méthodes choisies
*
*@version 0.1
*@author Axel Durand
*/
public class EcranUnControl implements ActionListener{
    /**
*Composante priv&eacute;e correpondant au bouton qui appellera la m &eacute;thode remplissageAleatoire de <code>Socle</code>
*/
    private JButton Aleatoire;
    /**
*Composante priv&eacute;e correpondant au bouton qui appellera la m &eacute;thode remplissageCombinatoire de <code>Socle</code>
*/
    private JButton  Combi;
/**
*Constructeur permettant de d&eacute;finir les deux boutons à "comparer"et qui ex&eacute;cuterons 
une des deux méthodes
*/
    public EcranUnControl(JButton a,JButton c){
        this.Aleatoire=a;
        this.Combi=c;
    }
    /**
*méthode permettant d'appeler soit remplissageAleatoire,soit remplissageCombinatoire de <code>Socle</code>
*/
    @Override
    public  void    actionPerformed(ActionEvent e)
    {
        Object  source=e.getSource();

        if  (source==Aleatoire)
            System.out.println("Aleatoire");
        else if (source==Combi)
            System.out.println("Combi");
    }
}

