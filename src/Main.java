import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.awt.Robot;

import static javax.imageio.ImageIO.write;

public class Main {
    public static void main(String[] args) throws AWTException, IOException {
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

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyy/MM/dd HH:mm:ss");
        Date today = new Date();
        System.out.println(dateFormat.format(today));

        BufferedImage image = new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        ImageIO.write(image, "png", new File("d://pics/screenshot.png"));
        System.out.println(image.getWidth() + " x " + image.getHeight());
    }
}
