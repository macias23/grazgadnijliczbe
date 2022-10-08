import java.util.Scanner;

public class Grazgadnijliczbe {
    public static void main(String[] args) {
        final int MAX_LICZBA = 21 / 2;
        int liczbaprob =0;
        int los = (int) (Math.random() * MAX_LICZBA + 1);
        Scanner sc = new Scanner(System.in);
        int odp = 0;
        do {
            System.out.println("Podaj liczbę od 1 do 10. 0 kończy grę.");
            odp = sc.nextInt();
            if (odp>10) System.out.println("Liczba musi być z zakresu od 1 do 10.");
            if (odp>10) continue;
            ++liczbaprob;
            if (odp==los) continue;
            if (odp==0) break;
            System.out.println("Spróbuj jeszcze raz :(");
        } while (odp != los);
        if (odp==0) System.out.println("Gra przerwana.");
        if ((odp==los)&&(liczbaprob==1)) System.out.println("Wygrałeś! Była " + liczbaprob+ " próba.");
        else if ((odp==los)&&(liczbaprob==2||liczbaprob==3||liczbaprob==4))
            System.out.println("Wygrałeś! Były " + liczbaprob+ " próby.");
        else if (odp==los) System.out.println("Wygrałeś! Było " + liczbaprob+ " prób.");
    }}