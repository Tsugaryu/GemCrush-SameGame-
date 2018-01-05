import javax.swing.JComponent;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JPanel;

import java.awt.Color;

import java.awt.Font;

import java.awt.GridLayout;

import java.awt.Graphics;

import java.awt.Image;

import java.awt.Toolkit;

import java.awt.BorderLayout;

import java.io.File;

import java.util.Timer;

public class EcranPhare extends JFrame{
    public EcranPhare(int mode){
            super("Same Game");

          JPanel panneau = new JPanel();

          JLabel etiquette=new JLabel();

          Font font = new Font("Arial",Font.BOLD,24);

          etiquette.setFont(font);

          this.add(etiquette, BorderLayout.NORTH);

          GridLayout gestionnaire = new GridLayout(10,15);

          panneau.setLayout(gestionnaire);

          this.add(panneau);

          this.setSize(1500,750);

          this.setLocation(200,200);

          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

          Score resultat=new Score();

          Socle Grille=new Socle(10,15);//déclaration de la grille qui permet de remplir les valeurs à vérifier

          Grille.remplissageAleatoire(Grille);//On remplit la grille 

          etiquette.setText("Score:");

//""+Score.calcul(res,Grille.checkSurvoler)

          for(int i=0;i<10;i++){

          for(int j=0;j<15;j++) {

          Dessinateur dessin = new Dessinateur(Grille,i,j);

         ControlSouris souris=new ControlSouris(dessin,Grille,this,resultat,etiquette);

         panneau.add(dessin);

         dessin.addMouseListener(souris);

          }
          Timer ti=new Timer();
          ti.schedule(new Phare(10,15,Grille),0,5*1000);

}


  this.setVisible(true);
    }
}