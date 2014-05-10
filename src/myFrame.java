
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import java.awt.image.*;
        import java.awt.image.BufferedImage;
        import javax.swing.*;
class myFrame extends JFrame
        {
private Robot robot;
public myFrame()
        {
        setTitle("iRobot"); // имя заголовка нашего окна
        JPanel panel = new JPanel(); // создаем контейнер
        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice screen=env.getDefaultScreenDevice(); // GraphicsDevice класс описывает графические устройства, которые могут быть доступны в определенной среде графики.
        try {
        robot=new Robot(screen);
        } catch (AWTException ex) { }
        JButton bt1 = new JButton("Screen"); // создаем кнопку
        panel.add(bt1); // добавляем нашу кнопку на панель
        bt1.addActionListener(new ActionListener() { // добавляем обработчик на нашу кнопку
public void actionPerformed(ActionEvent e) {
        BufferedImage image = robot.createScreenCapture(new Rectangle(0,0,600,600)); //именно это метод createScreenCapture у класса Robot позволяет нам получить часть изображения
        ImageFrame frame = new ImageFrame(image); // вызываем наш класс, который создает форму для нашего изображение
        frame.show();
        }
        });
        Container pane = getContentPane(); // создаем контейнер
        pane.add(panel); // добавляем нашу панель в контейнер
        pack(); // задает размер нашему фрейму исходя из размеров нашей кнопки
        }
        }
class ImageFrame extends JFrame
        {
public ImageFrame(Image image) // в конструктор передаем наше изображение
        {
        setTitle("ScreenWindow");
        Container pane = getContentPane();
        JLabel label = new JLabel (new ImageIcon(image)); // передаем в Label наше изображение
        pane.add(label);
        pack();
        }
        }

