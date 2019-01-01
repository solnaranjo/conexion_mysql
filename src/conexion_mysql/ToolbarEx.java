/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion_mysql;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JToolBar;
import java.awt.BorderLayout;
import java.awt.EventQueue;

public class ToolbarEx extends JFrame {

    public ToolbarEx() {

        initUI();
    }

    private void initUI() {

        createMenuBar();
        createToolBar();

        setTitle("Simple toolbar");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createMenuBar() {

        JMenuBar menubar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");

        menubar.add(fileMenu);
        setJMenuBar(menubar);
    }

    private void createToolBar() {

        JToolBar toolbar = new JToolBar();
        ImageIcon icon = new ImageIcon("src/resources/exit.png");

        JButton exitButton = new JButton(icon);
        toolbar.add(exitButton);

        exitButton.addActionListener((e) -> System.exit(0));

        add(toolbar, BorderLayout.NORTH);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            ToolbarEx ex = new ToolbarEx();
            ex.setVisible(true);
        });
    }
}
