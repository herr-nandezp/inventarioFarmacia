/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemainventariofarmacia.inventario.dto.inventario.inventarioFarmacia;

import javax.swing.table.DefaultTableModel;
import sistemainventariofarmacia.inventario.dto.ProductoDTO;

/**
 *
 * @author a12
 */
public class inventarioFarmacia {
    private ProductoDTO[] productos;
    private int contadorProductos = 0;
    
    public inventarioFarmacia() {
        productos = new ProductoDTO[100];
        
        productos[0] = new ProductoDTO("Acetaminofen", "0001", 1.00,100);
         contadorProductos ++;
        productos[1] = new ProductoDTO("Desloratadina", "0002", 1.00,50);
         contadorProductos ++;
        productos[2] = new ProductoDTO("Azitromicina", "0003", 13,15);
         contadorProductos ++;
        productos[3] = new ProductoDTO("Ibuprofeno", "0004", 1.50,85);
         contadorProductos ++;
        productos[4] = new ProductoDTO("Amoxicilina", "0005", 5.25,40);
         contadorProductos ++;
               
    }

    public void setProductos(ProductoDTO[] productos) {
        this.productos = productos;
    }

    public void setContadorProductos(int contadorProductos) {
        this.contadorProductos = contadorProductos;
    }

    public ProductoDTO[] getProductos() {
        return productos;
    }

    public int getContadorProductos() {
        return contadorProductos;
    }
    
}

