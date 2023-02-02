import java.sql.SQLOutput;

public class Universite {
    public int id ;
    public String name;
    public String adresse;

    public Universite(int id , String name, String adresse){
        this.id = id;
        this.name = name;
        this.adresse = adresse;
    }

     public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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
      public Universite(){
              }

    public Universite(int id) {
        this.id = id;
    }

    public String toString(){
        return
                "Hello oumaima, this is universite !";
    }

    public String afficher() {
        return "Universite{ id est : "+this.getId()+" le nom de votre université est "+this.getName()+" et se localise a "+this.getAdress() +"}";
    }




}