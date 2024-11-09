
package co.com.events.presentation;

import co.com.events.domain.access.CategoryRepository;
import co.com.events.domain.access.EventoRepository;
import co.com.events.service.CategoryService;
import co.com.events.service.EventService;

/**
 *
 * @author Felipe Armero C
 */
public class Main {
    public static void main(String[] args) {
     // Crear instancias de los repositorios
    EventoRepository productRepository = new EventoRepository(); // O la implementación concreta que uses
    CategoryRepository categoryRepository = new CategoryRepository(); // O la implementación concreta que uses

    // Crear instancia del servicio con los repositorios
    EventService productService = new EventService(productRepository);
    CategoryService categoryService = new CategoryService(categoryRepository);

    // Crear la interfaz gráfica con el servicio
    GUIEventos guiProducts = new GUIEventos(productService,categoryService); // Instancia de GUIProducts
    GUICategories guiCategories = new GUICategories(categoryService); // Instancia de GUICategories

    // Hacer visible la interfaz gráfica de productos
    guiProducts.setVisible(true);
    //guiCategories.setVisible(true);
}}
