package org.github.hwj.behavior.command.demo2;

//具体命令：肠粉
public class ChangFen implements Breakfast {
    private final ChangFenChef receiver;

    ChangFen() {
        receiver = new ChangFenChef();
    }

    public void cooking() {
        receiver.cooking();
    }
}
