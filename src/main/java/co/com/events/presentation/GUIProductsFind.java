/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.events.presentation;

import co.com.events.domain.entities.Evento;
import co.com.events.service.EventService;

import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Libardo Pantoja, Julio A. Hurtado
 */
public class GUIProductsFind extends javax.swing.JDialog {
    private EventService eventoService;
    /**
     * Creates new form GUIProductsFind
     */
    public GUIProductsFind(java.awt.Frame parent, boolean modal,EventService eventoService) {
        super(parent, modal);
        initComponents();
        initializeTable();
        this.eventoService = eventoService;
        setLocationRelativeTo(null); //centrar al ventana
    }
    
    private void initializeTable() {
        tblProducts.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Id", "Name", "Description"," IdCategory","Precio","Aforo"
                }
        ));
    }
    
        private void fillTable(List<Evento> listEvent) {
        initializeTable();
        DefaultTableModel model = (DefaultTableModel) tblProducts.getModel();

        Object rowData[] = new Object[6];//No columnas
        for (int i = 0; i < listEvent.size(); i++) {
            rowData[0] = listEvent.get(i).getEventId();
            rowData[1] = listEvent.get(i).getEventName();
            rowData[2] = listEvent.get(i).getEventDescrip();
            rowData[3] = listEvent.get(i).getCategoryId();
            rowData[4] = listEvent.get(i).getEventPrice();
            rowData[5] = listEvent.get(i).getAforo();
            model.addRow(rowData);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlCenter = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        pnlNorth = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        rdoId = new javax.swing.JRadioButton();
        rdoName = new javax.swing.JRadioButton();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnSearchAll = new javax.swing.JButton();
        rdoCategoria = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Búsqueda de productos");

        pnlCenter.setLayout(new java.awt.BorderLayout());

        tblProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblProducts);

        pnlCenter.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlCenter, java.awt.BorderLayout.CENTER);

        jLabel1.setText("Buscar por:");

        buttonGroup1.add(rdoId);
        rdoId.setSelected(true);
        rdoId.setText("Id");
        rdoId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoIdActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoName);
        rdoName.setText("Nombre del producto");
        rdoName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNameActionPerformed(evt);
            }
        });

        txtSearch.setPreferredSize(new java.awt.Dimension(62, 32));

        btnSearch.setText("Buscar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnSearchAll.setText("Buscar Todos");
        btnSearchAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchAllActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoCategoria);
        rdoCategoria.setText("Categoria");
        rdoCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlNorthLayout = new javax.swing.GroupLayout(pnlNorth);
        pnlNorth.setLayout(pnlNorthLayout);
        pnlNorthLayout.setHorizontalGroup(
            pnlNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNorthLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(rdoId)
                .addGap(18, 18, 18)
                .addComponent(rdoName)
                .addGap(3, 3, 3)
                .addComponent(rdoCategoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnSearch)
                .addGap(5, 5, 5)
                .addComponent(btnSearchAll))
        );
        pnlNorthLayout.setVerticalGroup(
            pnlNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNorthLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pnlNorthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoId)
                    .addComponent(jLabel1)
                    .addComponent(rdoName)
                    .addComponent(rdoCategoria)))
            .addGroup(pnlNorthLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnlNorthLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(btnSearch))
            .addGroup(pnlNorthLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(btnSearchAll))
        );

        getContentPane().add(pnlNorth, java.awt.BorderLayout.PAGE_START);

        btnClose.setText("Cerrar");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jPanel1.add(btnClose);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnSearchAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchAllActionPerformed
        fillTable(eventoService.findAllProducts());
    }//GEN-LAST:event_btnSearchAllActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:

       // Obtenemos el texto de búsqueda y eliminamos espacios en blanco
    String searchText = txtSearch.getText().trim();
    
    // Verificamos si se ha seleccionado la opción de búsqueda por ID
    if (rdoId.isSelected()) {
        try {
            // Intentamos convertir el texto de búsqueda a un número Long (ID)
            Long id = Long.parseLong(searchText);
            // Buscamos el producto por ID usando el servicio de productos
            Evento evento = eventoService.findProductById(id);
            if (evento != null) {
                // Si encontramos el eventoo, lo pasamos a la tabla
                fillTable(List.of(evento)); // Pasamos una lista que contiene un solo producto
            } else {
                // Si no encontramos ningún producto, pasamos una lista vacía
                Messages.showMessageDialog("No hay productos con ese ID", "Atención");
                fillTable(List.of());
            }
        } catch (NumberFormatException e) {
            // Si el texto de búsqueda no es un número válido, mostramos una lista vacía
            fillTable(List.of());
        }
    } 
    // Verificamos si se ha seleccionado la opción de búsqueda por nombre
    else if (rdoName.isSelected()) {
        // Buscamos productos por nombre usando el servicio de productos
        Evento evento = eventoService.findProductByName(searchText);
        if (evento!=null) {
            // Si encontramos eventoos, los pasamos a la tabla
                fillTable(List.of(evento)); // Pasamos una lista que contiene un solo eventoo
        } else {
            Messages.showMessageDialog("No hay eventoos con ese nombre", "Atención");
                fillTable(List.of(evento)); // Pasamos una lista que contiene un solo eventoo
        }
    }
    // Verificamos si se ha seleccionado la opción de búsqueda por ID de categoría
    else if (rdoCategoria.isSelected()) {
        try {
            // Intentamos convertir el texto de búsqueda a un número Long (ID de categoría)
            Long categoryId = Long.parseLong(searchText);
            // Buscamos eventoos por ID de categoría usando el servicio de eventoos
            List<Evento> eventos = this.eventoService.findEventByCategoryId(categoryId);
            if (!eventos.isEmpty()) {
                // Si encontramos eventoos, los pasamos a la tabla
                fillTable(eventos); // Pasamos la lista de eventoos
            } else {
                Messages.showMessageDialog("No hay eventoos con esa categoría", "Atención");
                fillTable(List.of());
            }
        } catch (NumberFormatException e) {
            // Si el texto de búsqueda no es un número válido, mostramos una lista vacía
            Messages.showMessageDialog("El ID de categoría debe ser un número válido.", "Error");
            fillTable(List.of());
        }
    }
    txtSearch.setText("");
       
    }//GEN-LAST:event_btnSearchActionPerformed
    
    private void rdoNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoNameActionPerformed

    private void rdoCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoCategoriaActionPerformed

    private void rdoIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoIdActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearchAll;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlNorth;
    private javax.swing.JRadioButton rdoCategoria;
    private javax.swing.JRadioButton rdoId;
    private javax.swing.JRadioButton rdoName;
    private javax.swing.JTable tblProducts;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}