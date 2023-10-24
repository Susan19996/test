import javax.swing.*;
import java.awt.*;


public class JFrameDemo  extends  JFrame {

    public JFrameDemo() {
        setTitle("It is the first Java GUI program");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel jL = new JLabel("window");
        Container c = getContentPane();
        c.add(jL);
        setVisible(true);
    }


    public static void main(String[] args) {
       JFrame jf = new JFrame("calculator");
       JPanel panel = new JPanel();
       panel.setLayout(new GridLayout(4,4,5,5));
       panel.add(new JButton("7"));
       panel.add(new JButton("8"));
       panel.add(new JButton("9"));
        panel.add(new JButton("/"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("*"));
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("-"));
        panel.add(new JButton("0"));
        panel.add(new JButton("."));
        panel.add(new JButton("="));
        panel.add(new JButton("+"));
        jf.add(panel);
        jf.setBounds(300,200,200,150);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);


    }

}
