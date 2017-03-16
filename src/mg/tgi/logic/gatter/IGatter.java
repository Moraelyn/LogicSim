package mg.tgi.logic.gatter;

/**
 * @author Marvin Grams
 * @version 0.1
 */
public interface IGatter {
    int getAnzahlInputs();
    int getAnzahlOutputs();
    boolean getOutputState(int outputNumber);
}
