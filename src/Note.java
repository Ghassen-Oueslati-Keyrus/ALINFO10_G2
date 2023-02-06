class Note {
    private String id;
    private String id_etudiant;
    private String id_matiere;
    private String note;

    public Note() {
    }

    public Note(String id, String id_etudiant, String id_matiere, String note) {
        this.id = id;
        this.id_etudiant = id_etudiant;
        this.id_matiere = id_matiere;
        this.note = note;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId_etudiant() {
        return id_etudiant;
    }

    public void setId_etudiant(String id_etudiant) {
        this.id_etudiant = id_etudiant;
    }

    public String getId_matiere() {
        return id_matiere;
    }

    public void setId_matiere(String id_matiere) {
        this.id_matiere = id_matiere;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String toString() {
        return "note [id=" + id + ", id_etudiant=" + id_etudiant + ", id_matiere=" + id_matiere + ", note=" + note
                + "]";
    }

    public float CalculerMoyenne() {
        float moyenne = 0;
        for (int i = 0; i < note.length(); i++) {
            moyenne += note.charAt(i);
        }
        return moyenne / note.length();
    }

}
