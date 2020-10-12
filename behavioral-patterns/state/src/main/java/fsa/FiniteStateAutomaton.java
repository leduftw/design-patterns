package fsa;

import state.StartState;
import state.State;

public class FiniteStateAutomaton {

    private State state;

    public FiniteStateAutomaton() {
        state = new StartState();
    }

    public FiniteStateAutomaton(State initialState) {
        state = initialState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void handleInput(char c) {
        state.handleInput(this, c);
    }

    @Override
    public String toString() {
        return "FiniteStateAutomaton{" +
                "state=" + state +
                '}';
    }

}
