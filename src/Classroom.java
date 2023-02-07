public class Classroom {
    public int id;
    public String classroomName;
    public int numberStudent;

    public Classroom() {
    }
    
    public Classroom(String classroomName, int numberStudent) {
        this.classroomName = classroomName;
        this.numberStudent = numberStudent;
    }

    public Classroom(int id, String classroomName, int numberStudent) {
        this.id = id;
        this.classroomName = classroomName;
        this.numberStudent = numberStudent;
    }

    public int getId() {
        return id;
    }

    public String getClassroomName() {
        return classroomName;
    }

    public int getNumberStudent() {
        return numberStudent;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setClassroomName(String classroomName) {
        this.classroomName = classroomName;
    }

    public void setNumberStudent(int numberStudent) {
        this.numberStudent = numberStudent;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.id;
        hash = 53 * hash + this.numberStudent;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Classroom other = (Classroom) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.numberStudent != other.numberStudent) {
            return false;
        }
        return true;
    }
     
    @Override
    public String toString() {
        return "Classroom{" + "id=" + id + ", classroomName=" + classroomName + ", numberStudent=" + numberStudent + '}';
    }
 
   public void afficher() {
        System.out.println( "Hello Balssem, this is the classroom!");
    }
}
