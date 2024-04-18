
/* Praktikum zu Softwareentwicklung 2, SS24 
 * Aufgabe 4: 1 Git
 * Tabatha Tokar, Julia Holzwert
 */

import java.util.ArrayList;
import java.util.List;

 public class Praktikumsstunde {

    // Attribute der Praktikumsstunde
    private String thema;
    private String datum;
    private String uhrzeit;
    private String raum;
    private List<String> aufgaben;

    // Konstruktor der Praktikumsstunde
    public Praktikumsstunde(String thema, String datum, String uhrzeit, String raum) {
        this.thema = thema;
        this.datum = datum;
        this.uhrzeit = uhrzeit;
        this.raum = raum;
        this.aufgaben = new ArrayList<>();
    }

    // Methode um eine Aufgabe hinzuzufügen
    public void addAufgabe(String aufgabe) {
        aufgaben.add(aufgabe);
        System.out.println("- " + aufgabe);
    }

    // Methode um die Praktikumsstunde und Informationen darüber anzuzeigen
    public void anzeigen() {
        System.out.println("Praktikumsstunde: " + thema);
        System.out.println("Datum: " + datum + ", Uhrzeit: " + uhrzeit + ", Raum: " + raum);
        System.out.println("Aufgaben: " );

        for (String aufgabe : aufgaben) {
            addAufgabe(aufgabe);
        }
    }
}