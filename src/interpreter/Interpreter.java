/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;

/**
 *
 * @author USUARIO
 */
public class Interpreter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("'42 2 1 - +' equals " + new Parser("5 4 + 3 2 1 - x +").evaluate());
    }

}
