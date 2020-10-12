package state;

import fsa.FiniteStateAutomaton;

public class StartState implements State {

    private static final boolean ACCEPTING = false;

    public boolean isAccepting() {
        return ACCEPTING;
    }

    public void handleInput(FiniteStateAutomaton fsa, char c) {
        switch (c) {
            case 'D':
                fsa.setState(new StateD());
                break;

            default:
                fsa.setState(new ErrorState());
                break;
        }
    }

    @Override
    public String toString() {
        return "Start state: Accepting - " + ACCEPTING;
    }

}
