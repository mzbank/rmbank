package product.Knowledge.design.behavior.commandModel.command;

import product.Knowledge.design.behavior.commandModel.receiver.Receiver;

public class ConcreteCommand extends Command {

    private Receiver receiver;

    public ConcreteCommand(Receiver receiver){
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        this.receiver.dosomthing();
    }
}
