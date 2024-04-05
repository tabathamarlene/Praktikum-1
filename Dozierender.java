public class Dozierender {
    private String name;
    private int bueronummer;

    private String fakultät;

    public Dozierender(String name, int bueronummer, String fakultät) {
        this.name = name;
        this.bueronummer = bueronummer;
    
        this.fakultät = fakultät;
    }

    public String getName() {
        return name;
    }

    public int getbueronummer() {
        return bueronummer;
    }


    public String getfakultät() {
        return fakultät;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setbueronummer(int bueronummer) {
        this.bueronummer = bueronummer;
    }


    public void setfakultät(String fakultät) {
        this.fakultät = fakultät;
    }
}

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("bueronummer: " + bueronummer);
        System.out.println("fakultät: " + fakultät);
    }

    