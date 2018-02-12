package coordinates;

public class Coords {

    private double gc_lat;
    private int latD;
    private double latMinutes;
    private double latSeconds;
    private double gc_long;
    private int longD;
    private double longMinutes;
    private double longSeconds;
    private char gc_dir;
    private int scale = (int) Math.pow(10, 1);

    public void convertCoords() {
      latD = (int)gc_lat;
      longD = (int)gc_long;
      latMinutes = (gc_lat - latD) * 60;
      latSeconds = (latMinutes - ((int)latMinutes)) * 60;
      longMinutes = (gc_long - longD) * 60;
      longSeconds = (longMinutes - ((int)longMinutes)) * 60;
    }

    public String getLatDMS() {
      StringBuilder builder = new StringBuilder();
      String result;
      int latMin;

      latMin = (int)latMinutes;
      latSeconds = Math.round((((latMinutes - latMin) * 60) * scale)/scale);
      builder.append(latD);
      builder.append(" "+latMin);
      builder.append(" "+latSeconds);
      result = builder.toString();
      return result;
    }

    public String getLongDMS() {
      StringBuilder builder = new StringBuilder();
      String result;
      int longMin;

      longMin = (int)longMinutes;
      longSeconds = Math.round((((longMinutes - longMin) * 60) * scale)/scale);
      builder.append(longD);
      builder.append(" "+longMin);
      builder.append(" "+longSeconds);
      result = builder.toString();
      return result;
    }

    public double getgc_lat() {
      return gc_lat;
    }

    public void setgc_lat(double incLat) {
      this.gc_lat = incLat;
    }

    public double getgc_long() {
      return gc_long;
    }

    public void setgc_long(double inclong) {
      this.gc_long = inclong;
    }

    public char getgc_dir() {
      return gc_dir;
    }

    public void setgc_dir(char incDir) {
      this.gc_dir = incDir;
    }

}
