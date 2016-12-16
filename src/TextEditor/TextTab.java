/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TextEditor;

import java.awt.BorderLayout;
import java.awt.TextArea;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;



/**
 *
 * @author Andreas
 */
public class TextTab extends JPanel {
    
    private JTextArea myTextArea;
    
    public TextTab(String name)
    {
        this.setName(name);
        this.setLayout(new BorderLayout());
        myTextArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(myTextArea);
        this.add(scrollPane);
        
        myTextArea.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("Typed "+e.getKeyChar());
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Pressed "+e.getKeyChar());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("Released "+e.getKeyChar());
            }
        });
    }
    
    public void addText(String txt)
    {
        myTextArea.setText(myTextArea.getText() + txt);
    }
}
