import java.util.Scanner;

public class Task05 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Здоровье дракона");
        int Health_dragon = scanner.nextInt();
        System.out.println("Атака дракона");
        int Attacks_dragon = scanner.nextInt();
        System.out.println("Здоровье копейщика");
        int Health_spearman = scanner.nextInt();
        System.out.println("Атака копейщика");
        int Attacks_spearman = scanner.nextInt();
        System.out.println("Количество копейщика");
        int spearman = scanner.nextInt();
        Zadaxa5.Battle(Health_dragon, Attacks_dragon, Attacks_spearman,Health_spearman,spearman);
    }
}
