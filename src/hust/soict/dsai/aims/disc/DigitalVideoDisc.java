package hust.soict.dsai.aims.disc;

public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

    private static int nbDigitalVideoDiscs = 0;
    private int id;

    public DigitalVideoDisc(String title) {
        this.title = title;
        this.category = "Unknown";
        this.director = "Unknown";
        this.length = 0;
        this.cost = 0.0f;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public int getId() { return id; }
    public static int getNbDigitalVideoDiscs() { return nbDigitalVideoDiscs; }

    public float getCost() { return cost; }

    public boolean isMatch(String title) {
        if (title == null) return false;
        String t = this.title == null ? "" : this.title.toLowerCase();
        return t.equals(title.toLowerCase()) || t.contains(title.toLowerCase());
    }

    @Override
    public String toString() {
        return "DVD - " + title + " - " + category + " - " + director + " - " + length + ": " + cost + " $";
    }

    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof DigitalVideoDisc)) return false;
        return this.id == ((DigitalVideoDisc) obj).id;
    }
}
