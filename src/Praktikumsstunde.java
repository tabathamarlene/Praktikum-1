
/* Praktikum zu Softwareentwicklung 2, SS24 
 * Aufgabe 1: 1 Git
 * Tabatha Tokar
 */

 public class Praktikumsstunde {

    // Attribute der Praktikumsstunde
    private String thema;
    private String datum;
    private String uhrzeit;
    private String raum;
    private String[] aufgaben;
    private int aufgabenCount;

    // Konstruktor der Praktikumsstunde
    public Praktikumsstunde(String thema, String datum, String uhrzeit, String raum, int maxAufgaben) {
        this.thema = thema;
        this.datum = datum;
        this.uhrzeit = uhrzeit;
        this.raum = raum;
        this.aufgaben = new String[maxAufgaben];
        this.aufgabenCount = 0;
    }

    // Methode um eine Aufgabe hinzuzufügen, zu zählen und ggf. Meldung über Max. auszugeben
    public void addAufgabe(String aufgabe) {
        if (aufgabenCount < aufgaben.length) {
            aufgaben[aufgabenCount] = aufgabe;
            aufgabenCount++;
        } else {
            System.out.println("Maximale Anzahl von Aufgaben erreicht!");
        }
    }

    // Methode um die Praktikumsstunde und Informationen darüber anzuzeigen
    public void anzeigen() {
        System.out.println("Praktikumsstunde: " + thema);
        System.out.println("Datum: " + datum + ", Uhrzeit: " + uhrzeit + ", Raum: " + raum);
        System.out.println("Aufgaben: ");
        for (int i = 0; i < aufgabenCount; i++) {
            System.out.println("- " + aufgaben[i]);
        }
    }
}