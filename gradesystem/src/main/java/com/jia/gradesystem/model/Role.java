package com.jia.gradesystem.model;

public enum Role {
    管理员(0),教师(1),学生(2);
    private int index;
    Role(int index){
        this.index =index;
    }
    String getName(){
        return this.name();
    }
    int getIndex(){
        return this.index;
    }

}
