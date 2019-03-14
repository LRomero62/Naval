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
public class PortaContentores extends Navio {
    
    private int contentores;

    /**
     *
     * @param matricula
     */
    public PortaContentores(String matricula) {
        super(matricula);
    }

    /**
     * Get the value of contentores
     *
     * @return the value of contentores
     */
    public int getContentores() {
        return contentores;
    }

    /**
     * Set the value of contentores
     *
     * @param contentores new value of contentores
     */
    public void setContentores(int contentores) {
        this.contentores = contentores;
    }

}
