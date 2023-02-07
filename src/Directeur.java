import java.util.Objects;

public class Directeur {
    private String idDirecteur;
    private String DirectorName;

    public Directeur(String idDirecteur, String DirectorName) {
        this.idDirecteur = idDirecteur;
        this.DirectorName = DirectorName;
    }

  

    public String getIdDirecteur() {
        return idDirecteur;
    }

    public void setIdDirecteur(String idDirecteur) {
        this.idDirecteur = idDirecteur;
    }

    public String getDirectorName() {
        return DirectorName;
    }
 
    public void setDirectorName(String DirectorName) {
        this.DirectorName = DirectorName;
    }



    @Override
    public String toString() {
        return "Directeur [idDirecteur=" + idDirecteur + ", DirectorName=" + DirectorName + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Directeur directeur = (Directeur) o;
        return idDirecteur == directeur.idDirecteur &&
                Objects.equals(DirectorName, directeur.DirectorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idDirecteur, DirectorName);
    }

}
