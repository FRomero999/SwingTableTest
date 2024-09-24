package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Info extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JLabel titulo;
    private JLabel plataforma;
    private JLabel año;

    public Info() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        if(Session.activeGame!=null){
            titulo.setText(Session.activeGame.getTitle());
            plataforma.setText(Session.activeGame.getPlatform());
            año.setText(String.valueOf(Session.activeGame.getYear()));
        }
        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        pack();
        setLocationRelativeTo(null);

    }

    private void onOK() {
        dispose();
    }

}
