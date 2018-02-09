package coordinates;

public class Coords {
  private int gc_lat;
  private char gc_dir;
  private int gc_long;

    public void convertCoords() {
      /*
      FileInputStream input = new FileInputStream(spreadsheet);
      Workbook workbook = new XSSFWorkbook(input);
      System.out.println("Workbook has "+workbook.getNumberOfSheets() + " sheets.");
      */
      this.gc_lat += 1;
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
