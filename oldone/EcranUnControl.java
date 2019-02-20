import javax.swing.JButton;

import javax.swing.JFrame;

import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;

import java.io.File;





/**

*La classe <code>EcranUnControl</code> est utilis&eacute;e 

*pour controler le clic sur deux  boutons et appeler alors le deuxième écran et l'une des m&eacute;thodes choisies

*

*@version 0.1

*@author Axel Durand

*/

public class EcranUnControl implements ActionListener{

    /**

*Composante priv&eacute;e correpondant au bouton qui appellera la m&eacute;thode remplissageAleatoire de <code>Socle</code>

*/

    private JButton Aleatoire;

    /**

*Composante priv&eacute;e correpondant au bouton qui appellera la m&eacute;thode remplissageCombinatoire de <code>Socle</code>

*/

    private JButton  Combi;

            /**

*Composante priv&eacute;e correpondant a la fenetre  qui permet de passer de passer du menu à l'&eacute;cran de jeu.

*/

    private JFrame frame;
    
    private JButton beacon;

/**

*Constructeur permettant de d&eacute;finir les deux boutons à "comparer"et qui ex&eacute;cuterons 

*une des deux m&eacute;thodes

*@param a

*Correspond aux boutons d&eacute;clenchant le mode al&eacute;atoire.

*@param c

*Correspond aux boutons d&eacute;clenchant le remplissage par fichier.

*@param frame

*Permet de relier les deux &eacute;crans.

*/

    public EcranUnControl(JButton a,JButton c,JFrame frame){

        this.Aleatoire=a;

        this.Combi=c;

        this.frame=frame;

    }
        public EcranUnControl(JButton a,JButton c,JButton b,JFrame frame){

        this.Aleatoire=a;

        this.Combi=c;
        
        this.beacon=b;

        this.frame=frame;

    }

    /**

*m&eacute;thode permettant d'appeler soit remplissageAleatoire,soit remplissageCombinatoire de <code>Socle</code>

*

*/

    @Override

    public void actionPerformed(ActionEvent e)

    {

        Object  source=e.getSource();

            int mode=1;

        if  (source==this.Aleatoire){

            File fantoche=new File("fichier");

            this.frame.dispose();
            System.out.println("1");
            EcranJeu game=new EcranJeu(mode,fantoche);

        }

        

        if (source==this.Combi){

            mode=2;

            System.out.println("Combi");

            File fichier=Socle.choixFichier();

             this.frame.dispose();

            EcranJeu game=new EcranJeu(mode,fichier);

            }
         if(source==this.beacon){
            mode=3;
             this.frame.dispose();
             EcranPhare beacon =new EcranPhare(mode);
         }

    }

}



/*

zieuter

class GUI{

protected JFrame fenetre;

protected JPanel panel;

protected Container c;

 

public GUI{

fenetre=new JFrame("structures");

c=fenetre.getContentPane();

panel=new JPanel();

}

 

public void ajouter(){

 

c.add(panel);

}

public void effacer(){

c.remove(panel); //j'ai aussi essayé de faire fenetre.remove(panel);

}

}*/