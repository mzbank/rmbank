package product.Knowledge.design.behavior.commandModel.Invoke;

import product.Knowledge.design.behavior.commandModel.command.Command;

public class Invoker {

    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void action(){
        this.command.execute();
    }
}
