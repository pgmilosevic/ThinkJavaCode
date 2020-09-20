//template

import java.util.Scanner;
import java.util.Random;
  
public class PogodiMojBroj 
{
  public static void main(String [] args)
  {
    int broj;
    int razlika;
    Random random = new Random ();
    int number = random.nextInt(100) + 1;
    System.out.println("Mislim na neki broj izmedju 1 i 100, možeš li pogoditi koji?");
    Scanner sauron = new Scanner (System.in);
    broj = sauron.nextInt ();
    razlika = broj - number;
    System.out.printf("Tvoj pokušaj je: %d \n Ja sam mislio na broj %d \n Promasio si za %d", broj, number, razlika);
        
  }
}