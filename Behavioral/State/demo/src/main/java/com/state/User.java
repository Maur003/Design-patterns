package com.state;

public class User {

    private State state;
    private boolean buying;
    private boolean enable;

    public User() {
        this.state = new ActiveState(this);
    }

    public void changeState(State state) {
        this.state = state;
    }

    public String onActive() {
        return state.onActive();
    }

    public String onDisable() {
        return state.onDisable();
    }

    public String onLock() {
        return state.onLock();
    }

    public String onBuy() {
        return state.onBuy();
    }

    public String startBuy() {
        return "Buying...";
    }

    public boolean isBuying() {
        return buying;
    }

    public void setBuying(boolean buying) {

        this.buying = buying;
    }

    public boolean getEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

}
