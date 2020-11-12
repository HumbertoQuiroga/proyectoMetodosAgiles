/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazUsuario;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import objetosNegocio.MiRender;
import org.bson.Document;
import repository.AsistenciaCursosRepository;
import repository.CursosRepository;

/**
 *
 * @author Alfredo Perez
 */
public class DlgMostrarListasAsistencias extends javax.swing.JDialog {

    private MiRender mirender = new MiRender();
    private AsistenciaCursosRepository asistenciaCursosRepository;
    private CursosRepository cursosRepo;
    private List<Document> listaContenido;
    
    /**
     * Creates new form DlgMostrarListasAsistencias
     * @param parent
     * @param modal
     * @param asistenciaCursosRepository
     * @param cursosRepo
     * @param accion
     */
    public DlgMostrarListasAsistencias(java.awt.Frame parent, boolean modal, AsistenciaCursosRepository asistenciaCursosRepository, CursosRepository cursosRepo, int accion) 
    {
        super(parent, modal);
        this.initComponents();
        this.asistenciaCursosRepository = asistenciaCursosRepository;
        this.cursosRepo = cursosRepo;
        this.llenarComboBoxCursos();
        this.listaContenido = new ArrayList<>();
        if(accion == ConstantesGUI.MODIFICAR){configurarParaModificar();}
        else if(accion == ConstantesGUI.CONSULTAR){this.setTitle("Mostrar Asistencias");}
        this.actualizarTablaLista();
        this.tablaLista.setDefaultRenderer(tablaLista.getColumnClass(1) ,mirender);
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
        jLabel1 = new javax.swing.JLabel();
        scrollPanelTablaLista = new javax.swing.JScrollPane();
        tablaLista = new javax.swing.JTable();
        etiquetaSeleccionarCurso = new javax.swing.JLabel();
        comboBoxCursos = new javax.swing.JComboBox<>();
        campoFecha = new com.toedter.calendar.JDateChooser();
        etiquetaSeleccionarFecha = new javax.swing.JLabel();
        botonBuscar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonNuevoRegistro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        panelFondo.setBackground(new java.awt.Color(240, 202, 171));
        panelFondo.setPreferredSize(new java.awt.Dimension(966, 626));
        panelFondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelFondoMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("Lista de asistencias");

        tablaLista.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        tablaLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaLista.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaLista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaListaMousePressed(evt);
            }
        });
        scrollPanelTablaLista.setViewportView(tablaLista);

        etiquetaSeleccionarCurso.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        etiquetaSeleccionarCurso.setText("Seleccionar curso: ");

        comboBoxCursos.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        comboBoxCursos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar curso" }));

        etiquetaSeleccionarFecha.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        etiquetaSeleccionarFecha.setText("Seleccionar fecha: ");

        botonBuscar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        botonSalir.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonSalir.setText("Cancelar");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        botonGuardar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonGuardar.setText("Guardar y salir");
        botonGuardar.setVisible(false);
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        botonModificar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonModificar.setText("Modificar");
        botonModificar.setEnabled(false);
        botonModificar.setVisible(false);
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        botonNuevoRegistro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonNuevoRegistro.setText("Nuevo registro");
        botonNuevoRegistro.setVisible(false);
        botonNuevoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addComponent(botonNuevoRegistro)
                        .addGap(31, 31, 31)
                        .addComponent(botonModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(botonSalir)
                        .addGap(31, 31, 31))
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(scrollPanelTablaLista, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelFondoLayout.createSequentialGroup()
                                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(etiquetaSeleccionarCurso)
                                    .addComponent(etiquetaSeleccionarFecha))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelFondoLayout.createSequentialGroup()
                                        .addComponent(campoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(botonBuscar))
                                    .addComponent(comboBoxCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(35, Short.MAX_VALUE))))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFondoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaSeleccionarCurso)
                            .addComponent(comboBoxCursos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(etiquetaSeleccionarFecha)
                            .addComponent(campoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(botonBuscar))
                .addGap(21, 21, 21)
                .addComponent(scrollPanelTablaLista, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonSalir)
                    .addComponent(botonGuardar)
                    .addComponent(botonModificar)
                    .addComponent(botonNuevoRegistro))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void configurarParaModificar()
    {
        this.setTitle("Menu modificar lista asistencias");
        this.botonSalir.setText("Cancelar");
        this.botonGuardar.setVisible(true);
        this.botonNuevoRegistro.setVisible(true);
        this.botonModificar.setVisible(true);
    }
    
    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
       if(comprobarCampos())
       {
            if(asistenciaCursosRepository.buscarListaAsistencias(extraerCurso(), convertirFechaToString())!=null)
            {
               listaContenido = (List<Document>) asistenciaCursosRepository.buscarListaAsistencias(extraerCurso(), convertirFechaToString()).get("listaAsistencia");
               actualizarTablaLista();
            }
            else
            {
                if(!botonNuevoRegistro.isVisible())
                {
                    JOptionPane.showMessageDialog(this, "No se encontro ningun registro en el curso,\n "
                    +"Nombre:"+extraerCurso().getString("nombre")+", Periodo:"+extraerCurso().getString("periodo")+", Dias:"+extraerCurso().getString("dias")+", Hora:"+extraerCurso().getString("hora")
                    +",\n en la fecha: "+convertirFechaToString()+"\n Compruebe si los datos son correctos!", "Mensaje Aviso", JOptionPane.INFORMATION_MESSAGE);
                }
                else
                {
                    listaContenido.clear();
                    actualizarTablaLista();
                }
            }
       }
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        if(asistenciaCursosRepository.buscarListaAsistencias(extraerCurso(), convertirFechaToString())!=null)
        {
           asistenciaCursosRepository.actualizarListaAsistencias(extraerCurso(), convertirFechaToString() , listaContenido);
        }
        else
        {
            Document listaAsistenciaNueva = new Document();
            listaAsistenciaNueva.append("curso", extraerCurso());
            listaAsistenciaNueva.append("fecha", convertirFechaToString());
            listaAsistenciaNueva.append("listaAsistencia", listaContenido);
            asistenciaCursosRepository.agregarDoumento(listaAsistenciaNueva);
        }
        dispose();
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
       DlgAlumnoLista modificarAlumno = new DlgAlumnoLista(null, rootPaneCheckingEnabled, listaContenido.get(tablaLista.getSelectedRow()),ConstantesGUI.MODIFICAR);
       actualizarTablaLista();
       botonModificar.setEnabled(false);
       
    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonNuevoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoRegistroActionPerformed
        if(comprobarCampos())
        {
            Document estudianteNuevo = new Document();
            DlgAlumnoLista agregarAlumno = new DlgAlumnoLista(null, rootPaneCheckingEnabled, estudianteNuevo, ConstantesGUI.AGREGAR);
            if(!estudianteNuevo.isEmpty())
            {
                listaContenido.add(estudianteNuevo);
                actualizarTablaLista();
            }
        }
    }//GEN-LAST:event_botonNuevoRegistroActionPerformed

    private void tablaListaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaListaMousePressed
       if(tablaLista.getSelectedRow() != -1)
       {
           botonModificar.setEnabled(true);
       }
    }//GEN-LAST:event_tablaListaMousePressed

    private void panelFondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFondoMousePressed
       if(tablaLista.getSelectedRow() != -1)
       {
           botonModificar.setEnabled(false);
           tablaLista.clearSelection();
       }
    }//GEN-LAST:event_panelFondoMousePressed

   
    private Object[][] convertirListaAsistenciasAObjetos()
    {
        if(!listaContenido.isEmpty())
        {
            Object[][] listaAsistenciaObjetos = new Object[listaContenido.size()][5];
            for(int cont=0 ;cont<listaContenido.size();cont++)
            {
                listaAsistenciaObjetos[cont][0] = String.valueOf((cont+1));
                listaAsistenciaObjetos[cont][1] = listaContenido.get(cont).get("nombre");
                listaAsistenciaObjetos[cont][2] = listaContenido.get(cont).get("estadoAsistencia");
                listaAsistenciaObjetos[cont][3] = listaContenido.get(cont).get("horaEntrada");
                listaAsistenciaObjetos[cont][4] = listaContenido.get(cont).get("minutosTotales");
            }
            return listaAsistenciaObjetos;
        }
        else{return new Object[0][0];}
    }
    
    private Document extraerCurso()
    {
        String[] curso;
        Document documentoCurso = new Document();
        curso = comboBoxCursos.getSelectedItem().toString().split(",");
        documentoCurso.append("nombre", curso[0].substring(curso[0].indexOf(":")+2, curso[0].length()));
        documentoCurso.append("periodo", curso[1].substring(curso[1].indexOf(":")+2, curso[1].length()));
        documentoCurso.append("dias", curso[2].substring(curso[2].indexOf(":")+2, curso[2].length()));
        documentoCurso.append("hora", curso[3].substring(curso[3].indexOf(":")+2, curso[3].length()));
        return documentoCurso;
    }
    
    private String convertirFechaToString()
    {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        return formatoFecha.format(campoFecha.getDate());
    }
    
    private boolean comprobarCampos()
    {
        if(comboBoxCursos.getSelectedItem().equals("Seleccionar curso"))
        {
            JOptionPane.showMessageDialog(this, "Error! \n No se ha seleccionado ningun curso", "Mensaje Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        else if(campoFecha.getCalendar()==null)
        {
            JOptionPane.showMessageDialog(this, "Error! \n No se ha ingresado ninguna fecha", "Mensaje Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    private void llenarComboBoxCursos()
    {
       List<Document> listaCursos = cursosRepo.buscarRegistrosEnLaColeccion();
       for(int cont=0 ;cont < listaCursos.size() ;cont++)
       {
           comboBoxCursos.addItem("Nombre: "+listaCursos.get(cont).getString("nombre")+
                                ", Periodo: "+listaCursos.get(cont).getString("periodo")+
                                ", Dias: "+listaCursos.get(cont).getString("dias")+
                                ", Hora: "+listaCursos.get(cont).getString("hora"));
       }
    }
    
    
    private void actualizarTablaLista()
    {
       tablaLista.setModel(new javax.swing.table.DefaultTableModel(
            convertirListaAsistenciasAObjetos(),
            new String [] {
                "Num.","Nombre Completo", "Estado asistencia", "Hora entrada", "Minutos totales"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class,java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
                
            @Override
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
            
            boolean[] canEdit = new boolean [] {false, false, false, false, false};

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        }); 
            tablaLista.getColumnModel().getColumn(0).setResizable(false);
            tablaLista.getColumnModel().getColumn(1).setResizable(false);
            tablaLista.getColumnModel().getColumn(2).setResizable(false);
            tablaLista.getColumnModel().getColumn(3).setResizable(false);
            tablaLista.getColumnModel().getColumn(4).setResizable(false);
            tablaLista.getColumnModel().getColumn(0).setPreferredWidth(1);
            tablaLista.getColumnModel().getColumn(1).setPreferredWidth(300);
            
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonNuevoRegistro;
    private javax.swing.JButton botonSalir;
    private com.toedter.calendar.JDateChooser campoFecha;
    private javax.swing.JComboBox<String> comboBoxCursos;
    private javax.swing.JLabel etiquetaSeleccionarCurso;
    private javax.swing.JLabel etiquetaSeleccionarFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JScrollPane scrollPanelTablaLista;
    private javax.swing.JTable tablaLista;
    // End of variables declaration//GEN-END:variables
}
