public class Main {
    public static void main(String[] args) {
        System.out.println("Hello we are ALINFO10_G2");
        Etudiant etudiant1 = new Etudiant("ichrak friji","1","ichrak.friji@esprit.tn","12345678");
        var etudiant1_details = etudiant1.toString();
        System.out.println(etudiant1_details);
        Etudiant etudiant2 = new Etudiant("ichrak friji","2","ichrak.friji@gmail.com","123456");
        var etudiant2_details = etudiant2.toString();
        System.out.println(etudiant2_details);
        if(etudiant2.equals(etudiant1)){
            System.out.println(" student 1 is not student 2 ");
        }else{
            System.out.println("student 1 is student 2 ");
        }
        etudiant1.setPhone("23123678");
        System.out.println(etudiant1);
        etudiant2.setPhone("00034435");
        System.out.println(etudiant2);

    }
}
