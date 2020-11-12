/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazUsuario;

import javax.swing.JOptionPane;
import org.bson.Document;
import repository.CursosRepository;

/**
 *
 * @author Alfredo Perez
 */
public class DlgAgregarCurso extends javax.swing.JDialog 
{
    private String[] dias = new String[7];
    private String nombreDias;
    private CursosRepository cursosRepo;
    
    /**
     * Creates new form DlgAgregarCurso
     * @param parent
     * @param modal
     * @param cursosRepo
     */
    public DlgAgregarCurso(java.awt.Frame parent, boolean modal, CursosRepository cursosRepo) 
    {
        super(parent, modal);
        this.initComponents();
        this.cursosRepo = cursosRepo;
        this.setTitle("Agregar Curso");
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo = new javax.swing.JPanel();
        etiquetaTitulo = new javax.swing.JLabel();
        etiquetaNombre = new javax.swing.JLabel();
        etiquetaPeriodo = new javax.swing.JLabel();
        etiquetaDias = new javax.swing.JLabel();
        etiquetaHora = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtHora = new javax.swing.JFormattedTextField();
        botonAgregarCurso = new javax.swing.JButton();
        comboPeriodo = new javax.swing.JComboBox<>();
        checkLunes = new javax.swing.JCheckBox();
        checkMartes = new javax.swing.JCheckBox();
        checkMiercoles = new javax.swing.JCheckBox();
        checkJueves = new javax.swing.JCheckBox();
        checkViernes = new javax.swing.JCheckBox();
        checkSabado = new javax.swing.JCheckBox();
        checkDomingo = new javax.swing.JCheckBox();
        txtDias = new javax.swing.JTextField();
        botonCanelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        panelFondo.setBackground(new java.awt.Color(240, 202, 171));

        etiquetaTitulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        etiquetaTitulo.setText("Registrar cursos");

        etiquetaNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaNombre.setText("Nombre: ");

        etiquetaPeriodo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaPeriodo.setText("Periodo: ");

        etiquetaDias.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaDias.setText("Dias: ");

        etiquetaHora.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        etiquetaHora.setText("Hora: ");

        txtNombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        try {
            txtHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtHora.setText("");

        botonAgregarCurso.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonAgregarCurso.setText("Agregar");
        botonAgregarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarCursoActionPerformed(evt);
            }
        });

        comboPeriodo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        comboPeriodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AgoDic20", "EneMay21", "AgoDic21" }));

        checkLunes.setBackground(new java.awt.Color(240, 202, 171));
        checkLunes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        checkLunes.setText("Lunes");
        checkLunes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkLunesActionPerformed(evt);
            }
        });

        checkMartes.setBackground(new java.awt.Color(240, 202, 171));
        checkMartes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        checkMartes.setText("Martes");
        checkMartes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMartesActionPerformed(evt);
            }
        });

        checkMiercoles.setBackground(new java.awt.Color(240, 202, 171));
        checkMiercoles.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        checkMiercoles.setText("Miercoles");
        checkMiercoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMiercolesActionPerformed(evt);
            }
        });

        checkJueves.setBackground(new java.awt.Color(240, 202, 171));
        checkJueves.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        checkJueves.setText("Jueves");
        checkJueves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkJuevesActionPerformed(evt);
            }
        });

        checkViernes.setBackground(new java.awt.Color(240, 202, 171));
        checkViernes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        checkViernes.setText("Viernes");
        checkViernes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkViernesActionPerformed(evt);
            }
        });

        checkSabado.setBackground(new java.awt.Color(240, 202, 171));
        checkSabado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        checkSabado.setText("Sabado");
        checkSabado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkSabadoActionPerformed(evt);
            }
        });

        checkDomingo.setBackground(new java.awt.Color(240, 202, 171));
        checkDomingo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        checkDomingo.setText("Domingo");
        checkDomingo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkDomingoActionPerformed(evt);
            }
        });

        txtDias.setEditable(false);
        txtDias.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        botonCanelar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonCanelar.setText("Cancelar");
        botonCanelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCanelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etiquetaDias)
                            .addComponent(etiquetaPeriodo)
                            .addComponent(etiquetaNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre)
                            .addComponent(comboPeriodo, 0, 250, Short.MAX_VALUE)
                            .addComponent(txtDias)))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFondoLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(botonCanelar))
                                    .addGroup(panelFondoLayout.createSequentialGroup()
                                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(checkMartes)
                                            .addComponent(checkLunes))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(checkSabado)
                                            .addComponent(checkDomingo)))
                                    .addGroup(panelFondoLayout.createSequentialGroup()
                                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(checkJueves)
                                            .addComponent(checkViernes)
                                            .addComponent(checkMiercoles))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(panelFondoLayout.createSequentialGroup()
                                .addComponent(etiquetaHora)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelFondoLayout.createSequentialGroup()
                                        .addComponent(botonAgregarCurso)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(panelFondoLayout.createSequentialGroup()
                                        .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(127, 127, 127))))))
                    .addComponent(etiquetaTitulo))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(etiquetaTitulo)
                .addGap(37, 37, 37)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaPeriodo)
                    .addComponent(comboPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaDias)
                    .addComponent(txtDias, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addComponent(checkLunes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkMartes))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addComponent(checkSabado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkDomingo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkMiercoles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkJueves)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkViernes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaHora)
                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAgregarCurso)
                    .addComponent(botonCanelar))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarCursoActionPerformed
        if(validarCampos())
        {
              Document documento = new Document();
              documento.append("nombre", txtNombre.getText());
              documento.append("periodo", comboPeriodo.getSelectedItem().toString());
              documento.append("dias", txtDias.getText());
              documento.append("hora", validarHora(txtHora.getText()));
              if(comprobarSiElCursoExiste(documento)!=true)
              {
                  cursosRepo.agregarDoumento(documento);
                  JOptionPane.showMessageDialog(this, "El curso se agrego correctamente!", "Mensaje Aviso", JOptionPane.INFORMATION_MESSAGE);
                  dispose();
              }else{JOptionPane.showMessageDialog(this, "Error! \n Este curso ya fue registrado", "Mensaje Error", JOptionPane.ERROR_MESSAGE);}
        }
    }//GEN-LAST:event_botonAgregarCursoActionPerformed

    private boolean validarCampos()
    {
        String hora;
        hora = validarHora(txtHora.getText());
        
        if(("".equals(txtNombre.getText())))
        {
            JOptionPane.showMessageDialog(this, "Error! \n El campo nombre no puede estar vacio", "Mensaje Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else if(txtDias.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Error! \n No hay dias seleccionados", "Mensaje Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else if(hora == null)
        {
            JOptionPane.showMessageDialog(this, "Error! \n El campo hora es incorrecto", "Mensaje Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    private boolean comprobarSiElCursoExiste(Document documento)
    {
        Document cursoEncontrado;
        cursoEncontrado = cursosRepo.buscarCurso(documento);
        return cursoEncontrado!=null;
    }
    
    private void checkMiercolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMiercolesActionPerformed
        actualizarDias();
    }//GEN-LAST:event_checkMiercolesActionPerformed

    private void checkJuevesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkJuevesActionPerformed
        actualizarDias();
    }//GEN-LAST:event_checkJuevesActionPerformed

    private void checkViernesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkViernesActionPerformed
        actualizarDias();
    }//GEN-LAST:event_checkViernesActionPerformed

    private void checkSabadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkSabadoActionPerformed
        actualizarDias();
    }//GEN-LAST:event_checkSabadoActionPerformed

    private void checkDomingoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkDomingoActionPerformed
        actualizarDias();
    }//GEN-LAST:event_checkDomingoActionPerformed

    private void checkLunesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkLunesActionPerformed
        actualizarDias();
    }//GEN-LAST:event_checkLunesActionPerformed

    private void checkMartesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMartesActionPerformed
        actualizarDias();
    }//GEN-LAST:event_checkMartesActionPerformed

    private void botonCanelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCanelarActionPerformed
        dispose();
    }//GEN-LAST:event_botonCanelarActionPerformed

   
    private String validarHora(String cadenaHora)
    {
        String[] hora;
        hora = cadenaHora.split(":");
        
        if((hora[0].equals("  ")) || (hora[1].equals("  ")))
        {
            txtHora.setText("");
            return null;
        }
        
        if(((Integer.valueOf(hora[0])>=0) && (Integer.valueOf(hora[0])<25))&&
           ((Integer.valueOf(hora[1])>=0) && (Integer.valueOf(hora[1])<61)))
        {
            return hora[0]+":"+hora[1];
        }
        txtHora.setText("");
        return null;
    }
    
    private void actualizarDias()
    {
        nombreDias = "";
        if(checkLunes.isSelected()==true)
        {
            dias[0] = "Lu";
        }
        else if(checkLunes.isSelected()==false)
        {
            dias[0] = "";
        }
        
        if(checkMartes.isSelected()==true)
        {
            dias[1] = "Ma";
        }
        else if(checkMartes.isSelected()==false)
        {
            dias[1] = "";
        }
        
        if(checkMiercoles.isSelected()==true)
        {
            dias[2] = "Mi";
        }
        else if(checkMiercoles.isSelected()==false)
        {
            dias[2] = "";
        }
        
        if(checkJueves.isSelected()==true)
        {
            dias[3] = "Ju";
        }
        else if(checkJueves.isSelected()==false)
        {
            dias[3] = "";
        }
        
        if(checkViernes.isSelected()==true)
        {
            dias[4] = "Vi";
        }
        else if(checkViernes.isSelected()==false)
        {
            dias[4] = "";
        }
        
        if(checkSabado.isSelected()==true)
        {
            dias[5] = "Sa";
        }
        else if(checkSabado.isSelected()==false)
        {
            dias[5] = "";
        }
        
        if(checkDomingo.isSelected()==true)
        {
            dias[6] = "Do";
        }
        else if(checkDomingo.isSelected()==false)
        {
            dias[6] = "";
        }
        
        for (String dia : dias) {
            if (!dia.equals("")) {
                nombreDias = nombreDias + dia;
            }
        }
        txtDias.setText(nombreDias);
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarCurso;
    private javax.swing.JButton botonCanelar;
    private javax.swing.JCheckBox checkDomingo;
    private javax.swing.JCheckBox checkJueves;
    private javax.swing.JCheckBox checkLunes;
    private javax.swing.JCheckBox checkMartes;
    private javax.swing.JCheckBox checkMiercoles;
    private javax.swing.JCheckBox checkSabado;
    private javax.swing.JCheckBox checkViernes;
    private javax.swing.JComboBox<String> comboPeriodo;
    private javax.swing.JLabel etiquetaDias;
    private javax.swing.JLabel etiquetaHora;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaPeriodo;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JTextField txtDias;
    private javax.swing.JFormattedTextField txtHora;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
