package de.mg.tgi.LogicSim.gatter;

import de.mg.tgi.LogicSim.InvalidPortCountException;

/**
 * @author Marvin Grams
 * @version 0.1
 */
public final class Not extends Gatter {
    /**
     * Konstruktor
     *
     * @throws InvalidPortCountException Wenn eine ungültige Anzahl an Ports angegeben ist
     */
    public Not() throws InvalidPortCountException {
        super(1, 1);
    }

    @Override
    public boolean getOutputState(int outputNumber) {
        return outputs[outputNumber];
    }

    @Override
    public void setInputState(int inputNumber, boolean state) {
        inputs[inputNumber] = state;
        refreshState();
    }

    @Override
    public void refreshState() {
        for (int i = 0; i < inputs.length; i++) {
            outputs[i] = !inputs[i];
        }
    }
}
