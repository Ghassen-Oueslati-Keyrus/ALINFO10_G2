public class Universite {
    public int id ;
    public String name;
    public String adresse;


    public Universite(int id, String name, String adresse) {
        this.id = id;
        this.name = name;
        this.adresse = adresse;
    }

    public void setId(int id) {
        this.id=id;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adresse;
    }

    public void setAdress(String adresse) {
        this.adresse = adresse;
    }

    public Universite(int id) {
        this.id = id;
    }

    public Universite() {
    }

    @Override
    public String toString() {
        return "Universite{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }

    public String message() {
        return "Hello oumaima, this is universite !";
    }

}