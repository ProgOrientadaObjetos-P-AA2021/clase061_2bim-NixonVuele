/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class ArriendoLocalComida extends Arriendo {
    private double valorLuz;
    private double valorAgua;
    private double iva;
    // public String nombreArrendatario;
    
    
    public ArriendoLocalComida(String nombre, double cuotaB){
        super(nombre, cuotaB);
    }
    
    @Override
    public void establecerNombreArrendatario(String nombre){
        nombreArrendatario = nombre.toUpperCase();
    }
    
    public void establecerValorLuz(double x){
        valorLuz = x;
    }
    
    public void establecerValorAgua(double x){
        valorAgua = x;
    }
    
    public void establecerIva(double x){
        iva = x;
    }
    
    @Override
    public void establecerArriendoMensual(){
        double subtotal = obtenerValorAgua() + obtenerValorLuz() + 
                obtenerCuotaBase();
        arriendoMensual = subtotal + (subtotal * (obtenerIva()/100));
    }
    
    public double obtenerValorLuz(){
        return valorLuz;
    }
    
    public double obtenerValorAgua(){
        return valorAgua;
    }
    
    public double obtenerIva(){
        return iva;
    }
    

    
        
}
