import java.util.Random;
import java.io.FileWriter;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import javax.swing.JFileChooser;
/**
*La classe <code>Socle</code> est utilis&eacute;e 
*pour remplir une Grille par un fichier ou de manière aléatoire.
*Elle possède aussi deux autres tableaux utilisés pour conserver l état d 'effacement et de survol des cases de la grille 
*
*@version 0.1
*@author Axel Durand
*/
public class Socle{
/**
*Grille servant au remplissage des nombres aléatoires.
*/
    public  int[][] Grille;
/**
*Grille contenant l'état des données qui sont effacées.Si effacées la case au rang i j est égale à true;
*/
    public boolean[][] checkEffacer;
/**
*Grille contenant l'état des données qui sont survolées.Si survolées la case au rang i j est égale à true;
*/
    public boolean[][] checkSurvoler;
    
/**
*Grille contenant l' état des données qui sont survolées par le phare.Si survolées la case au rang i j est égale à true
*/
    public boolean[][] beaconTab;
/**
*Constructeur permettant de d&eacute;finir la hauteur et la largeur de la grille.
*@param largeur
*Représente le nombre de lignes du socle.Pour ce SameGame,il doit y avoir 10 lignes
*@param hauteur 15
*Représente le nombre de colonnes du socle.Pour ce SameGame,il doit y avoir 15 lignes
*et cr&eacute;e ainsi un tableau bidimensionnelle
*/
    public Socle(int largeur,int hauteur){
        int[][] tab=new int[largeur][hauteur];
        boolean[][] tab2=new boolean[largeur][hauteur];
        char[][] tab3=new char[largeur][hauteur];
        this.Grille=tab;
        this.checkEffacer=tab2;
        this.checkSurvoler=tab2;
        this.beaconTab=tab2;
        Socle.setFalse(this.checkEffacer);
        Socle.setFalse(this.checkSurvoler);
        Socle.setFalse(this.beaconTab);
    }
/**
*Doit remplir un tableau bidimensionnel de manière aléatoire entre 1 et 3.
*@param Grille
*Socle qui doit être rempli.
*@return
*Renvoie le tableau bidimensionnelle.
*/
    public  int[][] remplissageAleatoire(Socle Grille){
        Random generateur=new Random();//création générateur aleatoire
        try{//on vérifie l'erreur de génération
            for(int i=0;i<10;i++){
                for(int j=0;j<15;j++){
                    int valeur= generateur.nextInt(3+1-1);//passage des valeurs entre 0 et 2 
                    Grille.Grille[i][j]=valeur;
                    Grille.Grille[i][j]+=1;/*rajoute 1 pour avoir des valeurs entre 1 et 3*/
                }
            }
            }catch(NullPointerException e){
                 System.err.println("Erreur de génération");
        }
        return Grille.Grille;//renvoie le tableau bidimensionnelle
    }
/**
*Initialise les valeurs du tableau a 0.
*@param tab
*Tableau qui doit être remis à 0
*@return
*Renvoie le tableau.
*/
    public  static boolean[][] setFalse(boolean[][] tab){
        for(int i=0;i<10;i++){
            for(int j=0;j<15;j++){
               tab[i][j]=false;
            }
        }
        return tab;
    }
/**
*Copie deux tableaux de booleen servant à l'identification du survol et de l'effacement.
*
*@param tabsurvol
*Tableau destin&eacute; à être la source de la copie.
*@param tabefface
*Tableau destin&eacute; à être la destination de la copie.
*
*@return 
*Renvoie le tableau tabefface.
*/
    public  boolean[][] survolerAEffacer(boolean [][] tabsurvol,boolean[][] tabefface){
        int nbrCasesSuprimes=0;
        for(int i=0;i<10;i++){//balayage horizontale
            for(int j=0;j<15;j++){//balayage verticale
                if(tabsurvol[i][j]==true){
                    nbrCasesSuprimes++;
                }
            }
            
        }
        if(nbrCasesSuprimes == 0 || nbrCasesSuprimes == 1){
        return tabefface;
        }
        for(int i=0;i<10;i++){
            for(int j=0;j<15;j++){
                 if(tabsurvol[i][j]==true)tabefface[i][j]=true;
            }
        }
        return tabefface;
    }
/**
*Convertit deux tableaux servant à l 'identification de  l'effacement et des donn&eacute;es du jeu principal.
*
*@param tabefface
*Tableau destin&eacute; à être la source de la copie.
*@param tabmodif
*Tableau destin&eacute; à être la destination de la copie.
*
*@return 
*Renvoie le tableau tabmodif.
*/
    public  int[][] setEffaceGrille(boolean [][] tabefface,int[][] tabmodif){
        for(int i=0;i<10;i++){
            for(int j=0;j<15;j++){
              if(tabefface[i][j]==true)tabmodif[i][j]=0;
            }
        }
        return tabmodif;
    }
    
    public boolean comparaisonPhareJoueur(boolean[][] beacon,boolean[][] survoljoueur){
        for(int i=0;i<10;i++){
            for(int j=0;j<15;j++){
            if(beacon[i][j]==true && survoljoueur[i][j]==true)return true; BUG BUG
            }
         }
         return false;
    }
/**
*@param fichier 
*Fichier dans lequel se charge le fichier selectionné par JFileChooser.
*@return
*renvoie le fichier selectionn&eacute; par JFileChooser.
*@throws
*Renvoitune IOException.
*/
    public static File choixFichier(){ 
        //JFileChooser choix = new JFileChooser(new File("fichier"));
        //JFileChooser dialogue = new JFileChooser(new File("."));//  la fenêtre de dialogue présentera au départ le contenu du répertoire dont le chemin est indiqué en argument. On peut aussi utiliser le constructeur sans paramètre qui conduirait à avoir une fenêtre de dialogue présentant à l'ouverture le contenu du répertoire de connexion. 
        JFileChooser choix = new JFileChooser();
        PrintWriter sortie;
       File fichier;
        try {
            if (choix.showOpenDialog(null)==JFileChooser.APPROVE_OPTION) {
                fichier = choix.getSelectedFile();
                String nom=choix.getSelectedFile().getName();
                   // chemin absolu du fichier choisi
                 String path=choix.getSelectedFile().getAbsolutePath();
                sortie = new PrintWriter(new FileWriter(fichier.getPath(), true));
                System.out.println("Selected file: " +nom+"  "+path);
                System.out.println("Ouverture reussi!");
                sortie.close();
            }
           
            
       } catch(IOException e) {
               System.err.println("Ouverture rate!");
            }
            fichier=new File(choix.getSelectedFile().getName());
            return fichier;
    }

/**
*@param fichier 
*Fichier dans lequel se charge le fichier selectionné par JFileChooser.
*@param Grille
*Socle qui doit être rempli.
*@return
*Renvoit le fichier selectionn&eacute; par JFileChooser.
*@throws
*Renvoit une IOException.
*/
    public int[][] remplissageFichier(File fichier,Socle Grille){
    int lettre;
    try {
        FileReader lecteur = new FileReader (fichier);
        BufferedReader buffer =new BufferedReader(lecteur);
        try{
            for (int i=0; i<10; i++) {
                for (int j=0; j<15; j++) {
                    lettre=buffer.read();
                    if(lettre == 66){
                            System.out.println('B');
                            Grille.Grille[i][j]=2;
                    }
                    if(lettre == 82) {
                            Grille.Grille[i][j]=1;
                            System.out.println('R');
                    }
                    if(lettre == 86) {
                            System.out.println('V');
                            Grille.Grille[i][j]=3;
                    }
                }
                buffer.readLine();
            }
            try{
                 lecteur.close();
            }catch(IOException e){
               System.err.println("La Fermeture a raté!");
            }
            }catch(IOException e){
             System.err.println("La lecture à échoué!");
        }

    }catch(FileNotFoundException e){
          System.err.println("L' Ouverture a raté!");
    }
        return Grille.Grille;
    }


/*       Main de Test

public static void main(String[] args){
Socle s=new Socle(10,15);
s.remplissageAleatoire(s);
for(int i=0;i<10;i++){
for(int j=0;j<15;j++){
System.out.println(s.Grille[i][j] + ",");
}
System.out.println();
}

} */
}
