import java.io.*;

/**
 * Created by KPS on 7/29/2020.
 */
public class Main {
    public static void main(String[] args) {
        File path = new File("d:\\employee.txt");
        try(FileReader fileInputStream = new FileReader(path);
            BufferedReader bufferedInputStream = new BufferedReader(fileInputStream)){
            String line = "";
            while ((line = bufferedInputStream.readLine())!=null){
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
