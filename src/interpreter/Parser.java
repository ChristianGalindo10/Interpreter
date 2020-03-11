/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author USUARIO
 */
public class Parser {

    private ArrayList<Expression> parseTree = new ArrayList<Expression>();

    public Parser(String s) {
        for (String token : s.split(" ")) {
            if (token.equals("+")) {
                parseTree.add(new TerminalExpressionPlus());
            } else {
                if (token.equals("-")) {
                    parseTree.add(new TerminalExpressionMinus());
                } else {
                    if (token.equals("x")) {
                        parseTree.add(new TerminalExpressionTimes());
                    } else {
                        if (token.equals("/")) {
                            parseTree.add(new TerminalExpressionDiv());
                        }else{
                            parseTree.add(new TerminalExpressionNumber(Integer.valueOf(token)));
                        }
                    }
                }
            }
        }
    }

    public int evaluate() {
        Stack<Integer> context = new Stack<Integer>();
        for (Expression e : parseTree) {
            e.interpret(context);
        }
        return context.pop();
    }

}
