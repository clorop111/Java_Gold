package ex35;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;
import java.io.Reader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

import javax.print.DocFlavor.READER;

public class Sample {
  public static void main(String[] args) {
    List<Reader> list = new ArrayList<>();
    File file = new File("sample.txt");

    try ( BufferedReader br =
            new BufferedReader(new FileReader(file))) {
              for (String fileName = br.readLine();
                  fileName != null; fileName = br.readLine()) {
                  BufferedReader br2
                      = new BufferedReader(new
                          FileReader(fileName));
                  list.add(br2);
                  process(br2);
              }
    } catch (IOException e) {
    } finally {
      for (Reader r : list) {
        try {
          r.close();
        } catch (IOException ex) {
           //
        }
      }
    }
  }
  private static void process(BufferedReader br2) {
    //
  }
}
