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
    public void anzeigen() {
        System.out.println("Lehrveranstaltung: " + titel);
        for (Studierender studierender : teilnehmer) {
            System.out.println("- " + studierender.getName());
        }

    // Vorlesungsstunden zählen und anzeigen lassen
        
      
     
        
    // Praktikumsstunden zählen und anzeigen lassen
       
    }

    // Methode um einen Studierenden hinzuzufügen, zu zählen und ggf. Meldung über Max. auszugeben
    public void addStudierender(Studierender studierender, Studierender studierender2, Studierender studierender3) {
        
        teilnehmer.add(studierender);
        teilnehmer.add(studierender2);
        teilnehmer.add(studierender3);
        
    

        if (teilnehmer.size() >=  maxStudierende) {
            System.out.println("Maximale Anzahl von Studierenden erreicht!");
        
        } else{
            System.out.println("Wir haben noch Platz!");
        }
        System.out.println("Studierende: " + teilnehmer.size());
    }
    // Methode um eine Vorlesungsstunde hinzuzufügen, zu zählen und ggf. Meldung über Max. auszugeben
    public void addVorlesungsstunde(Vorlesungsstunde vorlesungsstunde) {
        
        if (vorlesungsstunden.size() < maxVorlesungsstunden) {
            vorlesungsstunden.add(vorlesungsstunde);
        } else {
            System.out.println("Maximale Anzahl von Vorlesungsstunden erreicht!");
        }
        System.out.println("Vorlesungsstunden: " + vorlesungsstunden.size());
    }

    // Methode um eine Praktikumsstunde hinzuzufügen, zu zählen und ggf. Meldung über Max. auszugeben
    public void addPraktikumsstunde(Praktikumsstunde praktikumsstunde) {
        if (praktikumsstunden.size() < maxPraktikumsstunden) {
            praktikumsstunden.add(praktikumsstunde);
        } else {
            System.out.println("Maximale Anzahl von Vorlesungsstunden erreicht!");
        }
        System.out.println("Praktikumsstunden: " + praktikumsstunden.size());
    }

    // Methode um die Lehrveranstaltung und Informationen darüber anzuzeigen
   
}
