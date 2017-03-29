package mg.tgi.LogicSim.gatter;

import mg.tgi.logic.InvalidPortCountException;

/**
 * @author Marvin Grams
 * @version 0.1
 */
public class Not extends Gatter {
    public Not(int anzahlPorts) throws InvalidPortCountException {
        super(anzahlPorts, anzahlPorts);
    }

    @Override
    public boolean getOutputState(int outputNumber) {
        return inputs[outputNumber];
    }

    @Override
    public void setInputState(int inputNumber, boolean state) {

    }
}
