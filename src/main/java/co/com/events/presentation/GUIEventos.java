package co.com.events.presentation;

import co.com.events.domain.entities.Evento;
import co.com.events.service.CategoryService;
import co.com.events.service.EventService;

import javax.swing.JOptionPane;

/**
 *
 * @author Libardo Pantoja, Julio A. Hurtado
 */
public class GUIEventos extends javax.swing.JFrame {

    private EventService eventService;
    private CategoryService categoryService;

    private boolean addOption;

    /**
     * Creates new form GUIProducts
     */
    public GUIEventos(EventService eventService, CategoryService categoryService) {
        initComponents();
        this.eventService = eventService;
        this.categoryService = categoryService;
        stateInitial();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSouth = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnCategorias = new javax.swing.JButton();
        pnlCenter = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAforo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Productos");

        pnlSouth.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        pnlSouth.add(btnNuevo);

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        pnlSouth.add(btnEditar);

        btnSave.setText("Grabar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        pnlSouth.add(btnSave);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        pnlSouth.add(btnCancelar);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        pnlSouth.add(btnEliminar);

        btnFind.setText("Buscar");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        pnlSouth.add(btnFind);

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        pnlSouth.add(btnCerrar);

        btnCategorias.setText("Categorias");
        btnCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriasActionPerformed(evt);
            }
        });
        pnlSouth.add(btnCategorias);

        getContentPane().add(pnlSouth, java.awt.BorderLayout.SOUTH);

        pnlCenter.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("*Id:");

        txtId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdFocusLost(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("*Nombre:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Descripción:");

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        jScrollPane1.setViewportView(txtDescription);

        jLabel4.setText("Categoria");

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });

        jLabel5.setText("Precio Ticket");

        jLabel6.setText("Aforo");

        javax.swing.GroupLayout pnlCenterLayout = new javax.swing.GroupLayout(pnlCenter);
        pnlCenter.setLayout(pnlCenterLayout);
        pnlCenterLayout.setHorizontalGroup(
            pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCenterLayout.createSequentialGroup()
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlCenterLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlCenterLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlCenterLayout.createSequentialGroup()
                                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPrecio)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlCenterLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlCenterLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAforo)
                            .addComponent(txtCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE))))
                .addGap(17, 17, 17))
        );
        pnlCenterLayout.setVerticalGroup(
            pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCenterLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAforo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(pnlCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        getContentPane().add(pnlCenter, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
         stateNew();
        txtName.requestFocus();
        addOption = true;
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        stateInitial();
        cleanControls();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (txtName.getText().trim().equals("")) {
            Messages.showMessageDialog("Debe ingresar el nombre del producto", "Atención");
            txtName.requestFocus();
            return;
        }
        if (addOption) {
            //Agregar
            addProduct();

        } else {
            //Editar
            editProduct();
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        addOption = false;
        stateEdit();
        txtId.requestFocus();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdFocusLost
      if (txtId.getText().trim().equals("")) {
        return;
    }
    
    Long productId = null;
    try {
        productId = Long.parseLong(txtId.getText().trim());
    } catch (NumberFormatException e) {
        Messages.showMessageDialog("El ID del producto debe ser un número válido.", "Error");
        txtId.setText("");
        txtId.requestFocus();
        return;
    }
    
    Evento evento= eventService.findProductById(productId);
    
    if (evento== null) {
        Messages.showMessageDialog("El identificador del producto no existe", "Error");
        txtId.setText("");
        txtId.requestFocus();
    } else {
        txtName.setText(evento.getEventName());
        txtDescription.setText(evento.getEventDescrip());
        
        // Mostrar el ID de la categoría como texto en el JTextField
        Long categoryId = evento.getCategoryId()!= null ? evento.getCategoryId() : null;
        txtCategoria.setText(categoryId != null ? categoryId.toString() : "");
    }
    }//GEN-LAST:event_txtIdFocusLost

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String id = txtId.getText().trim();
        if (id.equals("")) {
            Messages.showMessageDialog("Debe buscar el producto a eliminar", "Atención");
            txtId.requestFocus();
            return;
        }
        Long productId = Long.parseLong(id);
        if (Messages.showConfirmDialog("Está seguro que desea eliminar este producto?", "Confirmación") == JOptionPane.YES_NO_OPTION) {
            if (eventService.deleteProduct(productId)) {
                Messages.showMessageDialog("Producto eliminado con éxito", "Atención");
                stateInitial();
                cleanControls();
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        GUIProductsFind instance = new GUIProductsFind(this, true, eventService);
        instance.setVisible(true);
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriasActionPerformed
        // TODO add your handling code here:
        //CategoryService categoryService = new CategoryService(); // O una instancia ya creada
    GUICategories guiCategories = new GUICategories( categoryService); // Pasar el servicio
    guiCategories.setVisible(true); // Mostrar la ventana de categorías


    }//GEN-LAST:event_btnCategoriasActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed
     private void stateEdit() {
        btnNuevo.setVisible(false);
        btnEditar.setVisible(false);
        btnEliminar.setVisible(true);
        btnCancelar.setVisible(true);
        btnCerrar.setVisible(false);
        btnSave.setVisible(true);
        btnFind.setVisible(false);
        txtId.setEnabled(true);
        txtName.setEnabled(true);
        txtDescription.setEnabled(true);
        txtAforo.setEnabled(true);
        txtPrecio.setEnabled(true);
    }

       private void stateInitial() {
        btnNuevo.setVisible(true);
        btnEditar.setVisible(true);
        btnEliminar.setVisible(false);
        btnCancelar.setVisible(false);
        btnCerrar.setVisible(true);
        btnSave.setVisible(false);
        btnFind.setVisible(true);
        txtId.setEnabled(false);
        txtName.setEnabled(false);
        txtDescription.setEnabled(false);
        txtCategoria.setEnabled(false);
        txtAforo.setEnabled(false);
        txtPrecio.setEnabled(false);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCategorias;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlSouth;
    private javax.swing.JTextField txtAforo;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables

    private void stateNew() {
        btnNuevo.setVisible(false);
        btnEditar.setVisible(false);
        btnEliminar.setVisible(false);
        btnCancelar.setVisible(true);
        btnCerrar.setVisible(false);
        btnSave.setVisible(true);
        btnFind.setVisible(false);
        txtId.setEnabled(false);
        txtName.setEnabled(true);
        txtDescription.setEnabled(true);
        txtCategoria.setEnabled(true);
        txtAforo.setEnabled(true);
        txtPrecio.setEnabled(true);

    }

      private void cleanControls() {
        txtId.setText("");
        txtName.setText("");
        txtDescription.setText("");
        txtCategoria.setText("");
        txtAforo.setText("");
        txtPrecio.setText("");

    }
private void addProduct() {
    String name = txtName.getText().trim();
    String description = txtDescription.getText().trim();
    double precio = Double.parseDouble(txtPrecio.getText().trim());
    int aforo = Integer.parseInt(this.txtAforo.getText().trim());
       

    Long categoryId = null; // Inicialmente nulo
    String categoryText = txtCategoria.getText().trim();
    if (!categoryText.isEmpty()) {
        try {
            categoryId = Long.parseLong(categoryText);
        } catch (NumberFormatException e) {
            // Mostrar mensaje de error si el texto no es un número válido
            Messages.showMessageDialog("El ID de la categoría debe ser un número válido.", "Error");
            return;
        }
    }

    // Llamar al servicio para guardar el producto
    if (eventService.saveEvent(name, description, categoryId, precio, aforo)) {
        Messages.showMessageDialog("Producto guardado con éxito", "Éxito");
        cleanControls();
        stateInitial();
    } else {
        Messages.showMessageDialog("Error al guardar el productoo", "Error");
    }
}




private void editProduct() {
    Long productId = Long.parseLong(txtId.getText().trim());
    String name = txtName.getText().trim();
    String description = txtDescription.getText().trim();
    Double precio = Double.parseDouble(this.txtPrecio.getText().trim());
    int aforo = Integer.parseInt(this.txtAforo.getText().trim());
    // Manejar el caso en que el campo de categoría esté vacío
    Long categoryId = null;
    String categoryText = txtCategoria.getText().trim();
    if (!categoryText.isEmpty()) {
        try {
            categoryId = Long.parseLong(categoryText);
        } catch (NumberFormatException e) {
            // Manejo de error si el campo no es un número válido
            Messages.showMessageDialog("El ID de la categoría debe ser un número válido.", "Error");
            return;
        }
    }

    Evento evento = new Evento();
    evento.setEventName(name);
    evento.setEventDescrip(description);
    evento.setCategoryId(categoryId);
    evento.setAforo(aforo);
    evento.setEventPrice(precio);

    if (eventService.editEvent(productId, evento)) {
        Messages.showMessageDialog("Producto actualizado con éxito", "Éxito");
        cleanControls();
        stateInitial();
    } else {
        Messages.showMessageDialog("Error al actualizar el producto", "Error");
    }
}

}
