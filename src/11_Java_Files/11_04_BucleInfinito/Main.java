package Java_Files.BucleInfinito;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

  public static void main(String[] args) {

    String nombreArchivo = "escritura_infinita.txt";

    try (BufferedWriter escritor = new BufferedWriter(new FileWriter(nombreArchivo))) {

      long contador = 0;

      while (true) {
        escritor.write("L:" + contador + "\n");
        contador++;

      }

    } catch (IOException e) {
      System.err.println("Error al escribir en el archivo: " + e.getMessage());
    }

    System.out.println("Programa finalizado."); // La importancia del prints...
  }
}