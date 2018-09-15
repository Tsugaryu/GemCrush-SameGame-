public class Recursion{
//Constructeur:Axel Durand
public Recursion(){
    
}
    public static int recur(int valeur,int x,int y,int tab[][]){//parcours un tableau à  2d et marque les cases 
        if(valeur==1){
        this.dessin.flagSurvoler=true;//on change la valeur de la case pour changer l'image :survol
        if(tab[y][x+1]==1 && x<9 && tab[y][x+1] !=(this.dessin.flagSurvoler==true));//modifcation du dernier morceau expliquant le fait que la case ne doit pas être survolé
       // parcours(x+1,y,tab);//fonction4
        
        if(tab[y][x-1]==1 && x>0 && tab[y][x-1] !=(this.dessin.flagSurvoler==true)) );
        //parcours(x+1,y,tab);//fonction
        
        if(tab[y-1][x]==1 && y>0 && tab[y-1][x] !=(this.dessin.flagSurvoler==true)));
        //parcours(x+1,y,tab);//fonction
        
        if(tab[y+1][x]==1 && y<14 && tab[y+1][x] !=(this.dessin.flagSurvoler==true)));
        //parcours(x+1,y,tab);//fonction
        }
        
        if(valeur==2){//on verifie quelle couleur est selectionne ici rouge
        this.dessin.flagSurvoler=true;
        if(tab[y][x+1]==1 && x<9 && tab[y][x+1] !=(this.dessin.flagSurvoler==true)) );
        //parcours(x+1,y,tab);//fonction4
        
        if(tab[y][x-1]==1 && x>0 && tab[y][x-1] !=(this.dessin.flagSurvoler==true)) );
        //parcours(x+1,y,tab);//fonction
        
        if(tab[y-1][x]==1 && y>0 && tab[y-1][x] !=(this.dessin.flagSurvoler==true)));
        //parcours(x+1,y,tab);//fonction
        
        if(tab[y+1][x]==1 && y<14 && tab[y+1][x] !=(this.dessin.flagSurvoler==true)) );
        //parcours(x+1,y,tab);//fonction
        }
        
        if(valeur==3){//on verifie quelle couleur est selectionne ici rouge
        tab[y][x]=5;//on change la valeur de la case pour changer l'image 
        if(tab[y][x+1]==1 && x<9 && tab[y][x+1] !=(this.dessin.flagSurvoler==true)) );
        //parcours(x+1,y,tab);//fonction
        
        if(tab[y][x-1]==1 && x>0 && tab[y][x-1] !=(this.dessin.flagSurvoler==true)) );
        //parcours(x+1,y,tab);//fonction
        
        if(tab[y-1][x]==1 && y>0 && tab[y-1][x] !=(this.dessin.flagSurvoler==true)) );
        //parcours(x+1,y,tab);//fonction
        
        if(tab[y+1][x]==1 && y<14 && tab[y+1][x] !=(this.dessin.flagSurvoler==true)) );
        //parcours(x+1,y,tab);//fonction
        return tab;
        }
    }
}