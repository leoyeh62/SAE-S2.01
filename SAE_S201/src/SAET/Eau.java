package SAET;

public class Eau extends ODeFrance{
	private int id;
	private String marque;
	private double prix;
    public enum Type {Plate,Gazeuse}
    private Type catégorie;
	//Constructeur
	public Eau(int id,String marque,double prix,Type type) {
		super();
		this.id=id;
		this.marque=marque;
		this.prix=prix;
		this.catégorie=type;
	}
	//getter
	public int getId() {
		return id;
	}
	public String getMarque() {
		return marque;
	}
	public double getPrix() {
		return prix;
	}
	//setters
	public void setPrix(int prix) {
		this.prix=prix;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public void setMarque(String marque) {
		this.marque=marque;
	}
	
        //méthode toString
	@Override
	public String toString() {
		return "Eau [id=" + id + ", marque=" + marque + ", prix=" + prix + ", catégorie=" + catégorie + "]";
	}
	

}
