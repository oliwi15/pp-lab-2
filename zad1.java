import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] przedmioty = { "matematyka", "fizyka", "chemia" };
        double suma = 0;

        for (String przedmiot : przedmioty) {
            System.out.print("Podaj ocenę z " + przedmiot + ": ");
            double ocena = scanner.nextDouble();
            suma += ocena;
        }

        double srednia = suma / przedmioty.length;
        System.out.println("Średnia ocen: " + srednia);

        scanner.close();
    }
}