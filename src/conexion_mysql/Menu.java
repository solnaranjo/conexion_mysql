/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion_mysql;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

/**
 *
 * @author Asus
 */
public class Menu extends JFrame {
    
    private JLabel statusbar;
    private JLabel statusbar2;
    public Menu(){
    
        initUI();
    
    }
   
    private void initUI() {

        // crea la barra de menu
        createMenuBar();
        
        // crea la barra de herramientas
        crearBarraHerramientas();
        
        // le asigna el nombre del JLabel statusbar2
        statusbar2 = new JLabel("Easy");   
        // le pone un borde a el JLabel para que sea visible
        statusbar2.setBorder(BorderFactory.createEtchedBorder());
        // añade la barra statusbar2
        add(statusbar2, BorderLayout.NORTH);
        
        statusbar = new JLabel("Ready");
        statusbar.setBorder(BorderFactory.createEtchedBorder());
        add(statusbar, BorderLayout.SOUTH);
        
        setTitle("JCheckBoxMenuItem");
        setSize(360, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void createMenuBar() {

        // crea una barra de menus para que los menus sean aplicables
        JMenuBar barra = new JMenuBar();
        
        // imagenes (no funcionan pero bueno)
        ImageIcon exitIcon = new ImageIcon("src/resources/exit.png");
        ImageIcon openIcon = new ImageIcon("src/resources/open.png");
        ImageIcon saveIcon = new ImageIcon("src/resources/save.png");
        ImageIcon newIcon = new ImageIcon("src/resources/new.png");
        
      
        
        // crea el menu Archivo
        JMenu fileMenu = new JMenu("Archivo");
        
        // crea un atajo a el menu archivo
        fileMenu.setMnemonic(KeyEvent.VK_F);
        
        
        // crea el menu Importar
        JMenu impMenu = new JMenu("Importar");
        
        
        // crea el menu Vista
        JMenu viewMenu = new JMenu("Vista");
        
        // crea un atajo al menu Vista
        viewMenu.setMnemonic(KeyEvent.VK_V);
        

        
        // crea un nuevo item de tipo checkbox
        JCheckBoxMenuItem show = new JCheckBoxMenuItem("Ver barra de progreso");
        
        show.setMnemonic(KeyEvent.VK_S);
        show.setDisplayedMnemonicIndex(5);
        show.setSelected(true);
        
        show.addItemListener((e) -> {
        
                // validar si el item show esta seleccionado
                if(e.getStateChange() == ItemEvent.SELECTED){

                    statusbar.setVisible(true);

                } else {

                    statusbar.setVisible(false);

                } // fin if
            
        }); // fin show.addItemListener
        
        viewMenu.add(show);
        barra.add(viewMenu);
        setJMenuBar(barra);
        
        // difMenu comienzo {
        // crea el menu difMenu (menu de dificultad
        JMenu difMenu = new JMenu("Dificultad");
        difMenu.setMnemonic(KeyEvent.VK_D);
        
        ButtonGroup difGroup = new ButtonGroup();
        
        // crea el elemento 'easy' de el menu difMenu
        JRadioButtonMenuItem easy = new JRadioButtonMenuItem("Easy");
        // pone easy como seleccionado predeterminadamente
        easy.setSelected(true);
        // añade el elemento easy a difMenu
        difMenu.add(easy);
        
        // verifica si easy esta seleccionado
        easy.addItemListener((e) -> {
        
                // validar si el item esta seleccionado
                if(e.getStateChange() == ItemEvent.SELECTED){

                    statusbar2.setText("Easy");

                }
            
        });
        
        
        // crea el elemento 'easy' de el menu difMenu
        JRadioButtonMenuItem medium = new JRadioButtonMenuItem("Medium");
      
        // añade el elemento medium a difMenu
        difMenu.add(medium);
        
        medium.addItemListener((e) -> {
        
                // validar si el item esta seleccionado
                if(e.getStateChange() == ItemEvent.SELECTED){

                    statusbar2.setText("Medium");

                }
            
        });
        
        // crea el elemento 'easy' de el menu difMenu
        JRadioButtonMenuItem hard = new JRadioButtonMenuItem("Hard");
      
        // añade el elemento medium a difMenu
        difMenu.add(hard);
        
        hard.addItemListener((e) -> {
        
                // validar si el item esta seleccionado
                if(e.getStateChange() == ItemEvent.SELECTED){

                    statusbar2.setText("Hard");

                }
            
        });
        
        difGroup.add(easy);        
        difGroup.add(medium);
        difGroup.add(hard);

        barra.add(difMenu);
        
        // difMenu fin }
        
        JMenu helpMenu = new JMenu("Ayuda");
        
        

        
        // crea los items del menu Importar
        JMenuItem newsMenuItem = new JMenuItem("Import newsfeed list..");
        JMenuItem bookmarksMenuItem = new JMenuItem("Import bookmarks..");
        JMenuItem mailMenuItem = new JMenuItem("Import mail..");
        
        
        // añade los items al menu Importar
        impMenu.add(newsMenuItem);
        impMenu.add(bookmarksMenuItem);
        impMenu.add(mailMenuItem);
        
        
        // crea los items del menu Archivo
        JMenuItem newMenuItem = new JMenuItem("Nuevo", newIcon);
        newMenuItem.setMnemonic(KeyEvent.VK_N);
        JMenuItem openMenuItem = new JMenuItem("Abrir", openIcon);
        openMenuItem.setMnemonic(KeyEvent.VK_O);
        JMenuItem saveMenuItem = new JMenuItem("Guardar", saveIcon);
        saveMenuItem.setMnemonic(KeyEvent.VK_S);
        JMenuItem eMenuItem = new JMenuItem("Salir", exitIcon);
        eMenuItem.setMnemonic(KeyEvent.VK_E);
        
        //  le pone el texto respectivo a la opcion de salir
        eMenuItem.setToolTipText("Salir de aplicacion");
        eMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E,
        ActionEvent.CTRL_MASK));
        
        
        // hace que la opcion de salir tenga efecto
        eMenuItem.addActionListener((event) -> System.exit(0));

        
        // Le añade los objetos al menu
        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(impMenu);
        fileMenu.addSeparator();
        fileMenu.add(eMenuItem);
        
        
        
        // le manda todos los objetos del menu a la barra
        barra.add(fileMenu);
        barra.add(Box.createHorizontalGlue());
        barra.add(helpMenu);
        
        //
        setJMenuBar(barra);
    }

    
    private void crearBarraHerramientas(){
    
        // crea la barra
        JToolBar herramienta = new JToolBar();
        
        // crea el icono
        ImageIcon icon = new ImageIcon("src/resources/exit.png");
        
        // crea el boton, dandole el icono como imagen
        JButton exit1 = new JButton(icon);
        // le añade el boton a la barra de herramientas
        herramienta.add(exit1);
        
        exit1.addActionListener((e) -> System.exit(0));
        
        add(herramienta, BorderLayout.NORTH);
        
        herramienta.show();
        
    };
    
    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            Menu ex = new Menu();
            ex.setVisible(true);
        });
        
        
        
    }

    
}
