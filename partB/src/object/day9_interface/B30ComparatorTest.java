package object.day9_interface;

import java.util.Arrays;
import java.util.Comparator;

public class B30ComparatorTest {

    public static void main(String[] args) {

   
    
        
        Member[] members = new Member[4];
    members[0] = new Member("sana", 23);
    members[1] = new Member("momo", 27);
    members[2] = new Member("nayeon", 33);
    members[3] = new Member("dahyeon", 25);

    Arrays.sort(members, )
   
    }


}

class Member {

    private String name;
    private int age;
  
    Member(String name, int age){
        this.name=name;
        this.age=age;
      }

    @Override
    public String toString() {
        return "Member [name=" + name + ", age=" + age + "]";
    }
      
}
