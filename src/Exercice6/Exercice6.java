package exercice6;

public class Exercice6 {
    public static void main(String[] args) {
    	
    	Personne[] table_personne= new Personne[5];
        Personne p1 = new Enseignant("MOHAMED",23,"Philosophie","Doctora");
        Personne p2 = new Etudiant("DIOUF", 10 , "Unimes" , 20242344);
        Personne p3 = new Personne("Affo", 18);
        Personne p4 = new Enseignant(" Telou ", 21, "ESA", "licence");
        Personne p5 = new Personne( "SOUROU", 19);
         table_personne[0]= p5;
         table_personne[1]= p1;
         table_personne[2]= p2;
         table_personne[3]= p3;
         table_personne[4]= p4;
        for(Personne personne : table_personne) {
        	personne.afficher();
        	
        }

        p1.afficher();
        p2.afficher();
    }
}