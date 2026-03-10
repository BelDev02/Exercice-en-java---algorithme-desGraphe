package exercice6;

public class Personne {
	private String nom;
	private int age;
	public Personne(String nom, int age ) {
		this.nom=nom;
		this.age=age;
		
	}
	public String getnom() {
		
		return this.nom;
		
	}
	
	public int getage() {
		
		return age;
		
	}
	public String setnom(String nom) {
		
		return this.nom=nom;
	
	}
	public int setage(int age) {
		return this.age=age;
	}
	
	
    public void afficher() {
        System.out.println("personne: "+ this.nom +"\n" + this.age);
    }
}