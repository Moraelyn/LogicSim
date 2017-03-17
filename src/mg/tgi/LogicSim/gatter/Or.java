package mg.tgi.LogicSim.gatter;

/**
 * @author Marvin Grams
 * @version 0.1
 */
public class Or extends Gatter {
    public Or(int anzahlInputs, int anzahlOutputs) {
        super(anzahlInputs, anzahlOutputs);
    }

    @Override
    public boolean getOutputState(int outputNumber) {
        return false;
    }

    @Override
    public void setInputState(int inputNumber, boolean state) {

    }
}
