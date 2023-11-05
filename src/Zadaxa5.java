import java.util.Scanner;

public class Zadaxa5 {
    public static void Battle( int Health_dragon, int Attacks_dragon, int Health_spearman,int Attacks_spearman, int spearman) {

        int sum = spearman * Health_spearman;
        System.out.println("копейщика:" + spearman);
        int spearsum = sum / Health_spearman;
        for (int i = 0; i < spearman; i++) {
            for (int j = 0; j < Health_dragon; j++) {
                for(int z=0; z<Attacks_spearman; z++){
                    if (sum > 0 || Health_dragon <= 0) {
                        System.out.print("Копейщики атакуют(ущерб:" + sum + ")-у дракона осталось" + (Health_dragon - sum));
                        Health_dragon = Health_dragon - sum;
                        sum = sum - Attacks_dragon;
                        System.out.println("Дракон атакует(ущерб:" + Attacks_dragon + ") - осталось " + (spearsum) + "копейщика");
                        if ((Health_dragon - sum) <= 0) {
                            System.out.print("Копейщики атаковали, дракон побежден!");
                            break;
                        }else if(spearsum<=0){
                            System.out.print("Дракон победил" + spearman + "копейщика добавим ещё одного и попробуем заново");
                            spearman++;
                            break;
                        }
                    }
                    while(Health_dragon>=0);
                }

            }
        }
    }
}
