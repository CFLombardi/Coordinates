package coordinates;

public class Coords {

    private int gc_lat;
    private char gc_dir;
    private int gc_long;

    public void calculateLat() {
      this.gc_lat += 1;
    }

    public void calculateLong() {
      this.gc_long += 5;
    }

    public int getgc_lat() {
      return gc_lat;
    }

    public void setgc_lat(int incLat) {
      this.gc_lat = incLat;
    }

    public int getgc_long() {
      return gc_long;
    }

    public void setgc_long(int incLong) {
      this.gc_long = incLong;
    }

    public char getgc_dir() {
      return gc_dir;
    }

    public void setgc_dir(char incDir) {
      this.gc_dir = incDir;
    }

}
