// * @author fabian_esteban.lopez
package datos;

import modelo.Base;

public class Vehiculo extends Base {

    private String numeroPlaca;
    private String marca;
    private int modelo;

    public Vehiculo() {
    }

    public Vehiculo(String numeroPlaca, String marca, int modelo) {
        this.numeroPlaca = numeroPlaca;
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * Get the value of modelo
     *
     * @return the value of modelo
     */
    public int getModelo() {
        return modelo;
    }

    /**
     * Set the value of modelo
     *
     * @param modelo new value of modelo
     */
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    /**
     * Get the value of marca
     *
     * @return the value of marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Set the value of marca
     *
     * @param marca new value of marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Get the value of numeroPlaca
     *
     * @return the value of numeroPlaca
     */
    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    /**
     * Set the value of numeroPlaca
     *
     * @param numeroPlaca new value of numeroPlaca
     */
    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    @Override
    public String toString() {
        return numeroPlaca + ", " + marca + ", " + modelo;
    }

    @Override
    /*  private String numeroPlaca;
    private String marca;
    private int modelo;*/

    public Base copy() {
        return new Vehiculo(numeroPlaca, marca, modelo);
    }

}
