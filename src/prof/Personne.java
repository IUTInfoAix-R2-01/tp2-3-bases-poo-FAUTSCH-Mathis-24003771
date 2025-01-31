package prof;

public class Personne {
    private final String nom;
    private final String prenom;

    public Personne(String prenom) {
        this.prenom = prenom;
        this.nom = null;
    }

    public Personne(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom == null ? "" : nom;
    }

    @Override
    public String toString() {
        return "Personne[prenom=" + prenom + (nom == null ? "" : (", nom=" + getNom())) + "]";
    }
}
