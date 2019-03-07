/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naval;

/**
 *
 * @author Romero
 */
public class Petroleiro extends Navio {
    
    private float carga;

    /**
     *
     * @param matricula
     */
    public Petroleiro(String matricula) {
        super(matricula);
    }

    /**
     * Get the value of carga
     *
     * @return the value of carga
     */
    public float getCarga() {
        return carga;
    }

    /**
     * Set the value of carga
     *
     * @param carga new value of carga
     */
    public void setCarga(float carga) {
        this.carga = carga;
    }

}
