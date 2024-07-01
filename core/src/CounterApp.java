import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterApp {
    private int counter = 0;
    private JLabel label;

    public CounterApp() {
        JFrame frame = new JFrame("Counter App");
        JButton button = new JButton("Increment");
        label = new JLabel("Count: 0");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter++;
                label.setText("Count: " + counter);
            }
        });

        frame.setLayout(new java.awt.FlowLayout());
        frame.add(label);
        frame.add(button);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new CounterApp();
    }
}