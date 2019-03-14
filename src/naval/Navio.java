/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naval;

import java.util.Objects;

/**
 *
 * @author Romero
 */
public class Navio {
    
    private String nome;
    private float comprimento;
    private String matricula;

    /**
     * 
     * @param matricula ship identification
     */
    public Navio(String matricula) {
        this.matricula = matricula;
    }

    
    /**
     * Get the value of matricula
     *
     * @return the value of matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Get the value of comprimento
     *
     * @return the value of comprimento
     */
    public float getComprimento() {
        return comprimento;
    }

    /**
     * Set the value of comprimento
     *
     * @param comprimento new value of comprimento
     */
    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    /**
     * Get the value of nome
     *
     * @return the value of nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Set the value of nome
     *
     * @param nome new value of nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString(){
        return nome + ": " + matricula;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.nome);
        hash = 79 * hash + Float.floatToIntBits(this.comprimento);
        hash = 79 * hash + Objects.hashCode(this.matricula);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Navio other = (Navio) obj;
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        return true;
    }
    
    
}
