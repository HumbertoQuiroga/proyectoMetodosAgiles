/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazUsuario;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumnModel;
import org.bson.Document;
import repository.AsistenciaCursosRepository;
import repository.CursosRepository;
import repository.UnidadesRepository;

/**
 *
 * @author Alfredo Perez
 */
public class DlgMostrarUnidades extends javax.swing.JDialog 
{

    private UnidadesRepository unidadesRepository;
    private CursosRepository cursosRepo;
    private AsistenciaCursosRepository asistenciaCursosRepository;
    private List<Document> listaUnidades;
    
    
    /**
     * Creates new form DlgMostrarUnidades
     * @param parent
     * @param modal
     * @param cursosRepo
     * @param unidadesRepository
     * @param asistenciaCursosRepository
     * @param accion
     */
    public DlgMostrarUnidades(java.awt.Frame parent, boolean modal, CursosRepository cursosRepo, UnidadesRepository unidadesRepository,AsistenciaCursosRepository asistenciaCursosRepository, int accion)
    {
        super(parent, modal);
        this.initComponents();
        this.listaUnidades = new ArrayList<>();
        this.cursosRepo = cursosRepo;
        this.unidadesRepository = unidadesRepository;
        this.asistenciaCursosRepository = asistenciaCursosRepository;
        this.llenarComboBoxCursos();
        this.actualizarTablaUnidades();
        if(accion == ConstantesGUI.MODIFICAR){configurarParaModificar();}
        else{this.setTitle("Mostrar Unidades");}
        this.setVisible(true);
    }
    
    
    private void configurarParaModificar()
    {
        this.setTitle("Modificar Unidades");
        this.panelBotonModificar.setVisible(true);
        this.botonModificarUnidad.setVisible(true);
        this.panelBotonEliminar.setVisible(true);
        this.botonEliminar.setVisible(true);
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
        ScrollPanelTabla = new javax.swing.JScrollPane();
        tablaUnidades = new javax.swing.JTable();
        comboSeleccionarCurso = new javax.swing.JComboBox<>();
        etiquetaSeleccionarCurso = new javax.swing.JLabel();
        panelBotonSalir = new javax.swing.JPanel();
        botonSalir = new javax.swing.JButton();
        panelBotonEliminar = new javax.swing.JPanel();
        botonEliminar = new javax.swing.JButton();
        panelBotonModificar = new javax.swing.JPanel();
        botonModificarUnidad = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(808, 580));
        setResizable(false);

        panelFondo.setBackground(new java.awt.Color(240, 202, 171));
        panelFondo.setPreferredSize(new java.awt.Dimension(800, 580));
        panelFondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelFondoMousePressed(evt);
            }
        });

        etiquetaTitulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        etiquetaTitulo.setText("Lista de unidades registradas");

        tablaUnidades.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        tablaUnidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaUnidades.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tablaUnidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaUnidadesMousePressed(evt);
            }
        });
        ScrollPanelTabla.setViewportView(tablaUnidades);

        comboSeleccionarCurso.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboSeleccionarCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione un curso" }));
        comboSeleccionarCurso.setPreferredSize(new java.awt.Dimension(290, 29));
        comboSeleccionarCurso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                comboSeleccionarCursoMousePressed(evt);
            }
        });
        comboSeleccionarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboSeleccionarCursoActionPerformed(evt);
            }
        });

        etiquetaSeleccionarCurso.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        etiquetaSeleccionarCurso.setText("Seleccionar curso: ");

        panelBotonSalir.setBackground(new java.awt.Color(0, 0, 0));
        panelBotonSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelBotonSalir.setPreferredSize(new java.awt.Dimension(90, 30));

        botonSalir.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(255, 255, 255));
        botonSalir.setText("Salir");
        botonSalir.setContentAreaFilled(false);
        botonSalir.setPreferredSize(new java.awt.Dimension(90, 30));
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonSalirLayout = new javax.swing.GroupLayout(panelBotonSalir);
        panelBotonSalir.setLayout(panelBotonSalirLayout);
        panelBotonSalirLayout.setHorizontalGroup(
            panelBotonSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonSalirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelBotonSalirLayout.setVerticalGroup(
            panelBotonSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonSalirLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelBotonEliminar.setBackground(new java.awt.Color(102, 102, 102));
        panelBotonEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelBotonEliminar.setEnabled(false);
        panelBotonEliminar.setPreferredSize(new java.awt.Dimension(90, 30));
        panelBotonEliminar.setVisible(false);

        botonEliminar.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        botonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        botonEliminar.setText("Eliminar");
        botonEliminar.setContentAreaFilled(false);
        botonEliminar.setEnabled(false);
        botonEliminar.setPreferredSize(new java.awt.Dimension(90, 30));
        botonEliminar.setVisible(false);
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonEliminarLayout = new javax.swing.GroupLayout(panelBotonEliminar);
        panelBotonEliminar.setLayout(panelBotonEliminarLayout);
        panelBotonEliminarLayout.setHorizontalGroup(
            panelBotonEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonEliminarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelBotonEliminarLayout.setVerticalGroup(
            panelBotonEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonEliminarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panelBotonModificar.setBackground(new java.awt.Color(102, 102, 102));
        panelBotonModificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelBotonModificar.setPreferredSize(new java.awt.Dimension(90, 30));
        panelBotonModificar.setVisible(false);

        botonModificarUnidad.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        botonModificarUnidad.setForeground(new java.awt.Color(255, 255, 255));
        botonModificarUnidad.setText("Modificar");
        botonModificarUnidad.setContentAreaFilled(false);
        botonModificarUnidad.setEnabled(false);
        botonModificarUnidad.setPreferredSize(new java.awt.Dimension(90, 30));
        botonModificarUnidad.setVisible(false);
        botonModificarUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarUnidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonModificarLayout = new javax.swing.GroupLayout(panelBotonModificar);
        panelBotonModificar.setLayout(panelBotonModificarLayout);
        panelBotonModificarLayout.setHorizontalGroup(
            panelBotonModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonModificarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonModificarUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelBotonModificarLayout.setVerticalGroup(
            panelBotonModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBotonModificarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(botonModificarUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout panelFondoLayout = new javax.swing.GroupLayout(panelFondo);
        panelFondo.setLayout(panelFondoLayout);
        panelFondoLayout.setHorizontalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelFondoLayout.createSequentialGroup()
                        .addComponent(panelBotonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(panelBotonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelBotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ScrollPanelTabla, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFondoLayout.createSequentialGroup()
                        .addComponent(etiquetaSeleccionarCurso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboSeleccionarCurso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFondoLayout.createSequentialGroup()
                        .addComponent(etiquetaTitulo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(25, 25, 25))
        );
        panelFondoLayout.setVerticalGroup(
            panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(etiquetaTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaSeleccionarCurso)
                    .addComponent(comboSeleccionarCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(ScrollPanelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                .addGap(29, 29, 29)
                .addGroup(panelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelBotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelBotonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelBotonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void actualizarLista()
    {
        List<Document> listaUnidadesAux = unidadesRepository.buscarUnidades(extraerCurso());
           if(listaUnidadesAux != null)
           {
               listaUnidades = listaUnidadesAux;
               ordenarListaUnidades();
               actualizarTablaUnidades();
           }
           else
           {
               listaUnidades.clear();
               actualizarTablaUnidades();
               JOptionPane.showMessageDialog(null, "Error \n No se encontro ninguna unidad registrada para este curso!", "Mensaje Error", JOptionPane.ERROR_MESSAGE);
           }
    }
    
    private void comboSeleccionarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboSeleccionarCursoActionPerformed
       if(comboSeleccionarCurso.getSelectedIndex()!=0)
       {
           actualizarLista();
       }
       else
       {
          listaUnidades.clear();
          actualizarTablaUnidades();
       }
    }//GEN-LAST:event_comboSeleccionarCursoActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_botonSalirActionPerformed

    private void tablaUnidadesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaUnidadesMousePressed
       if(tablaUnidades.getSelectedRow() != -1)
       {
           panelBotonModificar.setBackground(new Color(51,255,51));
           botonModificarUnidad.setEnabled(true);
           panelBotonEliminar.setBackground(new Color(255,0,0));
           botonEliminar.setEnabled(true);
       }
    }//GEN-LAST:event_tablaUnidadesMousePressed

    private void panelFondoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelFondoMousePressed
           panelBotonModificar.setBackground(new Color(102,102,102));
           botonModificarUnidad.setEnabled(false);
           panelBotonEliminar.setBackground(new Color(102,102,102));
           botonEliminar.setEnabled(false);
           tablaUnidades.clearSelection();
    }//GEN-LAST:event_panelFondoMousePressed

    private void botonModificarUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarUnidadActionPerformed
       DlgAgregarUnidad modificarUnidad = new DlgAgregarUnidad(null, rootPaneCheckingEnabled, cursosRepo, unidadesRepository, asistenciaCursosRepository ,listaUnidades.get(tablaUnidades.getSelectedRow()));
       actualizarLista();
       panelBotonModificar.setBackground(new Color(102,102,102));
       botonModificarUnidad.setEnabled(false);
       panelBotonEliminar.setBackground(new Color(102,102,102));
       botonEliminar.setEnabled(false);
    }//GEN-LAST:event_botonModificarUnidadActionPerformed

    private void comboSeleccionarCursoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboSeleccionarCursoMousePressed
           panelBotonModificar.setBackground(new Color(102,102,102));
           botonModificarUnidad.setEnabled(false);
           botonEliminar.setEnabled(false);
           panelBotonEliminar.setBackground(new Color(102,102,102));
           tablaUnidades.clearSelection();
        
    }//GEN-LAST:event_comboSeleccionarCursoMousePressed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
       Document unidad = listaUnidades.get(tablaUnidades.getSelectedRow());
       int respuesta = JOptionPane.showConfirmDialog(this, "Si elimina la unidad de competencia con el "+"Indice: "+unidad.getString("indice")+", Nombre: "+unidad.getString("nombre")+", Descripcion: "+unidad.getString("descripcion")+
       "\n ademas de la unidad se eliminaran las asistencias registradas de la unidad seleccionada \n ¿Esta seguro de eliminar la unidad de competencia?", "Mensaje Confirmacion", JOptionPane.YES_NO_OPTION);
       if(respuesta == 0)
       {
           unidadesRepository.eliminarUnidad(unidad);
           asistenciaCursosRepository.eliminarAsistenciasEnLaUnidad(unidad);
           actualizarLista();
           JOptionPane.showMessageDialog(this, "La unidad de competencia se elimino correctamente", "Mensaje Aviso", JOptionPane.INFORMATION_MESSAGE);
       }
       botonModificarUnidad.setEnabled(false);
       botonEliminar.setEnabled(false);
    }//GEN-LAST:event_botonEliminarActionPerformed

    private Document extraerCurso()
    {
        String[] curso;
        Document documentoCurso = new Document();
        curso = comboSeleccionarCurso.getSelectedItem().toString().split(",");
        documentoCurso.append("nombre", curso[0].substring(curso[0].indexOf(":")+2, curso[0].length()));
        documentoCurso.append("periodo", curso[1].substring(curso[1].indexOf(":")+2, curso[1].length()));
        documentoCurso.append("dias", curso[2].substring(curso[2].indexOf(":")+2, curso[2].length()));
        documentoCurso.append("hora", curso[3].substring(curso[3].indexOf(":")+2, curso[3].length()));
        return documentoCurso;
    }
    
    private void llenarComboBoxCursos()
    {
       List<Document> listaCursos = cursosRepo.buscarRegistrosEnLaColeccion();
       for(int cont=0 ;cont < listaCursos.size() ;cont++)
       {
           comboSeleccionarCurso.addItem("Nombre: "+listaCursos.get(cont).getString("nombre")+
                                       ", Periodo: "+listaCursos.get(cont).getString("periodo")+
                                       ", Dias: "+listaCursos.get(cont).getString("dias")+
                                       ", Hora: "+listaCursos.get(cont).getString("hora"));
       }
    }
    
    private void actualizarTablaUnidades()
    {
        tablaUnidades.setModel(new javax.swing.table.DefaultTableModel(
                setObjetosTablaUnidades(listaUnidades),
            new String [] {"Indice", "Nombre Unidad", "Descripcion"}
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
                
            @Override
            public Class getColumnClass(int columnIndex) {return types [columnIndex];}
            
            boolean[] canEdit = new boolean [] {false, false, false};

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {return canEdit [columnIndex];}
        }); 
       
        if (tablaUnidades.getColumnModel().getColumnCount() < 8) 
        {
            TableColumnModel columnModel = tablaUnidades.getColumnModel();
            tablaUnidades.getColumnModel().getColumn(0).setResizable(false);
            tablaUnidades.getColumnModel().getColumn(1).setResizable(false);
            tablaUnidades.getColumnModel().getColumn(2).setResizable(false);
            columnModel.getColumn(0).setPreferredWidth(10);
            columnModel.getColumn(1).setPreferredWidth(250);
            columnModel.getColumn(2).setPreferredWidth(350);
            tablaUnidades.setColumnModel(columnModel);
        }
        
    }
    
    
    private void ordenarListaUnidades()
    {
      if(listaUnidades != null)
      {
        Document aux;
        for(int cont = 0 ; cont < listaUnidades.size()-1 ;cont++)
        {
            for(int cont2 =0; cont2 < listaUnidades.size()-1; cont2++)
            {
               if(Integer.valueOf(listaUnidades.get(cont2).getString("indice")) > Integer.valueOf(listaUnidades.get(cont2+1).getString("indice")))
               {
                   aux = listaUnidades.get(cont2);
                   listaUnidades.set(cont2, listaUnidades.get(cont2+1));
                   listaUnidades.set(cont2+1,aux);
               }
            }
        }
      }
    }
    
    
    private Object[][] setObjetosTablaUnidades(List<Document> unidades)
    {
      if(unidades != null)
      {
        Object[][] unidadesTabla = new Object[unidades.size()][3];
        for(int cont=0; cont < unidades.size() ;cont++)
        {
           unidadesTabla[cont][0] = unidades.get(cont).getString("indice");
           unidadesTabla[cont][1] = unidades.get(cont).getString("nombre");
           unidadesTabla[cont][2] = unidades.get(cont).getString("descripcion");
        }
        return unidadesTabla;
      }
      else
      {
          return new Object[0][0];
      }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPanelTabla;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonModificarUnidad;
    private javax.swing.JButton botonSalir;
    private javax.swing.JComboBox<String> comboSeleccionarCurso;
    private javax.swing.JLabel etiquetaSeleccionarCurso;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JPanel panelBotonEliminar;
    private javax.swing.JPanel panelBotonModificar;
    private javax.swing.JPanel panelBotonSalir;
    private javax.swing.JPanel panelFondo;
    private javax.swing.JTable tablaUnidades;
    // End of variables declaration//GEN-END:variables
}
