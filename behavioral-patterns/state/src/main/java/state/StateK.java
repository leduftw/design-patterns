package state;

import fsa.FiniteStateAutomaton;

public class StateK implements State {

    private static final boolean ACCEPTING = false;

    public boolean isAccepting() {
        return ACCEPTING;
    }

    public void handleInput(FiniteStateAutomaton fsa, char c) {
        switch (c) {
            case 'o':
                fsa.setState(new StateO());
                break;

            default:
                fsa.setState(new ErrorState());
                break;
        }
    }

    @Override
    public String toString() {
        return "State K: Accepting - " + ACCEPTING;
    }

}
