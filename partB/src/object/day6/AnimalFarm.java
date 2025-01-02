package object.day6;

public class AnimalFarm {

    public static void main(String[] args) {
        Animal maru=new Animal("DOG", "마루", 12, "브라운");
        Animal pepper=new Animal("CAT", "후추", 12, "블랙");
        Animal donald=new Animal("DUCK", "도날드", 12, "블랙");
        System.out.println(maru.toString());
        System.out.println(pepper.toString());
        System.out.println(donald.toString());
    }
}
