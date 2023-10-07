import javax.swing.*;
import java.awt.*;

public class gameframe extends JFrame{
    private JLabel scoreLabel;
    gameframe(){
        this.add(new gamepanel(this));
        this.setTitle("SHNEK");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

        scoreLabel = new JLabel("SCORE: 0");
        scoreLabel.setFont(new Font("Calibri", Font.BOLD, 20));
        scoreLabel.setForeground(Color.RED);
        this.add(scoreLabel, BorderLayout.NORTH);



    }
    public void updateScore(int score){
        scoreLabel.setText("SCORE: " + score);
    }

}
