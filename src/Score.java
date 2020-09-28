import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Score extends JFrame
{
    JButton team1 = new JButton("AC Milan");
    JButton team2 = new JButton("Real Madrid");
    JLabel result = new JLabel("", JLabel.CENTER);
    JLabel last_s = new JLabel("", JLabel.CENTER);
    JLabel winner = new JLabel("Match doesn't started yet", JLabel.CENTER);
    private int milan_s;
    private int madrid_s;
    Font fnt = new Font("Times new roman",Font.BOLD,20);
    Score()
    {
        setLayout(new BorderLayout());
        setSize(350,250);
        add(team1, BorderLayout.WEST);
        add(team2, BorderLayout.EAST);
        add(result, BorderLayout.NORTH);
        add(winner, BorderLayout.CENTER);
        add(last_s, BorderLayout.SOUTH);
        team1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                milan_s+=1;
                result.setText("Result: "+milan_s+"X"+madrid_s);
                last_s.setText("Last Scorer: AC Milan ");
                if (madrid_s<milan_s) winner.setText("Winner: AC Milan");
                else if(madrid_s==milan_s) winner.setText("Winner: DRAW");
            }
        });
        team2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                madrid_s+=1;
                result.setText("Result: "+milan_s+"X"+madrid_s);
                last_s.setText("Last Scorer: Real Madrid");
                if (madrid_s>milan_s) winner.setText("Winner: Real Madrid");
                else if(madrid_s==milan_s) winner.setText("Winner: DRAW");
            }
        });
        setVisible(true);
    }
}