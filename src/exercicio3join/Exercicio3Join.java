/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3join;

import static java.lang.System.out;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author balva
 */
public class Exercicio3Join extends Thread{
    
    
public Exercicio3Join(String str) {
        super(str);
    }
    static int fio = 1;

    public void run() {

           out.println(getName() + " Comenzado");

        if (fio < 5) {
            fio++;
            
            Exercicio3Join th = new Exercicio3Join("Fio " + fio);
            th.start();
            
            try {
                th.join();
                for (int i = 0; i < 9; i++){
                
                Thread.sleep((long) Math.random() * (100 - 600));
                 out.println(this.getName()+"  en proceso ");
                }
            } catch (InterruptedException e) {
                Object ex = null;
                Logger.getLogger(Exercicio3Join.class.getName()).log(Level.SEVERE, null, e);
            
            }
        } else {
            for (int i = 0; i < 9; i++){
                
                try {
                    Thread.sleep((long) Math.random() * (100 - 600));
                    out.println(this.getName()+"  en proceso");
                } catch (InterruptedException e) {
                    Logger.getLogger(Exercicio3Join.class.getName()).log(Level.SEVERE, null, e);
                }
                }
        }
        out.println(getName()+" terminado");
    }

 

    

    

    public static void main(String[] args)  {
        

Thread th = new Exercicio3Join ("Fio "+fio);
        th.start ();

    }
}
