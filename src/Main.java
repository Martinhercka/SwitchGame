import javax.swing.*;

public class Main
{

    public static void main(String[] args)
    {
        JFrame jframe = new JFrame("App");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(600, 600);
        jframe.setContentPane(new SwitchGame().getPanel1());
        jframe.setVisible(true);

    }
}
