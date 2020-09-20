//Program koji pretvara unetu temperaturu u celzijusima u farenhajte

import java.util.Scanner;
  
public class Temperaturodrom
{
  public static void main(String [] args)
  {
    double Celsius;
    double Fahrenheit; 
    
    //pravljenje skenera "sauron"
    Scanner sauron = new Scanner (System.in);
    
    //uzimanje temperature u celzijusima od korisnika
    System.out.print("Koliko stepeni celzijusa? ");
    Celsius = sauron.nextDouble();
    
    //pretvaranje stepeni
    Fahrenheit = Celsius * (9.0/5.0) + 32;
    
    //ispis rezultata pretvaranja
    System.out.printf("%.1f C = %.1f F", Celsius, Fahrenheit);
  }
}