package Kata;



public class main {
    public static void main(String[] args) throws InterruptedException { // throws InterruptedException добавила идея
        int min1 = 10;
        int min2 = 10;

        Clock clock1 = new Clock(3,4);
        Clock clock2 = new Clock(4,5);

        Clock result = clock1.addClocks(clock2).addMinutes(min1).addMinutes(min2);
        System.out.println(result);

        /*TrafficLight trafficLight = new TrafficLight();
        while (true) {
            System.out.println("Start: " + trafficLight.getColor());
            trafficLight.changeLight();
            System.out.println("After change 1: " + trafficLight.getColor());
            Thread.sleep(5000);
            trafficLight.changeLight();
            System.out.println("After change 2: " + trafficLight.getColor());
            Thread.sleep(5000);
            trafficLight.changeLight();
            System.out.println("After change 3: " + trafficLight.getColor());
            Thread.sleep(5000);
            trafficLight.changeLight();
            System.out.println("After change 4: " + trafficLight.getColor());
            Thread.sleep(5000);
        }*/

        StateMachineWithMemory stateMachineWithMemory = new StateMachineWithMemory("s");
    }
}
