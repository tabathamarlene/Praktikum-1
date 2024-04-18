/* Praktikum zu Softwareentwicklung 2, SS24 
 * Aufgabe 1: 1 Git
 * Tabatha Tokar
 */

 public class Main {
    public static void main(String[] args) {

        // Begrüßungsnachricht
        System.out.println("*************************************************************************************************");
        System.out.println("Willkommen zum Praktikum zu Softwareentwicklung 2!");
        System.out.println("Dieses Projekt dient als Beispiel für die Verwendung von Git und zur Erstellung von Objekten.");
        System.out.println("*************************************************************************************************");

        // Beispiel-Nutzung des Projekts

        Studierender studierender = new Studierender("Max Mustermann", 12345678, "Informatik");
        Dozierender dozierender = new Dozierender("Prof. Dr. Beispiel", "Informatik", 666);

          
        studierender.frageStellen(dozierender, "Wie funktioniert xy?");
            
        dozierender.frageBeantworten(studierender, "Das ist die Antwort auf Frage xy.");
            
        dozierender.sprechstundenAnfrageEmpfangen(studierender, "Montag 10:00", "Hilfe bei Aufgabe 1");
            
        dozierender.feedbackVerwalten(studierender, "Das ist Feedback zu xyz");
            
        studierender.feedbackVerwalten(dozierender, "Das ist Feedback zu abc");

        Lehrveranstaltung lehrveranstaltung = new Lehrveranstaltung("Programmierung in Java", 10, 10, 10);
        

            Vorlesungsstunde vorlesungsstunde = new Vorlesungsstunde("Einführung in Java", "01.05.2024", "10:00", "G101");
    
            Praktikumsstunde praktikumsstunde = new Praktikumsstunde("Java Übungen", "08.05.2024", "10:00", "G111", 10);

            praktikumsstunde.addAufgabe("Aufgabe 1");
            praktikumsstunde.addAufgabe("Aufgabe 2");
            praktikumsstunde.addAufgabe("Aufgabe 3");

            lehrveranstaltung.addStudierender(studierender);
            lehrveranstaltung.addVorlesungsstunde(vorlesungsstunde);
            lehrveranstaltung.addPraktikumsstunde(praktikumsstunde);
    
            lehrveranstaltung.anzeigen();
    }
}