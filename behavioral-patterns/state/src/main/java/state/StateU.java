package state;

import fsa.FiniteStateAutomaton;

public class StateU implements State {

    private static final boolean ACCEPTING = false;

    public boolean isAccepting() {
        return ACCEPTING;
    }

    public void handleInput(FiniteStateAutomaton fsa, char c) {
        switch (c) {
            case 's':
                fsa.setState(new StateS());
                break;

            default:
                fsa.setState(new ErrorState());
                break;
        }
    }

    @Override
    public String toString() {
        return "State U: Accepting - " + ACCEPTING;
    }

}
