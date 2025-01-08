package object.day10;

import java.util.Comparator;

public class AscendingNameComparator implements Comparator<Member>{  
    // '이름'으로 오름 차순

 @Override
 public int compare(Member o1, Member o2) {
     
     return o1.getName().compareTo(o2.getName());
 }
}

class DecendingNameComparator implements Comparator<Member>{
    // '이름'으로 내림차순

    @Override
    public int compare(Member o1, Member o2) {
      
        return o2.getName().compareTo(o1.getName());
    }
}
class Member {

    private String name;
    private int age;
  
    Member(String name, int age){
        this.name=name;
        this.age=age;
      }
      public int getAge() {
          return age;
      }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Member [name=" + name + ", age=" + age + "]";
    }
      
}