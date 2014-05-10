import javax.swing.*;

public class myRobot {
    public static void main(String[] args) {
        myFrame frame = new myFrame(); // создаем объект класса myFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // задаем действие обработчику на кнопку "крестик"
        frame.show(); // выводим на экран нашу форму
    }
}