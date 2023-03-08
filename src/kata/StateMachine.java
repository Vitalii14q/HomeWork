package kata;



public class StateMachine {
    private String state;
    private String[][] states = {};

    public StateMachine (String hello) {
        System.out.println("Я конструктор стейт машин");
    }

    public void addState(String startState, String finishState) {
        String []transition = {startState, finishState};
        String [][]array1 = new String[states.length + 1][2];

        for (int i = 0; i < states.length; i++) {
            array1[i] = states[i];
        }
        array1[array1.length - 1] = transition;
        states = array1;
    }

    public String[][] getStates () {
        return states;
    }

    public void setState (String state) {
        this.state = state;
    }

    public void setNextState () {
        for (int i = 0; i < states.length; i++) {
            String [] transition = states[i];

            if (transition[0].equals(state)) {
                state = transition[1];
                break; // забыли поставить брейк. нужно искать следующее состояние, пока оно не найдено. Для этого нужно добавить break; в условие, когда следующее состояние найдено.
            }
        }
    }

    public String getCurrentState () {
        return state;
    }
}
