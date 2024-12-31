package basic.day04;

// 배열 활용 예시
public class A25ArrayExample {

    public static void main(String[] args) {
        
        int[] scores ={87,67,99,56,72};

       
        int sum=0;  // 누적합. 초기값 꼭필요
        
        // 1) 배열 요소의 모든 값 합계와 평균 구하기
        for(int i=0; i<scores.length;i++){
            sum+=scores[i];
        }
        System.out.println(sum);
        System.out.println((double)sum/scores.length);


        // 2) 배열 요소에서 가장 큰값 (또는 작은값)
        int max=scores[0];      // max는 배열의 첫번째 값으로 초기화  
        int min=scores[0];
        for(int i=1;i<scores.length;i++){
            if(max<scores[i]){
                max=scores[i];
            }
            if(min>scores[i]){
                min=scores[i];
            }

        }
        System.out.println(max);
        System.out.println(min);


        // 3) 배열을 메소드의 인자로 전달할 수 있음.
        // 메소드로 전달된 값은 배열의 요소 전체가 아니라 배열이 저장된 시작주소
        long result=arraysMul(scores);
        System.out.println("배열 요소의 곱"+result);

        // 4) 전달된 배열 값을 변경하는 메소드.
        arraysChg(scores);
        for(int i=0;i<scores.length; i++){
            System.out.println(scores[i]+"\t");
            
            System.out.println("scores 배열의 참조값"+scores);

            int[] testarr=new int[7];
            arraysChg(testarr);
            System.out.println("testarr 배열의 참조값" +testarr);
        }
       
        // 배열을 리턴하는 메소드
        int[] newarr=makeArray(10);
        System.out.println("newarr 배열의 참조값" +newarr);
        // newarr 은 makeArray 메소드로부터 새로운 배열의 주소를 리턴 받음.
        for(int i=0; i<newarr.length; i++)
        System.out.print(newarr[i]+" ,");
    
        System.out.println("\n////////////////////////////////////////////////");
        int[] newarr2 = copyArray(scores);
        // scores 값을 복사하여 새로운 배열 newarr2 만들기
            System.out.println("스코어 배열의 참조값 " + scores);
            System.out.println("newarr2 배열의 참조값 " + newarr2);
            for(int i=0;i<newarr2.length;i++)
            System.out.println(newarr2[i]+" , ");
        
    }

    // 배열을 전달받아서 배열 요소를 모두 곱함.
    // 인자 선언은 지역변수 선언. 배열 할당은 호출할때 전달.
    // array 배열은 초기값X, 크기X 아직모름. => 배열 할당은 호출할 때 전달.
    public static long arraysMul(int[] array){
        long result = 1;
        for(int i=0; i<array.length;i++)
            result*=array[i];       // 반복할 명령어 1개라서 {} 생략가능.
        return result;
    }

    // 호출할 때 전달한 scores 배열의 시작 주소를 array 변수가 저장함.
    public static void arraysChg(int[]array){   //{87,67,99,56,72}
        for(int i=0; i<array.length;i++){
            array[i]+=10;       // 배열 하나씩 가져와서 10씩 더해줘 {97,77,109,66,82}
        }
        System.out.println("array 배열의 참조값 : "+array);
    }
      
    
   public static int[] makeArray(int size) {
    int[] results = new int[size];   // size 값에 따라 배열의 크기 결정
    for(int i=0; i<size; i++)
        results[i]=i*11;        // 0, 11, 22, 33, 44, 55
        System.out.println("results 배열의 참조값" + results);
    return results;     // results 배열의 주소값을 호출한 main에 전달함.
   }

   // 퀴즈 : '배열을 인자로 받아서' 요소값을 복사한 '새로운 배열을 리턴'하기.
   //      copyArray

   public static int[] copyArray(int[] array){
    int[] results = new int[array.length];      // result 초기값은 모두 0
    for(int i=0; i<array.length;i++)
    results[i]=array[i];        // 배열 요소값 복사.
    
    return results;
   }
}






