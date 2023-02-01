public class Universite {
    public String id ;
    public String name;
    public String adresse;

    public Universite(String id , String name, String adresse){
        this.id = id;
        this.name = name;
        this.adresse = adresse;
    }

     public String getId() {
        return id;
    }
    public void setId(String id) {
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
}