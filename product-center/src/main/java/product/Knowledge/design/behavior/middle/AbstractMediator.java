package product.Knowledge.design.behavior.middle;

public abstract class AbstractMediator {
    protected AbstractColleague collA;
    protected AbstractColleague collB;

    public AbstractMediator(AbstractColleague collA, AbstractColleague collB){
        this.collA = collA;
        this.collB = collB;
    }

    abstract void AaffectB();
    abstract void BaffectA();
}
