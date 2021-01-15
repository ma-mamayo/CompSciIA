package sample;

public class Group {
    private String name;
    private Teacher teacher;

    public void setName (String name){
        this.name = name;
    }
    public String getName (){
        return this.name;
    }

    public void setTeacher(Teacher teacher){
        this.teacher = teacher;
    }
    public Teacher getTeacher(){
        return this.teacher;
    }

}
