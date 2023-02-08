public class Main {
    public static void main(String[] args) {
        System.out.println("Hello we are ALINFO10_G2");
        Universite U1 = new Universite(1, " Université de Carthage ", "Carthage ");
        System.out.println(U1.message());
        System.out.println(U1.toString());
        Universite U2 = new Universite(2, " iset Rades ", "Rades ");
        System.out.println(U2.toString());
        System.out.println("*****************************");
        Etudiant etudiant1 = new Etudiant("ichrak friji", "1", "ichrak.friji@esprit.tn", "12345678");
        String etudiant1_details = etudiant1.toString();
        System.out.println(etudiant1_details);
        Etudiant etudiant2 = new Etudiant("ichrak friji", "2", "ichrak.friji@gmail.com", "22");
        String etudiant2_details = etudiant2.toString();
        System.out.println(etudiant2_details);
        System.out.println("******************************");
        if (etudiant2.equals(etudiant1)) {
            System.out.println(" student 1 is not equal to student 2 ");
        } else {
            System.out.println("student 1 is equal to  student 2 ");
        }
        System.out.println("*****************************");
        etudiant1.setPhone("23123678");
        System.out.println(etudiant1);
        etudiant2.setPhone("00034435");
        System.out.println(etudiant2);
        System.out.println("*****************************");
        System.out.println("Nom:" + etudiant1.getName());
        System.out.println("id:" + etudiant2.getId());

        System.out.println("\n*****************************");
        Directeur D1 = new Directeur("1", "wejdene bedoui");
        System.out.println(D1.toString());
        Directeur D2 = new Directeur("2", "wejdene bedoui");
        System.out.println(D2.toString());
        System.out.println("*****************************");
        
        System.out.println("\n*****************************");
        Enseignant enseignant1 = new Enseignant("Mourad", "Jnayeh", "mourad@gmail.com", 20159866);
        System.out.println("1- " + enseignant1);
        Enseignant enseignant2 = new Enseignant("Slim", "Jnayeh", "mourad@email.com", 25689952);
        System.out.println("2- " + enseignant2);
        if (enseignant2.equals(enseignant1)) {
            System.out.println("The first teacher is the same as the second teacher");
        } else {
            System.out.println("The first teacher is not the same as the second teacher");
        }
        System.out.println("*****************************\n");

        System.out.println("****************************************************************");
        Classroom Classroom1 = new Classroom(1, "1AINFO10", 201);
        Classroom1.afficher();
        System.out.println("****************************************************************");
        System.out.println(Classroom1.toString());
        Classroom Classroom2 = new Classroom(2, "1AINFO11", 500);
        System.out.println(Classroom2.toString());
        System.out.println("****************************************************************");
        if (Classroom2.equals(Classroom1)) {
            System.out.println(" first Classroom is not equal to the second Classroom");
        } else {
            System.out.println("first Classroom is equal tothe second Classroom ");
        }
        System.out.println("****************************************************************");
        System.out.println("Final message of the project! thank you for your attention");

    }

}
