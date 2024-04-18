/* Praktikum zu Softwareentwicklung 2, SS24 
 * Aufgabe 2,3: 1 Git
* Tabatha Tokar, Julia Holzwert
 */

 public class Studierender {

    // Daten des Studierenden
    private String name;
    private int matrikelnummer;
    private String studiengang;

    // Konstruktor
    public Studierender(String name, int matrikelnummer, String studiengang) {
        this.name = name;
        this.matrikelnummer = matrikelnummer;
        this.studiengang = studiengang;

    }

    // Methode um Studierenden eine Frage stellen zu lassen
    public void frageStellen(Dozierender dozierender, String frage) {
        System.out.println(name + " stellt eine Frage an " + dozierender.getName() + ": " + frage);
    }

    // Methode um Studierenden eine Sprechstundenanfrage empfangen zu lassen
    public void sprechstundenAnfrageEmpfangen(Dozierender dozierender, String termin, String grund) {
        System.out.println(name + " hat eine Sprechstundenanfrage von " + dozierender.getName() + " erhalten für " + termin + " wegen: " + grund);
    }

    // Methode um Studierenden Feedback geben zu lassen
    public void feedbackVerwalten(Dozierender dozierender, String feedback) {
        System.out.println(name + " gibt Feedback an " + dozierender.getName() + ": " + feedback);
    }

    // Getter-Methoden für die Attribute des Studierenden
    public String getName() {
        return name;
    }

    public int getMatrikelnummer() {
        return matrikelnummer;
    }

    public String getStudiengang() {
        return studiengang;
    }



}