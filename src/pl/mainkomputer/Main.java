package pl.mainkomputer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        do {
            System.out.println("Obliczanie Pol Figur Płaskich,wybierz figure");
            System.out.println("1.Obliczanie figur prostokąta");
            System.out.println("2.Obliczenie pola kwadrat");
            System.out.println("3.Obliczanie pola trójkąt");
            System.out.println("0.Zakończ program");
            i = scanner.nextInt();

            switch (i) {
                case 0:
                    break;
                case 1:
                    System.out.println("Podaj bok prostokąta");
                    int a = scanner.nextInt();
                    System.out.println("Podaj drugi bok prostokąta");
                    int b = scanner.nextInt();
                    System.out.println("Pole wynosi " + a * b);
                    break;
                case 2:
                    System.out.println("Podaj bok kwadratu");
                    int c = scanner.nextInt();
                    System.out.println("Pole wynosi "+ c*c);
                    break;
                case 3:
                    System.out.println("Podaj bok trójkąta");
                    int d = scanner.nextInt();
                    System.out.println("Podaj wysokość trójkąta");
                    int h = scanner.nextInt();
                    System.out.println("Pole wynosi " + (d*h)/2);
                    break;
                default:
                    System.out.println("Brak Takiej Figury");

            }
    } while (i != 0) ;

    }
}