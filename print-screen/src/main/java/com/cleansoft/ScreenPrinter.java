package com.cleansoft;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ScreenPrinter {

    public static void main(String[] args) throws AWTException, IOException {
        Rectangle rectangle = new Rectangle(
                Toolkit.getDefaultToolkit().getScreenSize());
        Robot robot = new Robot();
        BufferedImage image = robot.createScreenCapture(rectangle);
        ImageIO.write(image,"jpg",new File("image.jpg"));
    }
}
