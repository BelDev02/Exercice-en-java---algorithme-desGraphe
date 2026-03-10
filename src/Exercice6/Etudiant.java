package exercice6;

public class Etudiant extends Personne {
	protected int numetudiant;
	protected String etablissement;
	public Etudiant(String nom, int age, String etablissement, int numetudiant) {
		
		super(nom, age);
		this.etablissement= etablissement;
		this.numetudiant=numetudiant;
		
		}
    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Numero etudaint: "+ this.numetudiant + "\n etablissement de l'etudiant: "+ this.etablissement);
    }
}