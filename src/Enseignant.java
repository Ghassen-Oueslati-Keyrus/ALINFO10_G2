public class Enseignant {
    private String name;
    private String lastname;
    private String email;
    private int phone;

    public Enseignant() {
    }

    public Enseignant(String name, String lastname, String email, int phone) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Enseignant{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;
        if (o.getClass() != this.getClass())
            return false;
        if (o == this)
            return true;
        if (o instanceof Enseignant) {
            Enseignant e = (Enseignant) o;
            if (e.email.equals(this.email) || e.phone == this.phone)
                return true;
        }

        return false;
    }

}
