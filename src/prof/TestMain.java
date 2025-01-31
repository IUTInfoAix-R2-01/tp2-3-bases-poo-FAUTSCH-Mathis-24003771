package prof;

public class TestMain {
    public static void main(String[] args) {
        Personne p1 = new Personne("Laurence", "Ago");
        System.out.println("Prénom : " + p1.getPrenom());
        System.out.println("Nom : " + p1.getNom());
        System.out.println(p1);
        Personne p2 = new Personne("Lolo");
        System.out.println("Prénom : " + p2.getPrenom());
        System.out.println("Nom : " + p2.getNom());
        System.out.println(p2);
    }
}
