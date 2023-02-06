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

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (o == null)
            return false;
        if (o.getClass() != this.getClass())
            return false;
        return false;
    }
}
