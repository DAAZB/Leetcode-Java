package my;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
    JLabel label;
    public MyFrame()
    {
        JFrame frame = new JFrame("null");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        JPanel panel = new JPanel();
        frame.setContentPane(panel);

        JButton button = new JButton("test");
        panel.add(button);
        label = new JLabel("2000-01-01 00:00:00");
        panel.add(label);


        ActionListener l = new MyActionListener();
        button.addActionListener(l);

        frame.setVisible(true);
        frame.setLocation(1960, 500);
    }

    /////////////////////////////////
    public class MyActionListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            System.out.println("test");
            Date now = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String time_str = sdf.format(now);
            
            MyFrame.this.label.setText(time_str);
        }

    }
}
