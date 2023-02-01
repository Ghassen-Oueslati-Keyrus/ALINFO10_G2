import java.util.Objects;

public class Directeur {
    private long idDirecteur;
    private String DirectorName;

    public Directeur(long idDirecteur, String DirectorName) {
        this.idDirecteur = idDirecteur;
        this.DirectorName = DirectorName;
    }

    public long getIdDirecteur() {
        return idDirecteur;
    }

    public String getDirectorName() {
        return DirectorName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Directeur directeur = (Directeur) o;
        return idDirecteur == directeur.idDirecteur &&
                Objects.equals(DirectorName, directeur.DirectorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDirecteur, DirectorName);
    }


}
