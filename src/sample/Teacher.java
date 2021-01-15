package sample;

import java.util.ArrayList;

public class Teacher {
    private String name;
    private ArrayList<Group> groups = new ArrayList<Group>();

    public void setName (String name){
        this.name = name;
    }
     public String getName(){
        return this.name;
     }

    public ArrayList<Group> getGroups(){
        return this.groups;
    }

}
