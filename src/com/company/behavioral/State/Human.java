package com.company.behavioral.State;

public class Human {
    private Activity state;

//

    public void setState(Activity state) {
        this.state = state;
    }

    public void doSomething() {
        state.doSomething(this);
    }
}
