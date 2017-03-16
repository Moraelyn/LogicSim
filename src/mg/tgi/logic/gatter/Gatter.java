package mg.tgi.logic.gatter;

/**
 * @author Marvin Grams
 * @version 0.1
 */
public abstract class Gatter implements IGatter {
    private int anzahlInputs;
    private int anzahlOutputs;

    @Override
    public int getAnzahlInputs() {
        return anzahlInputs;
    }

    @Override
    public int getAnzahlOutputs() {
        return anzahlOutputs;
    }

    @Override
    public boolean getOutputState(int outputNumber) {
        return false;
    }
}
