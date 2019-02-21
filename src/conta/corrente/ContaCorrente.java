/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta.corrente;

/**
 *
 * @author 20171BSI0367
 */
public class ContaCorrente {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        ContaCorrenteH x = new ContaCorrenteH();
        x.Saldo = 150;
        System.out.println(x.calculaTributos());
    }
    
}
