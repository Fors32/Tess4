/**
 * Created by Admin on 10.05.14.
 */
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import net.sourceforge.tess4j.*;
import java.awt.Robot;

public class MainForm {
//    private static Robot robot;
    public static void main(String[] args) {


        try {
//            File image = new File("C:\\Users\\Admin\\Desktop\\poker.jpg");
            Robot robot = new Robot();
        BufferedImage image = robot.createScreenCapture(new Rectangle(8,55,460,650));
        Tesseract instance = Tesseract.getInstance();  // JNA Interface Mapping
        // Tesseract1 instance = new Tesseract1(); // JNA Direct Mapping
/*
        } catch (AWTException e) {
            e.printStackTrace();
        }

        try {*/
            String result = instance.doOCR(image);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}