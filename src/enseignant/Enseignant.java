package enseignant;

public class Enseignant {
    public static void main(String[] args) {
        System.out.println("Hello mourad");
    }
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null) return false;
        if (o.getClass() != this.getClass())
            return false;
        return false; 
    } 
}
