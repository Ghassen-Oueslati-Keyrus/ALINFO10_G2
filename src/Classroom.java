public class Classroom {
    public int id;
    public String classroomName;
    public int numberStudent;

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

    public String toString() {
        return "Hello Balssem, this is the classroom!";
    }

}
