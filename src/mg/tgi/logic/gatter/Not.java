package mg.tgi.logic.gatter;

/**
 * @author Marvin Grams
 * @version 0.1
 */
public class Not extends Gatter {
    public Not(int anzahlInputs, int anzahlOutputs) {
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
