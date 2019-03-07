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
    private List<Navio> navios;
    
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
        navios = new ArrayList<>();
    }
    
    private Navio procura(String m){
        Navio n = null;
        for(int i=0; i<navios.size() && n==null; i++)
            if(navios.get(i).getMatricula().compareTo(m)==0)
                n = navios.get(i);
        return n;
    }
    
    public void novo(Navio n){
        Navio nv = procura(n.getMatricula());
        if(nv==null && n!=null) navios.add(n);
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
