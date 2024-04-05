public class Studierender {
    private String name;
    private int matrikelnummer;

    private String studiengang;

    public Studierender(String name, int matrikelnummer, String studiengang) {
        this.name = name;
        this.matrikelnummer = matrikelnummer;
    
        this.studiengang = studiengang;
    }

    public String getName() {
        return name;
    }

    public int getMatrikelnummer() {
        return matrikelnummer;
    }


    public String getStudiengang() {
        return studiengang;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMatrikelnummer(int matrikelnummer) {
        this.matrikelnummer = matrikelnummer;
    }


    public void setStudiengang(String studiengang) {
        this.studiengang = studiengang;
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Matrikelnummer: " + matrikelnummer);
        System.out.println("Studiengang: " + studiengang);
    }
}