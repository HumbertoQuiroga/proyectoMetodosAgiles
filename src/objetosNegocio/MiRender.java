/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosNegocio;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Alfredo Perez
 */
public class MiRender extends DefaultTableCellRenderer
{
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int colum)
    {
        JLabel lable = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, colum);
        
        if(value instanceof String)
        {
            lable.setBackground(new java.awt.Color(82,207,128));
            lable.setForeground(Color.BLACK);
            String asistencia = (String)value;
            if(colum == 2)
            {
                if(asistencia.equals("Asistio"))
                {
                   lable.setBackground(new java.awt.Color(82,207,128));
                   lable.setForeground(Color.BLACK);

                }
                else if(asistencia.equals("No Asistio"))
                {
                    lable.setBackground(new java.awt.Color(240, 63, 73));
                    lable.setForeground(Color.BLACK);
                }
            }else
            {
               lable.setBackground(Color.WHITE);
               lable.setForeground(Color.BLACK);
            }
        }
        
        if(isSelected == true)
        {
                lable.setBackground(new Color(27,255,255));
                String asistencia = (String)value;
                if(asistencia.equals("Asistio"))
                {
                   lable.setBackground(new java.awt.Color(82,207,128));
                   lable.setForeground(Color.BLACK);

                }
                else if(asistencia.equals("No Asistio"))
                {
                    lable.setBackground(new java.awt.Color(240, 63, 73));
                    lable.setForeground(Color.BLACK);
                }
        }
        
        return lable;
    }
    
    
    
}
