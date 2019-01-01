/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion_mysql;

import java.awt.Container;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JToolBar;
import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class MenuPrograma extends JFrame {

    public MenuPrograma() {

        initUI();
    }

    public final void initUI() {

        createMenuBar();
        createToolBars();

        setTitle("Toolbars");
        setSize(360, 250);
        setLocationRelativeTo(null);
        
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        
        this.addWindowListener(new WindowAdapter(){
        
            @Override
            public void windowClosing(WindowEvent we){
            
                //super.windowClosing(we);
                Cerrar();
                
            }
        
        });               
       
        
    }

    
    private void Cerrar(){
    
        String[] botones = {"Cerrar", "Cancelar"};
        int opcion = JOptionPane.showOptionDialog(this, "Estas seguro de que quiered cerrar la aplicacion?", "", 0, 0, null, botones, this);
        
        if (opcion == JOptionPane.YES_OPTION){
        
            System.exit(0);
            
        } else if (opcion == JOptionPane.NO_OPTION) {
        
            System.out.println("Cancelado");
            
        }
        
    }
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {
    
         Cerrar();
        
    }
    
     VistaPersona persona = new VistaPersona();
     
    private void empty() {
    
        persona.jTextField_idDocumento.setText("");
        persona.jTextField_nombreUsuario.setText("");
        persona.jTextField_apellidoUsuario.setText("");
        persona.jTextField_usuario.setText("");
        persona.jTextField_contrasena.setText("");
        persona.jTextField_fecha.setText("");
    
    } 
     
    private void createToolBars() {
        
        

        Menu el_menu = new Menu();
        
        el_menu.createMenuBar();
        
        
        JToolBar toolbar1 = new JToolBar();
        // JToolBar toolbar2 = new JToolBar();

       
        
        
        ImageIcon newIcon = new ImageIcon("src/resources/new.png");
        ImageIcon openIcon = new ImageIcon("src/resources/open.png");
        ImageIcon saveIcon = new ImageIcon("src/resources/save.png");
        ImageIcon exitIcon = new ImageIcon("src/resources/exit.png");
        ImageIcon personaIcon = new ImageIcon("src/resources/icono_persona.jpg");

        JButton newBtn = new JButton(newIcon);
        JButton openBtn = new JButton(openIcon);
        JButton saveBtn = new JButton(saveIcon);
        JButton personaBtn = new JButton(personaIcon);

        toolbar1.add(newBtn);
        toolbar1.add(openBtn);
        toolbar1.add(saveBtn);
        toolbar1.add(personaBtn);

        JButton exitBtn = new JButton(exitIcon);
        toolbar1.add(exitBtn);

        personaBtn.addActionListener((e) -> persona.show());
        personaBtn.addActionListener((e) -> empty());
        //if(persona.getInstance().isClosed()){}
        
        exitBtn.addActionListener((e) -> System.exit(0));

        createLayout(toolbar1);
    }

        private void createMenuBar() {

        JMenuBar menubar = new JMenuBar();
        ImageIcon exitIcon = new ImageIcon("src/resources/exit.png");

        JMenu fileMenu = new JMenu("Archivo");
        fileMenu.setMnemonic(KeyEvent.VK_F);

        // crea el item del menu "exit"
        JMenuItem eMenuItem = new JMenuItem("Salir", exitIcon);
        // crea un atajo a ese item
        eMenuItem.setMnemonic(KeyEvent.VK_E);
        // crea la funcionalidad de esta opcion
        eMenuItem.setToolTipText("Exit application");
        eMenuItem.addActionListener((event) -> System.exit(0));
        
        // crea los otros items del menu
        JMenu estoMenu = new JMenu("Usuarios");
        JMenu esMenu = new JMenu("Buscar");
        JMenu rMenu = new JMenu("Importar");
        JMenu pMenu = new JMenu("Esto es relleno para que este menu sea mas visible");
        
        // añade los items del menu importar
        JMenuItem mail = new JMenuItem("Importar email..");
        JMenuItem otro = new JMenuItem("Importar nuevo..");
        
        
        JMenuItem estoMenuItem = new JMenuItem("Usuarios");
        
        
        estoMenuItem.addActionListener((event) -> persona.setVisible(true));
        estoMenuItem.addActionListener((event) -> empty());
        
        // añade los items a los menus
        estoMenu.add(estoMenuItem);
        
        rMenu.add(mail);
        rMenu.add(otro);
        
        fileMenu.add(eMenuItem);
        
        fileMenu.add(rMenu);
        menubar.add(estoMenu);
        menubar.add(esMenu);
        menubar.add(fileMenu);
        menubar.add(pMenu);

        setJMenuBar(menubar);
    }
    
    private void createLayout(JComponent... arg) {

        Container pane = getContentPane();
        GroupLayout gl = new GroupLayout(pane);
        pane.setLayout(gl);

        gl.setHorizontalGroup(gl.createParallelGroup()
                .addComponent(arg[0], GroupLayout.DEFAULT_SIZE,
                        GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)/*
                .addComponent(arg[1], GroupLayout.DEFAULT_SIZE,
                        GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)*/
        );

        gl.setVerticalGroup(gl.createSequentialGroup()
                .addComponent(arg[0])
                /*.addComponent(arg[1])*/
        );
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            MenuPrograma ex = new MenuPrograma();
            ex.setExtendedState(JFrame.MAXIMIZED_BOTH);
            ex.setVisible(true);
            
        });
    }
}
