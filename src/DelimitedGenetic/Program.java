package DelimitedGenetic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {
     public static void main(String[] args){
         List<Product> list = new ArrayList<>();

         String path = "/home/luiz/Desktop/cursoUdemy/src/DelimitedGenetic/a.txt";
         try (BufferedReader br = new BufferedReader(new FileReader(path))){
             String line = br.readLine();
             while (line != null){
                 String[] field = line.split(",");
                 list.add(new Product(field[0], Double.parseDouble(field[1])));
                 line = br.readLine();
             }
             Product x = CalculationService.max(list);
             System.out.println("Max: ");
             System.out.println(x);


         } catch (FileNotFoundException e) {
             throw new RuntimeException(e);
         } catch (IOException e) {
             throw new RuntimeException(e);
         }
     }
}
