package de.mg.tgi.LogicSim.gatter;

import de.mg.tgi.LogicSim.InvalidPortCountException;

/**
 * @author Marvin Grams
 * @version 0.1
 */
public final class And extends Gatter {
    public And(int anzahlInputs, int anzahlOutputs) throws InvalidPortCountException {
        super(anzahlInputs, anzahlOutputs);
    }

    @Override
    public boolean getOutputState(int outputNumber) {
        return outputs[outputNumber];
    }

    @Override
    public void setInputState(int inputNumber, boolean state) {
        inputs[inputNumber] = state;
    }

    @Override
    public void refreshState() {

    }
}
