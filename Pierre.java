/**
*La classe <code>Pierre</code> est utilis&eacute;e 
*pour d&eacute;finir l' &eacute;tat d' une "Pierre" à savoir sa couleur soit Rouge,Vert ou Bleu
*et si elle est survol&eacute ou pas 
*
*@version 0.1
*@author Axel Durand
*/
public class Pierre{
    /**
    *Renvoie un bool&eacute;en à partir d'une variable qui v&eacute;rifie si ce qui lui a &eacute;t&eacute; donn&eacute;e est bien &eacute;gale à 1
    */
      public static boolean estRouge(int tabchecker){
          if(tabchecker==1)return true;
          else return false;
      }
//estRouge surchargé
/*public boolean estRouge(char tabchecker){
if(tabchecker=='A')
return true;
else
return false;
}*/
    /**
    *Renvoie un bool&eacute;en à partir d'une variable qui v&eacute;rifie si ce qui lui a &eacute;t&eacute; donn&eacute;e est bien &eacute;gale à 2
    */
      public static boolean estBleu(int tabchecker){
          if(tabchecker==2)return true;
          else return false;
      }
//estBleu Surchargé
/*public boolean estBleu(char tabchecker){
if(tabchecker=='B')
return true;
else
return false;
}*/
    /**
    *Renvoie un bool&eacute;en à partir d'une variable qui v&eacute;rifie si ce qui lui a &eacute;t&eacute; donn&eacute;e est bien &eacute;gale à 3
    */
      public static boolean estVert(int  tabchecker){
          if(tabchecker==3)return true;
          else return false;
    }
//estVert surchargé
/* public boolean estVert(char  tabchecker){
if(tabchecker=='V')
return true;
else
return false;
}*/

      /* Main de Test. 
      public static void main(String[] args){
        Pierre x=new Pierre();
        int [][] c=new int[10][15];
        int val = Integer.parseInt(args[0]);
        c[1][2]=val;
       System.out.println(val);
         if(x.estRouge(val)==true)
            {
              System.out.println("Rouge");
            }
            if(x.estBleu(val)==true)
            {
               System.out.println("Bleu");
            }
            if(x.estVert(val)==true)
            {
                 System.out.println("Vert");
            }
    } 
    */
}