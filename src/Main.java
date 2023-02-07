public class Main {
    public static void main(String[] args){
        System.out.println("Hello we are ALINFO10_G2");
        Universite U1 = new Universite(1," Université de Carthage " , "Carthage ");
        System.out.println(U1.toString());
        System.out.println(U1.afficher());
        Universite U2 = new Universite(2," iset Rades " , "Rades ");
        System.out.println(U2.toString());
        System.out.println(U2.afficher());
        System.out.println("*****************************");
        Etudiant etudiant1 = new Etudiant("ichrak friji","1","ichrak.friji@esprit.tn","12345678");
        var  etudiant1_details = etudiant1.toString();
        System.out.println(etudiant1_details);
        Etudiant etudiant2 = new Etudiant("ichrak friji","2","ichrak.friji@gmail.com","22");
        var etudiant2_details = etudiant2.toString();
        System.out.println(etudiant2_details);
        System.out.println("******************************");
        if(etudiant2.equals(etudiant1)){
            System.out.println(" student 1 is not equal to student 2 ");
        }else{
            System.out.println("student 1 is equal to  student 2 ");
        }
        System.out.println("*****************************");
        etudiant1.setPhone("23123678");
        System.out.println(etudiant1);
        etudiant2.setPhone("00034435");
        System.out.println(etudiant2);
        System.out.println("*****************************");
        System.out.println("Nom:"+etudiant1.getName());
        System.out.println("id:"+etudiant2.getId());

        System.out.println("*****************************");
        Directeur D1 = new Directeur("1","wejdene bedoui");
        System.out.println(D1.toString());
        Directeur D2 = new Directeur("2","wejdene bedoui");
        System.out.println(D2.toString());
        System.out.println("*****************************");

    }

}
