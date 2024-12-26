package basic.day01;

// 숙제
public class A05ForTest {
  //javascript for문 형식을 그대로 적용
  //          ㄴ for(i=0;i<100;i++) {    }

  public static void main(String[] args) {

   
    // 1부터 100까지 더하는 for문을 찾아서 변형하시면 됩니다.
    long result = sumNtoM(4,10);
    
    System.out.println("sumNtoM(4,10) = " + result);
    
    
  }
  
  public static long sumNtoM(long x, long y)
  {
    long sum=0;
    for(long i=x; i<=y; i++){
        sum=sum+i;
    }
    return sum;
// 4+5+6+7+8+9+10
// 0+x/ x=x+(x+1) / x+1 = x+1 + x+2
    }


  // 메소드 정의 sumNtoM(4,10) => 4부터 10까지 더하기
  
}