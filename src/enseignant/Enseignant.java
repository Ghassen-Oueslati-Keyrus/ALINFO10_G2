package enseignant;

public class Enseignant {
    private String name;
    private String lastname;
    public static void main(String[] args) {
        System.out.println("Hello mourad");
    }

    @Override
    public String toString() {
        return "Enseignant{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

}
