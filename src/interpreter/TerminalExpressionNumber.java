/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;

import java.util.Stack;

/**
 *
 * @author USUARIO
 */
public class TerminalExpressionNumber implements Expression {

    private int number;

    public TerminalExpressionNumber(int number) {
        this.number = number;
    }
    
    @Override
    public void interpret(Stack<Integer> s) {
        s.push(number);
    }
    
}
