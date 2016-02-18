package GUIVersion;

import javax.swing.*;
import java.awt.*;

/**
 * Created by pedrosilva on 1/29/16.
 */
public class WindowGenerator {

    public static JFrame BJ = new JFrame();

    public static WindowGenerator WG = new WindowGenerator();

    public static void main(String[] args){

        WG.generate(500, 400);
        WG.load("Pedro");

    }

    private void generate(int w, int h){

        BJ.setTitle("Black Jack");
        BJ.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BJ.setLayout(null);

        Dimension ss = Toolkit.getDefaultToolkit ().getScreenSize ();
        Dimension frameSize = new Dimension ( w, h );

        BJ.setBounds(ss.width / 2 - frameSize.width / 2,
                ss.height / 2 - frameSize.height / 2,
                frameSize.width, frameSize.height);

        BJ.setResizable(false);
        BJ.setMinimumSize(new Dimension(w, h));
        BJ.setVisible(true);
        BJ.pack();

    }

    public static JLabel lMoney = new JLabel();
    public static JLabel lTotalCards =  new JLabel();
    public static JLabel lCards = new JLabel();
    public static JLabel lTotalDCards = new JLabel();
    public static JLabel lDCards = new JLabel();


    private void load(String name){

        JLabel lTitle = new JLabel();
        JLabel lDealer = new JLabel();
        JLabel lName = new JLabel();

        lTitle.setText("Black Jack");
        lDealer.setText("Dealer");

        lTitle.setFont(new Font("Serif", Font.PLAIN, 30));
        lDealer.setFont(new Font("Serif", Font.PLAIN, 20));

        lTitle.setBounds(185, 40, 180, 30);
        lDealer.setBounds(210, 80, 100, 30);

        BJ.add(lTitle);
        BJ.add(lDealer);

        lName.setText(name);

        lName.setFont(new Font("Serif", Font.PLAIN, 20));

        lName.setBounds(230, 200, 100, 30);

        BJ.add(lName);

        lMoney.setFont(new Font("Serif", Font.PLAIN, 17));
        lTotalCards.setFont(new Font("Serif", Font.PLAIN, 17));
        lCards.setFont(new Font("Serif", Font.PLAIN, 17));
        lTotalDCards.setFont(new Font("Serif", Font.PLAIN, 17));
        lDCards.setFont(new Font("Serif", Font.PLAIN, 17));

        lMoney.setBounds(100, 300, 200, 30);
        lTotalCards.setBounds(230, 280, 100, 30);
        lCards.setBounds(200, 320, 200, 30);
        lTotalDCards.setBounds(230, 140, 100, 30);
        lDCards.setBounds(230, 170, 200, 30);

        BJ.add(lMoney);
        BJ.add(lTotalCards);
        BJ.add(lCards);
        BJ.add(lTotalDCards);
        BJ.add(lDCards);

    }

    public void reload(int money, int totalcards, int[] cards, int totalDcards, int[] Dcards){



    }

}
