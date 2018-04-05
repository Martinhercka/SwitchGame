import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwitchGame
{
    private JPanel panel1;
    private JButton img13;
    private JButton img14;
    private JButton img15;
    private JButton img16;
    private JButton img9;
    private JButton img10;
    private JButton img11;
    private JButton img12;
    private JButton img8;
    private JButton img7;
    private JButton img6;
    private JButton img5;
    private JButton img4;
    private JButton img3;
    private JButton img2;
    private JButton img1;
    private JButton exitGameButton;
    private JButton newGameButton;
    private State state = State.NEW;
    private boolean[][] field = new boolean[4][4];


    public SwitchGame()
    {
        exitGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        img1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processClick(1);
            }
        });
        img2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processClick(2);
            }
        });
        img3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processClick(3);
            }
        });
        img4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processClick(4);
            }
        });
        img5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processClick(5);
            }
        });
        img6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processClick(6);
            }
        });
        img7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processClick(7);
            }
        });
        img8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processClick(8);
            }
        });
        img9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processClick(9);
            }
        });
        img10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processClick(10);
            }
        });
        img11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processClick(11);
            }
        });
        img12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processClick(12);
            }
        });
        img13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processClick(13);
            }
        });
        img14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processClick(14);
            }
        });
        img15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processClick(15);
            }
        });
        img16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processClick(16);
            }
        });

        newGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                state=State.PLAYING;
                for(int i =0;i<4;i++)
                {
                    for (int j=0;j<3;j++)
                    {
                        field[i][j]=false;
                    }
                }
            }
        });
    }
    private void processClick(int i)
    {
        if (state == State.PLAYING)
        System.out.println("You clicked on "+i);
        toogle(1);
    }

    public void toogle(int i) throws Exception
    {
        int col = (i-1)%4;
        int row = (i-1)/4;
        Image img;

        field[row][col]=!field[row][col];
        if(field[row][col] == false)
        {
            img=ImageIO.read(getClass().getResource("2000px-Moon_Letter_O.png"));
        }
        else
        {
            img=ImageIO.read(getClass().getResource("X.png"));
        }
        img1.setIcon(new ImageIcon(img));
    }

    public JPanel getPanel1()
    {
        return panel1;
    }


}

