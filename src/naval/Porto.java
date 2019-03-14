/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package naval;

import java.util.*;

/**
 *
 * @author Romero
 */
public class Porto {
    private Set<Navio> navios;
    
    private String nome = "Porto";

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


    public Porto() {
        navios = new HashSet<>();
    }
    
    private Navio procura(String m){
        for(Navio n: navios)
            if(n.getMatricula().compareTo(m)==0)
                return n;
        return null;
    }
    
    public void novo(Navio n){
        if(!navios.contains(n))
            navios.add(n);
    }
    
    public int totalContentores(){
        int total = 0;
        for(Navio n:navios){
            if(n instanceof PortaContentores) {
                total += ((PortaContentores) n).getContentores();
            }
        }
        return total;
    }
    
    public float totalCapacidade(){
        float total = 0;
        for(Navio n:navios){
            if(n instanceof PortaContentores) {
                total += ((PortaContentores) n).getContentores() * 10;
            } else 
                if(n instanceof Petroleiro) {
                    total += ((Petroleiro) n).getCarga();
                }
        }
        return total;
    }
    
    public void listAll(){
        System.out.println("Navios do porto: " + nome);
        for(Navio n:navios){
            System.out.println(n);
            
        }
    }
}
