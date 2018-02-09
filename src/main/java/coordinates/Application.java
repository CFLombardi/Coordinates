package coordinates;

import java.util.Arrays;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
  public static final String spreadsheet = "C:\\git\\coordFinder\\target\\classes\\Grid Converter.xlsx";

  public static void main(String[] args) throws IOException {
    FileInputStream input = new FileInputStream(spreadsheet);
    Workbook workbook = new XSSFWorkbook(input);
    System.out.println("Workbook has "+workbook.getNumberOfSheets() + " sheets.");
    
    SpringApplication.run(Application.class, args);
  }
}
