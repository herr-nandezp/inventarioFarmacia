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

