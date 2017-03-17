package mg.tgi.LogicSim.gatter;

import java.util.Arrays;

/**
 * @author Marvin Grams
 * @version 0.1
 */
public abstract class Gatter {
    private boolean[] inputs;
    private boolean[] outputs;

    public int getAnzahlInputs() {
        return inputs.length;
    }

    public int getAnzahlOutputs() {
        return outputs.length;
    }

    public boolean[] getInputs() {
        return inputs;
    }

    public Gatter(int anzahlInputs, int anzahlOutputs) {
        this.inputs = new boolean[anzahlInputs];
        this.outputs = new boolean[anzahlOutputs];
    }

    public abstract boolean getOutputState(int outputNumber);
    public abstract void setInputState(int inputNumber, boolean state);

    @Override
    public String toString() {
        return "Gatter{" +
                "inputs=" + Arrays.toString(inputs) +
                ", outputs=" + Arrays.toString(outputs) +
                '}';
    }
}
