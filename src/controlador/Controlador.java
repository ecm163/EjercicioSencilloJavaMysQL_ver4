
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.Modelo;
import vista.Vista;
import static vista.Vista.grupoRadioBotones;


//import static vista.Vista.radioBotonEdad;
//import static vista.Vista.radioBotonId;
//import static vista.Vista.radioBotonNombre;

//Las siguientes librerías se agregande forma manual. Escribiendolas.

/**
 *
 * @author Emilio
 */
public class Controlador implements ActionListener {
    
    private Modelo modelo;
    private Vista vista;

    public Controlador(Modelo modelo, Vista vista) {
        
        this.modelo = modelo;
        this.vista = vista;
        
        this.vista.botonGuardar.addActionListener(this);
        this.vista.botonLimpiar.addActionListener(this);
        this.vista.botonModificar.addActionListener(this);
        
        this.vista.botonActualizar.addActionListener(this);
        this.vista.botonEliminar.addActionListener(this);
        
        this.vista.botonBuscar.addActionListener(this);
        this.vista.botonMostrarTabla.addActionListener(this);
        this.vista.botonGenerarPDF.addActionListener(this);
             
        
    }
    
    public void iniciar(){
        vista.setTitle("Sistema con MVC.");
        vista.pack();
        vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
        modelo.agregarItem();
        modelo.mostrartabla("");
        //m.MostrarUsuarios();
        //m.BloquearUsuario();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(vista.botonGuardar == e.getSource()){
            
            try{
                
                modelo.Guardar();
                modelo.mostrartabla("");
                
            }catch (Exception ex) {
                
                JOptionPane.showMessageDialog(null, "No se ha podido guardar los datos.");
                
            }
            
        }
        
        if(vista.botonLimpiar == e.getSource()){
            
            try{
                
                modelo.limpiar();
                
            }catch (Exception ex) {
                
                JOptionPane.showMessageDialog(null, "No se ha podido limpiar los campos.");
                
            }
            
        }
        
                
        if(vista.botonModificar == e.getSource()){
            
            try{
                
                modelo.Modificar();
                modelo.mostrartabla("");
                
            }catch (Exception ex) {
                
                JOptionPane.showMessageDialog(null, "No se ha podido actualizar los datos.");
                
            }
            
        }
        
        
        if(vista.botonActualizar == e.getSource()){
            
            try{
                
                modelo.Atualizar();
                modelo.mostrartabla("");
                
            }catch (Exception ex) {
                
                JOptionPane.showMessageDialog(null, "No se ha podido limpiar los campos.");
                
            }
            
        } 
        
        if(vista.botonEliminar == e.getSource()){
            
            try{
                
                modelo.Eliminar();
                modelo.mostrartabla("");
                
            }catch (Exception ex) {
                
                JOptionPane.showMessageDialog(null, "No se ha podido eliminar los datos.");
                
            }
            
        }
        
        if(vista.botonBuscar == e.getSource()){
            
            try{
                
                modelo.Buscar();
                                
            }catch (Exception ex) {
                
                JOptionPane.showMessageDialog(null, "No se ha podido eliminar los datos.");
                
            }
            
        }
        
        if(vista.botonMostrarTabla == e.getSource()){
            
            try{
                
                modelo.mostrartabla("");
                                
            }catch (Exception ex) {
                
                JOptionPane.showMessageDialog(null, "No se ha podido eliminar los datos.");
                
            }
            
        }
        
        if(vista.botonGenerarPDF == e.getSource()){
            
            try{
                
                modelo.GenerarDocumentoPDF();
                                
            }catch (Exception ex) {
                
                JOptionPane.showMessageDialog(null, "No se ha podido generar el documento PDF.");
                
            }
            
        }
        
    }
    
}
