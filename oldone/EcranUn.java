import javax.swing.JButton;

import javax.swing.JPanel;

import javax.swing.JFrame;

import javax.swing.JLabel;

import java.awt.BorderLayout;

import java.awt.Font;

import java.awt.FlowLayout;

import java.awt.Dimension;



/**

*La classe <code>EcranUn</code> est utilis&eacute;e

*pour cr&eacute;er l'environnement n&eacute;cessaire au fonctionnement de la classe <code>EcranUnControl</code>.

*Elle forme le titre du jeu et les deux boutons écout&eacute;s par EcranUnControl.

*@version 0.1

*@author Axel Durand

*/

    public class EcranUn{
    public EcranUn(){
                JFrame fenetre=new JFrame("TestEcran");

        fenetre.setSize(400,400);

        fenetre.setLocation(0,0);

        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

             /* Création de REMPLISSAGE ALEATOIRE */

        JPanel panneau=new JPanel();

        JButton alea=new JButton("REMPLISSAGE ALEATOIRE");

        alea.setPreferredSize(new Dimension(1500/6,750/6));

        alea.setVerticalAlignment(JButton.CENTER);

             /* Création de REMPLISSAGE PAR FICHIER */

        JButton combi=new JButton("REMPLISSAGE PAR FICHIER");

        combi.setPreferredSize(new Dimension(1500/6,750/6));

        combi.setVerticalAlignment(JButton.CENTER);
        
        /*Création de Phare*/
        JButton phare=new JButton("BEACON MODE");
        phare.setPreferredSize(new Dimension(1500/6,750/6));
        phare.setVerticalAlignment(JButton.CENTER);

             /*CREATION TITRE*/

        JLabel same=new JLabel("Same Game");

        Font font = new Font("Arial",Font.BOLD,24);

        same.setFont(font);

        same.setHorizontalAlignment(JLabel.CENTER);

        /*AJOUT CONTROLEUR ET GESTIONNAIRE*/

        FlowLayout gestionnaire=new FlowLayout(FlowLayout.CENTER,50,50);

        EcranUnControl control=new EcranUnControl(alea,combi,phare,fenetre);

        

        panneau.add(alea);

        panneau.add(combi);
        panneau.add(phare);
        fenetre.add(same,BorderLayout.NORTH);

        

        alea.addActionListener(control);

        combi.addActionListener(control);
        phare.addActionListener(control);


        fenetre.add(panneau,gestionnaire.CENTER);

        fenetre.setVisible(true);
    }

        public static void main(String[] args){

              /*Création de la Fenetre*/

        JFrame fenetre=new JFrame("TestEcran");

        fenetre.setSize(400,400);

        fenetre.setLocation(0,0);

        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

             /* Création de REMPLISSAGE ALEATOIRE */

        JPanel panneau=new JPanel();

        JButton alea=new JButton("REMPLISSAGE ALEATOIRE");

        alea.setPreferredSize(new Dimension(1500/6,750/6));

        alea.setVerticalAlignment(JButton.CENTER);

             /* Création de REMPLISSAGE PAR FICHIER */

        JButton combi=new JButton("REMPLISSAGE PAR FICHIER");

        combi.setPreferredSize(new Dimension(1500/6,750/6));

        combi.setVerticalAlignment(JButton.CENTER);
        
        /*Création de Phare*/
        JButton phare=new JButton("BEACON MODE");
        phare.setPreferredSize(new Dimension(1500/6,750/6));
        phare.setVerticalAlignment(JButton.CENTER);

             /*CREATION TITRE*/

        JLabel same=new JLabel("Same Game");

        Font font = new Font("Arial",Font.BOLD,24);

        same.setFont(font);

        same.setHorizontalAlignment(JLabel.CENTER);

        /*AJOUT CONTROLEUR ET GESTIONNAIRE*/

        FlowLayout gestionnaire=new FlowLayout(FlowLayout.CENTER,50,50);

        EcranUnControl control=new EcranUnControl(alea,combi,phare,fenetre);

         panneau.add(phare);

        panneau.add(alea);

        panneau.add(combi);

        fenetre.add(same,BorderLayout.NORTH);

        

        alea.addActionListener(control);

        combi.addActionListener(control);

        phare.addActionListener(control);

        fenetre.add(panneau,gestionnaire.CENTER);

        fenetre.setVisible(true);

        }
    }