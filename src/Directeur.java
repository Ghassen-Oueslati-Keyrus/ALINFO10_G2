import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Directeur directeur = (Directeur) o;
        return idDirecteur == directeur.idDirecteur &&
                Objects.equals(nomDirecteur, directeur.nomDirecteur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDirecteur, nomDirecteur);
    }
}
