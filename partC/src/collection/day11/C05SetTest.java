package collection.day11;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

// Set 클래스 : HashSet, TreeSet (구현 알고리즘)
public class C05SetTest {

    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        // add, remove, contains 는 List와 동일하게 사용함.
        // indexOf, lastIndexOf 는 Set 은 인덱스가 없어서 사용못함.

        set.add("sana");
        set.add("momo");
        set.add("nana");

        System.out.println(set.toString());   // 문자열 출력을 위해 toString 재정의 되었음.
        System.out.println(set);
        System.out.println(set.size());     // 예측값 3
        set.add("sana");
        System.out.println(set.size());     // 예측값 3 - 중복된 값은 한번만 저장

        // 1. Hash는 해시테이블을 이용한 Set 이다.
        System.out.println("HashSet 자료구조에 저장된 값 하나씩 가져오기");
        for(String temp : set){     // 오직 향상 for문으로만 가능
            System.out.println(temp);   // 순서가 없는 자료구조기 때문에 temp 순서는 랜덤임. 순서가 의미가 없음
        }

        // 2. Linked : 연결된.  입력(추가)한 순서를 저장. (다음 항목의 주소를 저장하는 방식)
        Set<String> linkSet=new LinkedHashSet<>();
        linkSet.add("dahyeon");
        linkSet.add("sana");
        linkSet.add("momo");
        linkSet.add("nana");
        System.out.println("LinkedHashSet 자료구조에 저장된 값 하나씩 가져오기");
        for(String temp : linkSet)
        System.out.println(temp);

        // 3. TreeSet : 이진트리구조에 저장. (정렬된 방식으로 접근)
        Set<String> tSet=new TreeSet<>();
        tSet.add("dahyeon");
        tSet.add("sana");
        tSet.add("momo");
        tSet.add("nana");
        System.out.println("TreeSet 자료구조에 저장된 값 하나씩 가져오기");
        for(String temp : tSet)
        System.out.println(temp);
    }

}
