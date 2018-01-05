/**

*La classe <code>Pierre</code> est utilis&eacute;e 

*pour d&eacute;finir l' &eacute;tat d' une "Pierre" à savoir sa couleur soit Rouge,Vert ou Bleu

*et si elle est survol&eacute ou pas.

*

*@version 0.1

*@author Axel Durand

*/

    public class Pierre{

/**

* La m&eacute;thode estRouge doit être utilis&eacute;e pour définir l'&eacute;tat d'affichage de l'instance d'une Pierre.

*@param tabchecker

*Variable qui v&eacute;rifie si ce qui lui a &eacute;t&eacute; donn&eacute;e est bien &eacute;gale à 1.

*@return

*Renvoie un bool&eacute; qui identifie si la valeur pass&eacute;e correspond à l '&eacute;tat rouge.

*/

        public static boolean estRouge(int tabchecker){

            if(tabchecker == 1) return true;

            else return false;

        }

/**

*La m&eacute;thode estBleu doit être utilis&eacute;e pour d&eacute;finir l'état d'affichage de l'instance d'une Pierre.

* @param tabchecker

*Variable qui v&eacute;rifie si ce qui lui a &eacute;t&eacute; donn&eacute;e est bien &eacute;gale à 2.

*@return

*Renvoie un bool&eacute; qui identifie si la valeur pass&eacute;e correspond à l '&eacute;tat bleu.

*/

        public static boolean estBleu(int tabchecker){

            if(tabchecker == 2) return true;

            else return false;

        }



/**

*La m&eacute;thode estVert doit être utilis&eacute;e pour définir l'&eacute;tat d'affichage de l'instance d'une Pierre.

*@param  tabchecker

*Variable qui v&eacute;rifie si ce qui lui a &eacute;t&eacute; donn&eacute;e est bien &eacute;gale à 3.

*@return

*Renvoie un bool&eacute; qui identifie si la valeur pass&eacute;e correspond à l '&eacute;tat vert.

*/

        public static boolean estVert(int  tabchecker){

            if(tabchecker == 3) return true;

            else return false;

        }

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

