package product.Knowledge.design.behavior.commandModel;

import product.Knowledge.design.behavior.commandModel.Invoke.Invoker;
import product.Knowledge.design.behavior.commandModel.command.Command;
import product.Knowledge.design.behavior.commandModel.command.ConcreteCommand;
import product.Knowledge.design.behavior.commandModel.receiver.Receiver;

public class Client {

    public static void main(String[] args) {
        Invoker invoker =new Invoker();
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        invoker.setCommand(command);
        invoker.action();
    }
}
