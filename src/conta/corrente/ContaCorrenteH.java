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
public class ContaCorrenteH extends Conta implements Tributavel {
   

    @Override
    public double calculaTributos() {
        return Saldo*0.1;
    }
    
   
}
