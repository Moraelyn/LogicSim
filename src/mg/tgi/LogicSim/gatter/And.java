package mg.tgi.LogicSim.gatter;

import mg.tgi.LogicSim.InvalidPortCountException;

/**
 * @author Marvin Grams
 * @version 0.1
 */
public class And extends Gatter {
    public And(int anzahlInputs, int anzahlOutputs) throws InvalidPortCountException {
        super(anzahlInputs, anzahlOutputs);
    }

    @Override
    public boolean getOutputState(int outputNumber) {
        return false;
    }

    @Override
    public void setInputState(int inputNumber, boolean state) {
        this.getInputs()[inputNumber] = state;
    }
}
