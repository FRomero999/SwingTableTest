package org.example;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Principal extends JFrame {
    private JTable table1;
    private JPanel panel1;


    public Principal() {

        this.setContentPane(panel1);
        this.setTitle("Principal Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        String[] header = {"Title","Platform","Year"};
        var tableModel = new DefaultTableModel(header,0);
        table1.setModel(tableModel);

        Data.gameList.forEach( (g)->{
            tableModel.addRow(new Object[]{g.getTitle(),g.getPlatform(),g.getYear()});
        });

        table1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if(e.getValueIsAdjusting()) return;
                Session.activeGame = new Game(
                        (String) tableModel.getValueAt(table1.getSelectedRow(),0),
                        (String) tableModel.getValueAt(table1.getSelectedRow(),1),
                        (Integer) tableModel.getValueAt(table1.getSelectedRow(),2)
                );
                System.out.println(Session.activeGame);

                var info = new Info();
                info.setTitle((String) tableModel.getValueAt(table1.getSelectedRow(),0));
                info.setVisible(true);
            }
        });


    }
}
