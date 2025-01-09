package collection.day11;

import java.util.Arrays;
import java.util.List;

public class C02ListSearchTest {

    private static String[] names={"모모","나나","다현","사나","나나"};

    public static void main(String[] args) {
        
        System.out.println("리스트의 검색");
        List<String> list=Arrays.asList(names);
        System.out.println(list.indexOf("나나"));   // 1 (int)
        System.out.println(list.lastIndexOf("나나")); // 4 (int)
        System.out.println(list.contains("나무"));  // false (boolean)



        System.out.println("배열의 검색");
        System.out.println("// names 배열에서 '다현' 인덱스 값은 ? ");
        int index=-1;
        // for문으로 배열의 모든 요소를 검사.
        for(int i=0;i<names.length;i++){
            if(names[i].equals("다현")){
                index=i;    // 찾는 문자열과 일치하는 i를 결과변수  index에 저장
                break;      // 찾았으니까 for문 빠져나감.
            }
        }
        System.out.println("다현이의 위치 : "+index);   // 예상값 2
        System.out.println("사나의 위치 : "+indexOf("사나"));   // 예상값 3
        System.out.println("모모의 위치 : "+indexOf("모모"));   // 예상값 0
        System.out.println("나나의 위치 : "+indexOf("나나"));   // 예상값 1
    }
    public static int indexOf(String text){
        int index=-1;
        for(int i=0;i<names.length;i++){
            if(names[i].equals(text)){
                index=i;    // 찾는 문자열과 일치하는 i를 결과변수  index에 저장
                break;      // 찾았으니까 for문 빠져나감.
            }
        }
        return index;
    }
}

