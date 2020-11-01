/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosNegocio;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author Alfredo Perez
 */
public class Tabla extends JTable
{
    
    @Override
    public Component prepareRenderer(TableCellRenderer renderer, int rowIndex, int columIndex)
    {
        Component componente = super.prepareRenderer(renderer, rowIndex, columIndex);
        
        if(getValueAt(rowIndex, columIndex).equals("Asistio"))
        {
           componente.setBackground(new java.awt.Color(82,207,128));
           componente.setForeground(Color.BLACK);
          
        }
        else if(getValueAt(rowIndex, columIndex).equals("No Asistio"))
        {
            componente.setBackground(new java.awt.Color(240, 63, 73));
            componente.setForeground(Color.BLACK);
        }
        else
        {
           componente.setBackground(Color.WHITE);
           componente.setForeground(Color.BLACK);
        }
        return componente;
    }
    
}
