/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion_mysql;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

/**
 *
 * @author Asus
 */
public class Menu2 extends JFrame {
    
    private JPopupMenu popup;
    
    public Menu2(){
    
        initUI();
        
    }
    
    private void initUI() {
    
        createMenuBar();
    
    }
    
     private void createMenuBar() {
     
         popup = new JPopupMenu();
         
         JMenuItem maximize = new JMenuItem("Maximizar");
         maximize.addActionListener((e) -> {
         
             if (getExtendedState() != JFrame.MAXIMIZED_BOTH) {
             
                 setExtendedState(JFrame.MAXIMIZED_BOTH);
                 maximize.setEnabled(false);   
             
             }// fin if
         }); // fin addActionListener
         
        popup.add(maximize);
         
        JMenuItem quit = new JMenuItem("Quit");
        quit.addActionListener((e) -> System.exit(0));
        
        popup.add(quit);
        
        addMouseListener(new MouseAdapter(){
        
            @Override
            public void mouseReleased(MouseEvent e){

                if (getExtendedState() != JFrame.MAXIMIZED_BOTH){
                
                    maximize.setEnabled(true);
                
                }
                
                if (e.getButton() == MouseEvent.BUTTON3){
                
                    popup.show(e.getComponent(), e.getX(), e.getY());
                    
                }

            }
            
        });
        
        // crea una barra de menus para que los menus sean aplicables
        JMenuBar barra = new JMenuBar();
        
        
     
     }
    
    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            
            Menu2 ex = new Menu2();
            ex.setVisible(true);
                
        });
    }
}
