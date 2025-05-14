import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatMain {
    public static void main(String[] args) {
        ChatSec frame1 = new ChatSec();
        ChatSec frame2 = new ChatSec();

        frame1.setTitle("Silay");
        frame2.setTitle("tatlo ka talisay123");
        frame1.setSize(400, 230);
        frame2.setSize(400, 230);

        frame1.sumbit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String chatbox = frame1.chatField.getText();
                if (!chatbox.isEmpty()) {
                    frame1.displayField.append("McDado: " + chatbox + "\n"); // Display in Chat 1
                    frame2.displayField.append("McDado: " + chatbox + "\n"); // Display in Chat 2
                    frame1.chatField.setText(""); // Clear input field after sending
                }
            }
        });

        frame2.sumbit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String chatbox = frame2.chatField.getText();
                if (!chatbox.isEmpty()) {
                    frame2.displayField.append("Chat 4: " + chatbox + "\n"); // Display in Chat 2
                    frame1.displayField.append("Chat 4: " + chatbox + "\n"); // Display in Chat 1
                    frame2.chatField.setText(""); // Clear input field after sending
                }
            }
        });
    }
}
