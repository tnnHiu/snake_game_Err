import javax.swing.*;
import java.io.Serial;

public class GameFrame extends JFrame {
    @Serial
    private static final long serialVersionUID = 1L;

    GameFrame() {
        GamePanel gamePanel = new GamePanel();
        this.add(gamePanel);
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }


}
