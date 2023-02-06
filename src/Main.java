public class Main {
    public static void main(String[] args) {
        System.out.println("Hello we are ALINFO10_G2");
        Etudiant etudiant1 = new Etudiant("ichrak friji","1","ichrak.friji@esprit.tn","12345678");
        var etudiant1_details = etudiant1.toString();
        System.out.println(etudiant1_details);
        Etudiant etudiant2 = new Etudiant("ichrak friji","2","ichrak.friji@gmail.com","123456");
        var etudiant2_details = etudiant2.toString();
        System.out.println(etudiant2_details);
    }
}
