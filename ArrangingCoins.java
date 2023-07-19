package arrangingCoins;

import java.util.Scanner;

public class ArrangingCoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of coins: ");
        int coins = scanner.nextInt();
        scanner.close();
        System.out.print(stairCase(coins));

    }

    private static int stairCase(int coins) {
        int sum = 0, count = 0;
        for (int i = 0; i < coins; i++) {
            sum += i + 1;
            if (sum < coins) {
                count++;
            }
        }
        return count;
    }

}
