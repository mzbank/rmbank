package product.Knowledge.design.behavior.middle;

public class ColleagueB extends AbstractColleague {

    @Override
    void setNumber(int number, AbstractMediator mediator) {
        this.number = number;
        mediator.BaffectA();
    }
}
