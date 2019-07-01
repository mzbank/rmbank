package product.Knowledge.design.behavior.middle;

public class Client {

    public static void main(String[] args) {
        ColleagueA colleagueA = new ColleagueA();
        ColleagueB colleagueB = new ColleagueB();
        AbstractMediator mediator = new Mediator(colleagueA, colleagueB);
        int number = 1000;

        colleagueA.setNumber(number,mediator);
        System.out.println(colleagueB.getNumber());
        colleagueB.setNumber(number,mediator);
        System.out.println(colleagueA.getNumber());
    }
}
