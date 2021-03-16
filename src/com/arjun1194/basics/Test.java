package com.company;

public class Test {
    String initial;
    InitialChangeListener initialChangeListener;
    public Test() {

    }

    Test setInitial(String changedInitial){
        this.initial = changedInitial;
        initialChangeListener.onInitialChange(changedInitial);
        return this;
    }

    Test setInitialChangeListener(InitialChangeListener initialChangeListener){
        this.initialChangeListener = initialChangeListener;
        return this;
    }

    interface InitialChangeListener{
        void onInitialChange(String updatedInitial);
    }
}
