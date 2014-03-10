/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operation;

import evaluator.BinaryOperation;

/**
 *
 * @author Soulkyiro
 */
public class addDoubleDouble implements Operator {

    @Override
    public Object calculate(BinaryOperation numbers) {
        return (double) numbers.getLeft().evaluator() + (double) numbers.getRigth().evaluator();
    }

}
