public class Deplacement{
public Dessinateur dessin;
//public Socle tab;
/*Constructeur:Axel Durand*/
public Deplacement(Dessinateur dessin/*,Socle Grille*/){//paramètre dessin,socle puis relier méthode repaint aux deplacement verticale et horizontale
    this.dessin=dessin;
   // this.tab=Grille;
}
    public static int[][] deplacementVerticale(int tab[][]){
    
        for(int i=0;i<10;i++){
            for(int j=15;j>0;j--){
            if(tab[i-1][j]==0 && tab[i][j]!=0){ //on verif si la case au dessus
                tab[i-1][j]=tab[i][j];
                tab[i][j]=0;
            }
                
            }
        }

        return tab;
    }
    public static int[][] deplacementHorizontale(int tab [][]){
        
        for(int i=0;i<15;i++){
          int ligneVide=0;
          for(int j=0;j<10;j++){
            if(tab[j][i]==0)ligneVide++;
            if(ligneVide==10){
              for(int k=1;k<15;k++){//balayage horizontal on change i en k pour ne pas fausser la boucle précédente et on commence a la 2°colonne car la première   
                for(j=0;j<10;j++){//balayage vertical
                  tab[j][k]=tab[j][k+1];
                  tab[j][k+1]=0;
                 }
                
                }
              }
           }
           
               }
               return tab;
           }
        }

