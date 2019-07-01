package product.Knowledge.design.behavior.middle;

public abstract class AbstractColleague {

    protected int number;

    public int getNumber(){
        return this.number;
    }

    public void setNumber(int number){
        this.number = number;
    }

    abstract void setNumber(int number, AbstractMediator mediator);

}
