package kiemTraBai2;

import java.io.*;

public class TestIOText {
  public static void main(String[] args) {
    String[] arraySong = {" Hello califonia" , " We don’t talk any more" , "Nắng ấm xa dần" , "Nắng ấm xa dần"};
    try {
      String fileName = "list_song.txt";
      writeDataToFileWithFileWriter(fileName, arraySong);
      readDataFromFileWithFileReader(fileName);

      writeDataToFileWithBufferedWriter(fileName, arraySong);
      readDataFromFileWithBufferedReader(fileName);


    } catch (Exception e) {
      throw new RuntimeException ( e );
    }
  }

  public static void writeDataToFileWithFileWriter(String fileName , String[] arraySong) {
    try {
      FileWriter fw = new FileWriter ( fileName );
      for (String song:arraySong) {
        fw.write (song);
      }
      fw.close ();
      System.out.println ("đã ghi dữ liệu vào file thành công" );
    } catch (IOException e) {
      System.out.println ("ghi dữ liệu vào file bị lỗi" );
      throw new RuntimeException ( e );
    }
  }


  public static void readDataToFileWithFileReader(String file){
    try{
      FileReader fr = new FileReader (file);
      BufferedReader bfr = new BufferedReader ( fr );

      String line;
      System.out.println ("đọc dữ lieeuuj từ file" );
      while ((line= bfr.readLine ( )) != null){
        System.out.println (line );
      }
    }catch (Exception e){
      System.out.println (" đã xảy ra lỗi đọc dữ liệu từ file" );
      e.printStackTrace ();
    }
  }

  public static void readDataFromFileWithFileReader(String filename) {
    try {
      FileReader fileReader = new FileReader(filename);
      BufferedReader bufferedReader = new BufferedReader(fileReader);

      String line;
      System.out.println("Đọc dữ liệu từ file với FileReader:");
      while ((line = bufferedReader.readLine()) != null) {
        System.out.println(line);
      }

      bufferedReader.close();
    } catch (IOException e) {
      System.out.println("Đã xảy ra lỗi khi đọc dữ liệu từ file với FileReader.");
      e.printStackTrace();
    }
  }

  public static void writeDataToFileWithBufferedWriter(String filename, String[] arraySong) {
    try {
      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename));

      for (String song : arraySong) {
        bufferedWriter.write(song);
        bufferedWriter.newLine();
      }

      bufferedWriter.close();
      System.out.println("Đã ghi dữ liệu vào file với BufferedWriter thành công.");
    } catch (IOException e) {
      System.out.println("Đã xảy ra lỗi khi ghi dữ liệu vào file với BufferedWriter.");
      e.printStackTrace();
    }
  }

  public static void readDataFromFileWithBufferedReader(String filename) {
    try {
      BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));

      String line;
      System.out.println("Đọc dữ liệu từ file với BufferedReader:");
      while ((line = bufferedReader.readLine()) != null) {
        System.out.println(line);
      }

      bufferedReader.close();
    } catch (IOException e) {
      System.out.println("Đã xảy ra lỗi khi đọc dữ liệu từ file với BufferedReader.");
      e.printStackTrace();
    }
  }
}

