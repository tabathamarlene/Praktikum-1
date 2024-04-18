/* Praktikum zu Softwareentwicklung 2, SS24 
 * Aufgabe 4: 1 Git
 * Tabatha Tokar, Julia Holzwert
 */
import java.util.ArrayList;
import java.util.List;


 public class Lehrveranstaltung {

    // Attribute der Lehrveranstaltung
    private String titel;
    private List<Studierender> teilnehmer;
    private List<Vorlesungsstunde> vorlesungsstunden;
    private List<Praktikumsstunde> praktikumsstunden;
    private int maxStudierende;
    private int maxVorlesungsstunden;
    private int maxPraktikumsstunden;

    // Konstruktor der Lehrveranstaltung
    public Lehrveranstaltung(String titel, int maxStudierende, int maxVorlesungsstunden, int maxPraktikumsstunden) {
        this.titel = titel;
        this.teilnehmer = new ArrayList<>();
        this.vorlesungsstunden = new ArrayList<>();
        this.praktikumsstunden = new ArrayList<>();
        this.maxStudierende = maxStudierende;
        this.maxVorlesungsstunden = maxVorlesungsstunden;
        this.maxPraktikumsstunden = maxPraktikumsstunden;

    }

    // Methode um einen Studierenden hinzuzufügen, zu zählen und ggf. Meldung über Max. auszugeben
    public void addStudierender(Studierender studierender) {
        if (teilnehmer.size() < maxStudierende) {
            teilnehmer.add(studierender);
        } else {
            System.out.println("Maximale Anzahl von Studierenden erreicht!");
        }
    }
    // Methode um eine Vorlesungsstunde hinzuzufügen, zu zählen und ggf. Meldung über Max. auszugeben
    public void addVorlesungsstunde(Vorlesungsstunde vorlesungsstunde) {
        if (vorlesungsstunden.size() < maxVorlesungsstunden) {
            vorlesungsstunden.add(vorlesungsstunde);
        } else {
            System.out.println("Maximale Anzahl von Vorlesungsstunden erreicht!");
        }
    }

    // Methode um eine Praktikumsstunde hinzuzufügen, zu zählen und ggf. Meldung über Max. auszugeben
    public void addPraktikumsstunde(Praktikumsstunde praktikumsstunde) {
        if (praktikumsstunden.size() < maxPraktikumsstunden) {
            praktikumsstunden.add(praktikumsstunde);
        } else {
            System.out.println("Maximale Anzahl von Vorlesungsstunden erreicht!");
        }
    }

    // Methode um die Lehrveranstaltung und Informationen darüber anzuzeigen
    public void anzeigen() {
        System.out.println("Lehrveranstaltung: " + titel);
        System.out.println("Studierende: ");
        for (Studierender studierender : teilnehmer) {
            System.out.println("- " + studierender.getName());
        }

    // Vorlesungsstunden zählen und anzeigen lassen
        for (Vorlesungsstunde vorlesungsstunde : vorlesungsstunden) {
            vorlesungsstunde.anzeigen();
        }
        System.out.println("Vorlesungsstunden: " + vorlesungsstunden.size());
        
    // Praktikumsstunden zählen und anzeigen lassen
       for (Praktikumsstunde praktikumsstunde : praktikumsstunden) {
        praktikumsstunde.anzeigen();
        }
        System.out.println("Praktikumsstunden: " + praktikumsstunden.size());
    }
}
