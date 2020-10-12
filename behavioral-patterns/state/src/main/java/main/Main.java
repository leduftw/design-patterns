package main;

import fsa.FiniteStateAutomaton;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {

            /*
                    Complete language of this automaton is word Dusko.

                                  D    u    s    k    o
                                o -> o -> o -> o -> o -> o
                                ^    ^    ^    ^    ^    ^  
                                |    |    |    |    |    |
                    States:   Start  D    U    S    K    O
            */
            
            FiniteStateAutomaton finiteStateAutomaton = new FiniteStateAutomaton();
            System.out.println("Finite-State Automaton created");
            System.out.println(finiteStateAutomaton + "\n");

            char c = scanner.next().charAt(0);

            while (c != 'q') {  // q for quit
                finiteStateAutomaton.handleInput(c);
                System.out.println(finiteStateAutomaton + "\n");

                c = scanner.next().charAt(0);
            }

            System.out.println("Process finished");
            System.out.println(finiteStateAutomaton);
        }
    }

}
