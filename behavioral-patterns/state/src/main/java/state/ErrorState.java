package state;

import fsa.FiniteStateAutomaton;

public class ErrorState implements State {

    private static final boolean ACCEPTING = false;

    public boolean isAccepting() {
        return ACCEPTING;
    }

    public void handleInput(FiniteStateAutomaton fsa, char c) {
        //fsa.setState(new ErrorState());  // unnecessary, since automaton is already in error state
    }

    @Override
    public String toString() {
        return "Error state: Accepting - " + ACCEPTING;
    }

}
