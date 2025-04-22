package SAET;

public class Adresse {
    private int numero;
    private String voie;
    private Commune commune;

    public Adresse(int numero, String voie, Commune commune) {
        this.numero = numero;
        this.voie = voie;
        this.commune = commune;
    }

    public int getNumero() {
        return numero;
    }

    public String getVoie() {
        return voie;
    }

    public Commune getCommune() {
        return commune;
    }


    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setVoie(String voie) {
        this.voie = voie;
    }

    public void setCommune(Commune commune) {
        this.commune = commune;
    }

    public static class Commune {
        private String INSEE;
        private String Commune;
        private String departement;


        public Commune(String INSEE, String Commune, String departement) {
            this.INSEE = INSEE;
            this.Commune = Commune;
            this.departement = departement;
        }

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
}

