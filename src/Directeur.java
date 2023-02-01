public class Directeur {
    private long idDirecteur;
    private String nomDirecteur;

    public Directeur(long idDirecteur, String nomDirecteur) {
        this.idDirecteur = idDirecteur;
        this.nomDirecteur = nomDirecteur;
    }

    public long getIdDirecteur() {
        return idDirecteur;
    }

    public String getNomDirecteur() {
        return nomDirecteur;
    }

}
