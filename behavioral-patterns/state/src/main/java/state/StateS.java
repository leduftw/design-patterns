package state;

import fsa.FiniteStateAutomaton;

public class StateS implements State {

    private static final boolean ACCEPTING = false;

    public boolean isAccepting() {
        return ACCEPTING;
    }

    public void handleInput(FiniteStateAutomaton fsa, char c) {
        switch (c) {
            case 'k':
                fsa.setState(new StateK());
                break;

            default:
                fsa.setState(new ErrorState());
                break;
        }
    }

    @Override
    public String toString() {
        return "State S: Accepting - " + ACCEPTING;
    }

}
