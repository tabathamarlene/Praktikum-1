/* Praktikum zu Softwareentwicklung 2, SS24 
 * Aufgabe 1: 1 Git
 * Tabatha Tokar
 */

 public class Vorlesungsstunde {

    // Attribute der Vorlesungsstunde
    private String thema;
    private String datum;
    private String uhrzeit;
    private String raum;

// Konstruktor der Vorlesungsstunde
    public Vorlesungsstunde(String thema, String datum, String uhrzeit, String raum) {
        this.thema = thema;
        this.datum = datum;
        this.uhrzeit = uhrzeit;
        this.raum = raum;
    }

// Methode um die Vorlesungsstunde und Informationen darüber anzuzeigen
    public void anzeigen() {
        System.out.println("Vorlesungsstunde: " + thema);
        System.out.println("Datum: " + datum + ", Uhrzeit: " + uhrzeit + ", Raum: " + raum);
    }
}