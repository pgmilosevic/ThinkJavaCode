//Program koji pretvara unete sekunde u sate, minute i preostale sekunde.

import java.util.Scanner;
  
public class Sekundarijum
{
  public static void main(String [] args)
  {
    int sekunde;
    int sat;
    int minuta;
    int sekunda;
    final int BROJ_SEKUNDI_U_SATU = 3600;
     
    //pravljenje novog skenera "sauron"
    Scanner sauron = new Scanner (System.in);
    
    //uzimanje celog broja od korisnika
    System.out.print("koliko sekundi?");
    sekunde = sauron.nextInt();
      
    //pretvaranje sekundi u sate, minute i sekunde 
    int UKUPNO_MINUTA = sekunde % BROJ_SEKUNDI_U_SATU;
    sat = (int) ( sekunde / BROJ_SEKUNDI_U_SATU );
    minuta = (int)  ( UKUPNO_MINUTA / 60 );
    sekunda = (int) ( UKUPNO_MINUTA % 60 );
    
    //ispis rezultata pretvaranja
    System.out.printf ("%d sekunda: %d sati, %d minuta, %d sekundi.", sekunde, sat, minuta, sekunda); 
       
  }
}