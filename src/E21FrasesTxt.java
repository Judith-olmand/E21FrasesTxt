import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class E21FrasesTxt {
	public static void main(String[] args){
        //CON BUFFERED READER
        try (BufferedReader reader = new BufferedReader(new FileReader("frases.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " +
                    e.getMessage());
        }

        System.out.println();
        System.out.println();

        //CON FILE READER
        try (FileReader reader = new FileReader("frases.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}