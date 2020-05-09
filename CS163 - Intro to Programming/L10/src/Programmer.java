public class Programmer extends Employee {

    public Programmer(String firstName, String lastName, int averageLines){
        super(firstName, lastName, averageLines);
    }
    public int work() {
        int workResult = randomBetween(50, 150);
        return  workResult;
    }
}
