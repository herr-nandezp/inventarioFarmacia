/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemainventariofarmacia;

import sistemainventariofarmacia.inventario.dto.inventario.inventarioFarmacia.inventarioFarmacia;

/**
 *
 * @author a12
 */
public class sistemaInventarioFarmacia {

    public static void main(String[] args) {
        
        inventario();
        
    }
    
    public static void inventario(){
        VentanaPrincipal ventanaP = new VentanaPrincipal();
        ventanaP.setVisible(true);
        
    }
    
}
