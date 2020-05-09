public class Tester extends Employee {

    public Tester(String firstName, String lastName, int averageLines){
        super(firstName, lastName, averageLines);
    }

    public int work() {
        int workResult = randomBetween(75, 125);
        return  workResult;
    }



}
