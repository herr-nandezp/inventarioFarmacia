/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemainventariofarmacia.inventario.dto;

/**
 *
 * @author a12
 */
public class ProductoDTO {
    private String nombre;
    private String codigoBarras;
    private double precioUnitario;
    private int cantidadStock;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public ProductoDTO(String nombre, String codigoBarras, double precioUnitario, int cantidadStock) {
        this.nombre = nombre;
        this.codigoBarras = codigoBarras;
        this.precioUnitario = precioUnitario;
        this.cantidadStock = cantidadStock;
    }

    public ProductoDTO() {
    }
   
}