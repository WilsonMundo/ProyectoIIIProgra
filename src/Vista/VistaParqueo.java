/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

import Modelo.NodoVehiculo;
import Modelo.ParqueoEspacio;
import Modelo.Vehiculo;
import Servicio.Helpers;
import Servicio.INodoVehiculoCallback;
import Servicio.IVehiculoCallback;
import Servicio.ParqueosServicio;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

/**
 *
 * @author WilsonMundo
 */
public class VistaParqueo extends javax.swing.JInternalFrame {

    private ArrayList<ParqueoEspacio> parqueos = new ArrayList<>();
    private int cantidadDeParqueos = 0;
    private int CantidadUsados = 0;

    /**
     * Creates new form panelPruebas
     */
    public VistaParqueo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jftCantParqueo = new javax.swing.JFormattedTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Parqueos");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Parqueo"));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 776, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButton1.setBackground(new java.awt.Color(153, 255, 0));
        jButton1.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButton1.setText("Muestra Parqueo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Cantidad Parqueos");

        jftCantParqueo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jButton2.setBackground(new java.awt.Color(0, 51, 255));
        jButton2.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Registrar Vehiculo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 51));
        jButton3.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButton3.setText("Busqueda");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 51, 51));
        jButton4.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Eliminacion");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jftCantParqueo))
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jftCantParqueo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(0, 307, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jftCantParqueo.getText().trim().isEmpty() || jftCantParqueo.getText() == null) {
            JOptionPane.showMessageDialog(this, "Error la cantidad Parqueos no puede ser vacia", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String cantStr = jftCantParqueo.getText();

        if (Helpers.validaciones.esNumero(cantStr)) {
            cantidadDeParqueos = Integer.parseInt(cantStr);
        } else {
            JOptionPane.showMessageDialog(this, "Error el valor ingresado no es numero", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        jPanel2.removeAll();
        int maxColumns = 8;
        int filas = cantidadDeParqueos / maxColumns + (cantidadDeParqueos % maxColumns > 0 ? 1 : 0); // Calcular filas
        int hgap = 10;
        /*Espacio horizontal entre paneles*/
        int vgap = 10;
        /* Espacio vertical entre paneles*/

        GridLayout layout = new GridLayout(filas, maxColumns);
        layout.setHgap(hgap);
        /* Configurar el espacio horizontal*/
        layout.setVgap(vgap);
        /* Configurar el espacio vertical*/
        jPanel2.setLayout(layout);

        for (int i = 0; i < cantidadDeParqueos; i++) {
            JPanel panelParqueo = new JPanel();
            panelParqueo.setPreferredSize(new Dimension(82, 59));
            Color verdeIntenso = new Color(0, 128, 0);
            panelParqueo.setBorder(new LineBorder(verdeIntenso, 2));
            ParqueoEspacio parqueoEspacio = new ParqueoEspacio("", panelParqueo);
            parqueos.add(parqueoEspacio);
            /*Evento on click en cada panel */
            panelParqueo.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    /// System.out.println("Se hizo clic en un espacio de parqueo");
                }
            });

            jPanel2.add(panelParqueo);
        }

        jPanel2.revalidate();
        jPanel2.repaint();
        /* Repintar el contenedor*/
    }//GEN-LAST:event_jButton1ActionPerformed

    private void obtenerVehiculo(JDesktopPane desktopPanel, IVehiculoCallback callback) {
        final RegistrarVehiculo registrarVehiculo = new RegistrarVehiculo();

        registrarVehiculo.addInternalFrameListener(new InternalFrameAdapter() {
            @Override
            public void internalFrameClosed(InternalFrameEvent e) {
                Vehiculo vehiculo = registrarVehiculo.getVehiculo();
                callback.onVehiculoObtenido(vehiculo);
                /* Llamar al callback con el vehículo*/
            }
        });

        desktopPanel.add(registrarVehiculo);
        registrarVehiculo.setVisible(true);
    }

    private void obtenerNodoVehiculo(JDesktopPane desktopPanel, INodoVehiculoCallback callback) {
        final EliminarVehiculo eliminarVehiculo = new EliminarVehiculo();

        eliminarVehiculo.addInternalFrameListener(new InternalFrameAdapter() {
            @Override
            public void internalFrameClosed(InternalFrameEvent e) {
                NodoVehiculo nodoVehiculo = eliminarVehiculo.getnodoVehiculo();
                callback.onNodoVehiculoObtenido(nodoVehiculo);
                /* Llamar al callback con el vehículo*/
            }
        });

        desktopPanel.add(eliminarVehiculo);
        eliminarVehiculo.setVisible(true);
    }

    private void CambiarestadoParqueo(String placa) {
        for (ParqueoEspacio item : parqueos) {
            if (!(item.isOcupado())) {
                item.setNombre(placa);
                item.setOcupado(true);
                break;
            }

        }
    }

    private void ParqueoVacio(String placa) {
        for (ParqueoEspacio item : parqueos) {
            if (item.getNombre() == placa) {
                                               
                item.setNombre(""); 
                item.setOcupado(false);

            
                item.getPanel().repaint();
                item.getPanel().revalidate();
                break;
            }

        }
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        if (parqueos == null || parqueos.size() <= 0) {
            JOptionPane.showMessageDialog(this, "no existen parqueos registre la cantidad de parqueos", "Sin Parqueo", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (CantidadUsados == cantidadDeParqueos) {
            JOptionPane.showMessageDialog(this, "parqueo lleno", "Sin Parqueo", JOptionPane.ERROR_MESSAGE);
            return;
        }
        JDesktopPane desktopPanel = getDesktopPane();

        obtenerVehiculo(desktopPanel, new IVehiculoCallback() {
            @Override
            public void onVehiculoObtenido(Vehiculo vehiculo) {
                if (vehiculo != null) {
                    ParqueosServicio.Servicioparqueo.parqueoModelo.Insertar(vehiculo);
                    CambiarestadoParqueo(vehiculo.getPlaca());
                    CantidadUsados = CantidadUsados + 1;
                }
            }
        });
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        JDesktopPane desktopPanel = getDesktopPane();

        obtenerNodoVehiculo(desktopPanel, new INodoVehiculoCallback() {
            @Override
            public void onNodoVehiculoObtenido(NodoVehiculo nodoVehiculo) {
                if (nodoVehiculo != null) {
                }
            }
        });
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JDesktopPane desktopPanel = getDesktopPane();

        obtenerNodoVehiculo(desktopPanel, new INodoVehiculoCallback() {
            @Override
            public void onNodoVehiculoObtenido(NodoVehiculo nodoVehiculo) {
                if (nodoVehiculo != null) {
                    String placaold = nodoVehiculo.getVehiculo().getPlaca();
                    if (ParqueosServicio.Servicioparqueo.parqueoModelo.eliminarPorPlaca(nodoVehiculo)) {
                        ParqueoVacio(placaold);
                    }
                }
            }
        });
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JFormattedTextField jftCantParqueo;
    // End of variables declaration//GEN-END:variables
}
