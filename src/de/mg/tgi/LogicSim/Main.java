package de.mg.tgi.LogicSim;

import de.mg.tgi.LogicSim.gatter.Not;
import de.mg.tgi.LogicSim.gatter.Or;

/**
 * @author Marvin Grams
 * @version 0.1
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Not n = new Not();
        Or o = new Or(5, 2);
        //n.setInputState(5, false);
    }
}
