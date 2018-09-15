public class Score{
    public static int calcul (int vide,int calculScore,int tab[][],int nbrCasesVide,int nbrCasesSuprimes){
        
        for(int i=0;i<15;i++){//balayage horizontale
            for(int j=0;j<10;j++){//balayage verticale
             if(tab[i][j]==0){
                 nbrCasesVide++;
             }
           }
       }
       nbrCasesSuprimes=nbrCasesVide-vide;//nombre case supprimés par le clic
       calculScore=calculScore+(nbrCasesSuprimes-2)*(nbrCasesSuprimes-2);//calcul du score (score precedant +point obtenus)
       return calculScore;
        
    }
    /*Auteur: Axel Durand*/
    /*public int afficheScore()
    {
        
    }
    /*interessant d'afficher le nombre de clic à la fin */
}