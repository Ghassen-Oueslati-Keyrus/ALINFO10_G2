public class Main {
    public static void main(String[] args){

        Universite U1 = new Universite(1," Université de Carthage " , "Carthage ");
        System.out.println(U1.toString());
        System.out.println(U1.afficher());

        Universite U2 = new Universite(2," iset Rades " , "Rades ");
        System.out.println(U2.toString());
        System.out.println(U2.afficher());


    }
}
