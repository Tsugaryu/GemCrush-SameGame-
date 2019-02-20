/*import java.util.Random;

import java.util.TimerTask;

public class Phare extends TimerTask {
    private int x;
    private int y;
    private Socle s;
    public Phare(int x,int y,Socle grille ){

        this.x=Phare.genererCoordonneeSocle(x);
        this.y=Phare.genererCoordonneeSocle(y);
        this.s= grille;
         Recursion.parcoursPhare(this.s.Grille[this.x][this.y],this.y,this.x,this.s);
    }
    public static int genererCoordonneeSocle(int dim){
        //chercher le moyen de repeter a intervalle regulier la fonction
        Random generateur=new Random();
        int valeur= generateur.nextInt(dim+1-1);
        return valeur;
    }
    @Override
    public void run(){
         if(Fin.end(this.s)==false){
                this.x=Phare.genererCoordonneeSocle(x);
                this.y=Phare.genererCoordonneeSocle(y);
         }
         Recursion.parcoursPhare(this.s.Grille[this.x][this.y],this.y,this.x,this.s);
    }
}
*/
