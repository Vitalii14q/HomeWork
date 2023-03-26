package problemSecond;

import problem.Person;

public class Main {
    public static void main(String[] args) {
    People people = new People("Mike", "Wait" , 18, 70, 180);
    People people1 = new People("Tom", "Black", 55,110,190);
    System.out.println(people.toString());
    System.out.println("Количество созданных объектов класса Person: " + People.getCount());
    System.out.println(" ");
    LogicalOperators logicalOperators = new LogicalOperators(3, 4, 6);
    logicalOperators.usingLogicalOperators();
    System.out.println(" ");
    ConditionalStatements conditionalStatements = new ConditionalStatements(2020);
    conditionalStatements.isLeapYear();

    }
}
