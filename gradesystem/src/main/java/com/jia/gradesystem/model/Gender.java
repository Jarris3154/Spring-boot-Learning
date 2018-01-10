package com.jia.gradesystem.model;

public enum Gender {

    女(0),男(1);

    private int index;
    Gender(int index){
        this.index = index;
    }
    String getName(){
        return this.name();
    }

    int getIndex(){
        return this.index;
    }
}
