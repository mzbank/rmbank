package product.Knowledge.design.behavior.middle;

public class Mediator extends AbstractMediator {

    public Mediator(AbstractColleague collA, AbstractColleague collB){
        super(collA, collB);
    }

    @Override
    void AaffectB() {

        int number = collA.getNumber();
        collB.setNumber(number*100);
    }

    @Override
    void BaffectA() {

        int number = collB.getNumber();
        collA.setNumber(number/100);
    }
}
