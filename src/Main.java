import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Кофе-машина");

        Scanner in = new Scanner(System.in);
        System.out.print("Input money amount, please: ");
        int moneyAmount = in.nextInt();

        int[] drinkPrices = {150, 80, 20, 50};
        String[] drinkNames = {"капучино", "эспрессо", "воду", "молоко"};

        boolean canBuyAnything = false;

        for( int i = 0; i < 4; i++ ) {
            if(moneyAmount >= drinkPrices[i]){
                System.out.println("You can buy " + drinkNames[i]);
                canBuyAnything = true;
            }
        }

        if(!canBuyAnything) {
            System.out.println("Not enough money");
        }
    }
}
