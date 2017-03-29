package mg.tgi.logic.gatter;

import mg.tgi.logic.InvalidPortCountException;

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
    public void setInputState(int inputNumber) {

    }
}
