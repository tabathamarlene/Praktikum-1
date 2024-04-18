/* Praktikum zu Softwareentwicklung 2, SS24 
 * Aufgabe 1: 1 Git
 * Tabatha Tokar
 */

 public class Lehrveranstaltung {

    // Attribute der Lehrveranstaltung
    private String titel;
    private Studierender[] studierende;
    private Vorlesungsstunde[] vorlesungsstunden;
    private Praktikumsstunde[] praktikumsstunden;
    private int studierendeCount;
    private int vorlesungsstundenCount;
    private int praktikumsstundenCount;

    // Konstruktor der Lehrveranstaltung
    public Lehrveranstaltung(String titel, int maxStudierende, int maxVorlesungsstunden, int maxPraktikumsstunden) {
        this.titel = titel;
        this.studierende = new Studierender[maxStudierende];
        this.vorlesungsstunden = new Vorlesungsstunde[maxVorlesungsstunden];
        this.praktikumsstunden = new Praktikumsstunde[maxPraktikumsstunden];
        this.studierendeCount = 0;
        this.vorlesungsstundenCount = 0;
        this.praktikumsstundenCount = 0;
    }

    // Methode um einen Studierenden hinzuzufügen, zu zählen und ggf. Meldung über Max. auszugeben
    public void addStudierender(Studierender studierender) {
        if (studierendeCount < studierende.length) {
            studierende[studierendeCount] = studierender;
            studierendeCount++;
        } else {
            System.out.println("Maximale Anzahl von Studierenden erreicht!");
        }
    }

    // Methode um eine Vorlesungsstunde hinzuzufügen, zu zählen und ggf. Meldung über Max. auszugeben
    public void addVorlesungsstunde(Vorlesungsstunde vorlesungsstunde) {
        if (vorlesungsstundenCount < vorlesungsstunden.length) {
            vorlesungsstunden[vorlesungsstundenCount] = vorlesungsstunde;
            vorlesungsstundenCount++;
        } else {
            System.out.println("Maximale Anzahl von Vorlesungsstunden erreicht!");
        }
    }

    // Methode um eine Praktikumsstunde hinzuzufügen, zu zählen und ggf. Meldung über Max. auszugeben
    public void addPraktikumsstunde(Praktikumsstunde praktikumsstunde) {
        if (praktikumsstundenCount < praktikumsstunden.length) {
            praktikumsstunden[praktikumsstundenCount] = praktikumsstunde;
            praktikumsstundenCount++;
        } else {
            System.out.println("Maximale Anzahl von Praktikumsstunden erreicht!");
        }
    }

    // Methode um die Lehrveranstaltung und Informationen darüber anzuzeigen
    public void anzeigen() {
        System.out.println("Lehrveranstaltung: " + titel);
        System.out.println("Studierende: ");
        for (int i = 0; i < studierendeCount; i++) {
            System.out.println("- " + studierende[i].getName());
        }

    // Vorlesungsstunden zählen und anzeigen lassen
        int a = 0;
        for (int i = 0; i < vorlesungsstundenCount; i++) {
        a++;
    vorlesungsstunden[i].anzeigen();
        }
        System.out.println("Vorlesungsstunden: " + a);
        
    // Praktikumsstunden zählen und anzeigen lassen
        int b = 0;

        for (int i = 0; i < praktikumsstundenCount; i++) {
            b++;
            praktikumsstunden[i].anzeigen();
        }
        System.out.println("Praktikumsstunden: " + b);
    }
}
