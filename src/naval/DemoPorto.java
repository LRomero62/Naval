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
public class DemoPorto {
    public static void main(String[] args) {
        Porto porto = new Porto();
        Petroleiro pt = new Petroleiro("1234");
        PortaContentores pc = new PortaContentores("2345");
        
        pt.setCarga(100);
        pc.setContentores(5);
        porto.novo(pt);
        porto.novo(pc);
        pt.setNome("Viana");
        pc.setNome("Braga");
    }
}
