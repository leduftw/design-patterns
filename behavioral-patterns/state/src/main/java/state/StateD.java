package state;

import fsa.FiniteStateAutomaton;

public class StateD implements State {

    private static final boolean ACCEPTING = false;

    public boolean isAccepting() {
        return ACCEPTING;
    }

    public void handleInput(FiniteStateAutomaton fsa, char c) {
        switch (c) {
            case 'u':
                fsa.setState(new StateU());
                break;

            default:
                fsa.setState(new ErrorState());
                break;
        }
    }

    @Override
    public String toString() {
        return "State D: Accepting - " + ACCEPTING;
    }

}
