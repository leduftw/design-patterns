package state;

import fsa.FiniteStateAutomaton;

public class StateO implements State {

    private static final boolean ACCEPTING = true;

    public boolean isAccepting() {
        return ACCEPTING;
    }

    public void handleInput(FiniteStateAutomaton fsa, char c) {
        fsa.setState(new ErrorState());
    }

    @Override
    public String toString() {
        return "State O: Accepting - " + ACCEPTING;
    }

}
