package state;

import fsa.FiniteStateAutomaton;

public interface State {

    boolean isAccepting();

    void handleInput(FiniteStateAutomaton fsa, char c);

}
