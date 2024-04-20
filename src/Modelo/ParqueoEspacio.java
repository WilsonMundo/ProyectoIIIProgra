/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * 
 */
public class ParqueoEspacio {
    private String placa; 
    private boolean ocupado; 
    private JPanel panel;

    public ParqueoEspacio(String nombre, JPanel panel) {
        this.placa = nombre;
        this.ocupado = false;
        this.panel = panel;
    }

    public String getNombre() {
        return placa;
    }

    public void setNombre(String nombre) {
        this.placa = nombre;
        JLabel labelDes = new JLabel("Placa");
        JLabel label = new JLabel(nombre);
        label = retornaConfigurado(label,false);
        labelDes = retornaConfigurado(labelDes,true);
         panel.add(labelDes);
         panel.add(label);
    }
    public JLabel retornaConfigurado(JLabel label,boolean negrita)
    {
        label.setHorizontalAlignment(JLabel.CENTER); 
        label.setVerticalAlignment(JLabel.CENTER);
        label.setForeground(Color.WHITE);     
        if(negrita)
            label.setFont(new Font(label.getFont().getName(), Font.BOLD, 12));  
        else
            label.setFont(new Font(label.getFont().getName(), Font.PLAIN, 12));  
        return label;
    }
    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
          this.ocupado = ocupado;

        
        if (ocupado) {
            panel.setBackground(Color.red);
            Color negro = new Color(65, 23, 14);
            panel.setBorder(new LineBorder(negro, 2));
        } else {
            panel.setBackground(null); 
        }

        panel.repaint(); 
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }
    
    
    
}
