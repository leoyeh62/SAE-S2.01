package SAET;

public class Adresse extends ODeFrance {
    private int numero;
    private String voie;
    private Commune commune;
	
    //constructeur
    public Adresse(int numero, String voie, Commune commune) {
        this.numero = numero;
        this.voie = voie;
        this.commune = commune;
    }
	//getters
	public int getNumero() {
        return numero;
    }

    public String getVoie() {
        return voie;
    }

    public Commune getCommune() {
        return commune;
    }

    //setters	
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setVoie(String voie) {
        this.voie = voie;
    }

    public void setCommune(Commune commune) {
        this.commune = commune;
    }
	//classe imbriquée Commune		
    public static class Commune {
        private String INSEE;
        private String Commune;
        private String departement;

	//constructeur de Commune
        public Commune(String INSEE, String Commune, String departement) {
            this.INSEE = INSEE;
            this.Commune = Commune;
            this.departement = departement;
        }
	//getter
        public String getINSEE() {
            return INSEE;
        }

        public String getCommune() {
            return Commune;
        }

        public String getDepartement() {
            return departement;
        }
    }

    public static void main(String[] args) {
    }
    //méthode toString
    @Override
	public String toString() {
		return "Adresse [numero=" + numero + ", voie=" + voie + ", commune=" + commune + "]";
	}
}

