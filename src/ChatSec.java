import javax.swing.*;
import java.awt.*;

public class ChatSec extends JFrame {
    JLabel chatLabel;
    JTextArea displayField;
    JTextField chatField;
    JButton sumbit;
    Container container;
    GridBagLayout layout;

    public ChatSec() {
        chatLabel = new JLabel("Chat:");
        displayField = new JTextArea(8,20);
        chatField = new JTextField(10);
        sumbit = new JButton("Submit");
        layout = new GridBagLayout();
        container = this.getContentPane();
        container.setLayout(layout);

        displayField.setEditable(false);

        addContainer(displayField, 0, 0, 3, 1, 1, 3);
        addContainer(chatLabel, 0,1,1,1,0,0);
        addContainer(chatField, 1,1,1,1,1,0);
        addContainer(sumbit, 2,1,1,1,0,0);

        this.setVisible(true);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addContainer (Component component, int gridx, int gridy, int gridwidth, int gridheight, int weightx, int weighty) {
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = gridx;
        gridBagConstraints.gridy = gridy;
        gridBagConstraints.gridwidth = gridwidth;
        gridBagConstraints.gridheight = gridheight;
        gridBagConstraints.weightx = weightx;
        gridBagConstraints.weighty = weighty;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        container.add(component, gridBagConstraints);
    }
}

