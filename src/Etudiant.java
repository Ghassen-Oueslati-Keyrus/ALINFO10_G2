import java.util.Objects;

public class Etudiant {
    private String name;
    private String id;
    private String email;
    private String phone;

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Etudiant(String name, String id, String email, String phone) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Etudiant etudiant = (Etudiant) o;
        return name.equals(etudiant.name) && id.equals(etudiant.id) && email.equals(etudiant.email) && phone.equals(etudiant.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, email, phone);
    }

    public Etudiant() {

    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Etudiant{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    sealed interface Error {
        record NameError() implements Error {
        }

        record EmailError() implements Error {
        }

        record IdError() implements Error {
        }

        record PhoneError() implements Error {
        }

    }
    public enum Type {
        PASSPORT,
        ID,
        STAYPERMIT
    }
}
