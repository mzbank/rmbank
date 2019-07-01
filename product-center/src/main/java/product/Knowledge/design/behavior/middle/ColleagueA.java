package product.Knowledge.design.behavior.middle;

public class ColleagueA extends AbstractColleague {
    @Override
    void setNumber(int number, AbstractMediator mediator) {
        this.number = number;
        mediator.AaffectB();
    }
}
