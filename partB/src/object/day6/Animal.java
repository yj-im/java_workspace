package object.day6;

public class Animal {

    private String type;
    private String name;
    private int age;
    private String color;
    private String sound;

    public Animal(String type, String name, int age, String color){
        this.type=type;
        this.name=name;
        this.age=age;
        this.color=color;
        
        
    }
    public String getType(){
        return this.type;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getColor(){
        return this.color;
    }
    public String getSound(){
        return this.sound;
    }


    public void setType(String type){
        this.type=type;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String toString(){
        return String.format("%s %s %d %s %s",this.type, this.name, this.age, this.color,sound());

        
}
public String sound(){
    String result="";
    switch (this.name) {
        case "마루":
            result="멍멍";
            break;

        case "후추":
            result="야옹야옹";
            break;

        case "도날드":
            result="꽥꽥";
            break;
    
        default:
            break;
    }
    return result;
}
}
