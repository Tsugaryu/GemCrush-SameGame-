import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;


/**
*La classe <code>Dessinateur</code> est utilis&eacute;e 
*pour d&eacute;finir quel type d'image doit être dessin&eacute;e en fonction des méthodes de <code>Pierre</code>
*
*@version 0.1
*@author Axel Durand
*/
public class Dessinateur extends JComponent{
    /**
    *Variable permettant de d&eacute;finir le chargement de l'image correspondant au pion rouge
    */
      private Image red;
    /**
    *Variable permettant de d&eacute;finir le chargement de l'image correspondant au pion bleu
    */
      private Image blue;
    /**
    *Variable permettant de d&eacute;finir le chargement de l'image correspondant au pion vert 
    */
      private Image green;
    /**
    *flag permettant de d&eacute;finir si l'&eacute;tat d'une pierre est effac&eacute;.Doit être initialis&eacute; au moment de l'appel du constructeur a false(il est déconseill&eacute; de l'initialiser à true)
    */
    public boolean flagEffacer;
    /**
    *flag permettant de définir si l'&eacute;tat d'une pierre est survol&eacute;.Doit être initialis&eacute; au moment de l'appel du constructeur a false(il est déconseill&eacute; de l'initialiser à true)
    */
    public boolean flagSurvoler;
     /**
    *Socle qui contiendra les valeurs dans un tableau bidimensionnel remplis avec remplissageAleatoire ou remplissageCombinatoire
    */
    private Socle Grille;
     /**
    *compteur permettant de d&eacute;finir une case du tableau
    */
    private int i;
    /**
    *compteur permettant de d&eacute;finir une case du tableau
    */
    private int j;
    /**
    *Constructeur chargeant les trois images de chaque pion en  les attribuants au variables cit&eacute;s pr&eacute;cedemment.Il doit être crée dans une boucle
    *Socle Grille demande un objet Socle remplis
    *boolean flagEffacer  à initialis&eacute; à false
    *boolean flagSurvoler à initialis&eacute; à false
    *int i doit être lanc&eacute; dans une boucle
    *int j doit être lanc&eacute; dans une boucle
    */
      public Dessinateur(Socle Grille,boolean flagEffacer,boolean flagSurvoler,int i,int j) {
          super();
          /*Chargement des images*/
          red= Toolkit.getDefaultToolkit().getImage("Red2.png");
          blue= Toolkit.getDefaultToolkit().getImage("Blue2.png");
          green= Toolkit.getDefaultToolkit().getImage("Green2.png");
          /*Liaison des paramètres à la classe*/
          this.flagEffacer=flagEffacer;
          this.flagSurvoler=flagSurvoler;
          this.Grille=Grille;
          this.i=i;
          this.j=j;
          /*permet d'éviter l'erreur de condition au début d'une boucle */
          this.i++;
          this.j++;
      }
    /**
    *Dessine les images en fonction du résultat de estRouge,estVert et estBleu de la classe <code>Pierre</code>
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
          Socle Grille=new Socle(10,15);//déclaration de la grille qui permet de remplir les valeurs à vérifier
          Pierre Ours=new Pierre();//déclaration de l'objet permettant de déterminer la forme de l'objet
          //vérifier this.grille.grille n'est pas nulle
          for(int i=0;i<10;i++){
             for(int j=0;j<15;j++){
                 System.out.println(Grille.checkSurvoler[i][j]);
             }
            }
          Grille.remplissageAleatoire(Grille);//On remplit la grille 
          for(int i=0;i<this.i;i++)
          {
            for(int j=0;j<this.j;j++)
            {
             if (flagEffacer==true && i==this.i-1 && j==this.j-1)this.Grille.Grille[i][j]=0;//si le flag arrive à la dernière case lié au constructeur de j alors on peut modifier la valeur du tableau pour ne pas toucher au précédente même raisonnement pour les conditions suivantes
             if(flagSurvoler==true  && i==this.i-1 && j==this.j-1 && flagEffacer==false){
             /*Réaliser survol de groupe:on verifie que la case actuelle est survolé puis on regarde si les cases de chaq direction  avc methode aGauche...si vrai ensuite on verifie si le membre est equivalent à l'une des cases survolés sinon on le set a false */
             secondPinceau.setColor(Color.YELLOW);
             secondPinceau.fillRect(0,0,100,100);
             flagSurvoler=false;
             }
             if(Ours.estRouge(this.Grille.Grille[i][j])==true && i==this.i-1 && j==this.j-1)    secondPinceau.drawImage(red,0,0,this);
             else if(Ours.estBleu(this.Grille.Grille[i][j])==true && i==this.i-1 && j==this.j-1)    secondPinceau.drawImage(blue,0,0,this);
             else if(Ours.estVert(this.Grille.Grille[i][j])==true && i==this.i-1 && j==this.j-1)    secondPinceau.drawImage(green,0,0,this);
            }
          }
      }
      public static void main(String[] args) {
          JFrame fenetre = new JFrame("Same Game");
          GridLayout gestionnaire = new GridLayout(10,15);
          fenetre.setLayout(gestionnaire);
          fenetre.setSize(1500,750);
          fenetre.setLocation(200,200);
          fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

          Socle Grille=new Socle(10,15);//déclaration de la grille qui permet de remplir les valeurs à vérifier
          Grille.remplissageAleatoire(Grille);//On remplit la grille 

          for(int i=0;i<10;i++){
            for(int j=0;j<15;j++) {
             //Grille.remplissageAleatoire(Grille);
             Dessinateur dessin = new Dessinateur(Grille,false,false,i,j);
             ControlSouris souris=new ControlSouris(dessin);
             Deplacement deplacer=new Deplacement(dessin);
             fenetre.add(dessin);
             dessin.addMouseListener(souris);
             //deplacer.deplacementVerticale(Grille.Grille);
             //deplacer.deplacementHorizontale(Grille.Grille);
             dessin.repaint();
             
            }
          }
          fenetre.setVisible(true);
      }
}