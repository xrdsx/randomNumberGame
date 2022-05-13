package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myobj = new Scanner(System.in);
        Random random = new Random();


        int numberComputer = random.nextInt(10);
        int life = 5;

        do {
            System.out.println("podaj liczbe :)");
            int numberUser = myobj.nextInt();


            if(numberUser == numberComputer)
            {
                System.out.println("Brawo zgadłeś liczbę");
                life = -1;


            }else if(numberUser< numberComputer){
                System.out.println("Wylosowana liczba jest wieksza od twojej");
                life--;

            }else{
                System.out.println("Wylosowana liczba jest mniejsza od twojej");
                life--;

            }




        }while(life>0);

        if(life  == -1)
        {
            System.out.println("Koniec rozgrywki");
        }else if(life == 0)
        {
            System.out.println("Niestety przegrałeś , nie przejmuj sie odpal program jeszcze raz i spróbuj ponownie");
        }





    }
}
