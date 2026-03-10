package exercice6;

public class Enseignant extends Personne {
	String discipline;
	String diplome;
	
	public Enseignant(String nom,int age, String discipline, String diplome) {
		
		super(nom, age);
		this.discipline=discipline;
		this.diplome=diplome;
		
	}
	
    @Override
    public void afficher() {
        super.afficher();
        System.out.println("diplome " + this.diplome + " \n discipline: "+ this.discipline);
    }
}