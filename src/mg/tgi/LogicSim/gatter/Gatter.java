package mg.tgi.LogicSim.gatter;

import mg.tgi.LogicSim.InvalidPortCountException;

/**
 * @author Marvin Grams
 * @version 0.1
 */
public abstract class Gatter implements IGatter {
    protected boolean[] inputs;
    protected boolean[] outputs;

    public Gatter(int anzahlInputs, int anzahlOutputs) throws InvalidPortCountException {
        try {
            this.inputs = new boolean[anzahlInputs];
            this.outputs = new boolean[anzahlOutputs];
        } catch (NegativeArraySizeException | ArrayIndexOutOfBoundsException e) {
            throw new InvalidPortCountException(e.getMessage());
        }
    }

    @Override
    public void changeState(int number) {
        // TODO: Überlegen!
    }

    public int getAnzahlInputs() {
        return inputs.length;
    }

    public int getAnzahlOutputs() {
        return outputs.length;
    }

    public abstract boolean getOutputState(int outputNumber);

    public abstract void setInputState(int inputNumber, boolean state);
}
