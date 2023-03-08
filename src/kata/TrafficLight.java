package kata;

public class TrafficLight { // extends ключевое слово используется для обозначения наследования. StateMachine а это класс у которого мы будем наследовать его свойства и методы
    private final StateMachine stateMachine = new StateMachine("1");
    private static final String Red = "Red";
    private static final String Yellow = "Yellow";
    private static final String Green = "Green";
    private static final String FlashGreen = "FlashGreen";

    public TrafficLight () {
        stateMachine.addState(Red, Yellow);
        stateMachine.addState(Yellow, Green);
        stateMachine.addState(Green, FlashGreen);
        stateMachine.addState(FlashGreen, Red);
        stateMachine.setState(Red);
    }

    public void changeLight() {
        stateMachine.setNextState();
    }

    public String getColor (){
        return stateMachine.getCurrentState();
    }
}

































/*Класс TrafficLight расширяет StateMachine класс и переопределяет setNextState()метод.

Конструктор TrafficLight()устанавливает начальное состояние светофора на «Красный».

Метод addStates()добавляет различные состояния светофора в states массив StateMachine класса.

Метод run()является основным методом управления работой светофора. Он использует while цикл для непрерывного обновления состояния светофора каждые 5 секунд.

Метод setNextState()обновляет состояние светофора до следующего состояния в states массиве.

Метод printLight()выводит текущее состояние светофора в консоль.

Наконец, основной метод создает экземпляр TrafficLight класса и вызывает для него run()метод.
**/

/**TrafficLightкласс: этот класс расширяет StateMachineкласс и переопределяет его setNextState()метод для изменения состояния светофора.

 Конструктор: Конструктор устанавливает начальное состояние светофора на «Красный».

 addStates()метод: этот метод используется для добавления различных состояний светофора в statesмассив StateMachineкласса. Массив statesхранит переходы между различными состояниями светофора.

 run()метод: этот метод является основным методом, который контролирует работу светофора. Он использует whileцикл для обновления состояния светофора каждые 5 секунд. Метод Thread.sleep()используется для приостановки выполнения программы на 5 секунд.

 setNextState()метод: этот метод обновляет состояние светофора до следующего состояния в statesмассиве. Он вызывается в run()методе для непрерывного изменения состояния светофора.

 printLight()метод: этот метод выводит текущее состояние светофора в консоль. Он вызывается в run()методе для отображения состояния светофора.

 Основной метод: основной метод создает экземпляр TrafficLightкласса и вызывает его run()метод, чтобы начать работу светофора.*/