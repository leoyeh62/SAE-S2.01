package SAET;

public class Eau extends ODeFrance{
	private int id;
	private String marque;
	private double prix;
    public enum Type {Plate,Gazeuse}
    private Type catégorie;
	public Eau(int id,String marque,double prix,Type type) {
		super();
		this.id=id;
		this.marque=marque;
		this.prix=prix;
		this.catégorie=type;
	}
	public int Getid() {
		return id;
	}
	public String marque() {
		return marque;
	}
	public double prix() {
		return prix;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
