package object.day5;

public class Rectangle {

 String shapeName;
 int width;
 int height;



 public int getArea(){
  return width*height;
 }
 public int getLength(){
  return width*2+height*2;
 }
 public String draw(){
  return shapeName+"("+width+"x"+height+")";
 }
}
