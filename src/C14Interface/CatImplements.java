package C14Interface;
//implements뒤에는 구현할 인터페이스 명을 적는겨
public class CatImplements implements AnimalInterface1 {
    @Override
    public void makeSounds() {
        System.out.println("야옹");
    }
}
class CatMultiImplements implements AnimalInterface1, AnimalInterface2 {
    @Override
    public void makeSounds() {
        System.out.println("야옹");
    }

    @Override
    public String play(String a, String b) {
        return a + "와" + b + "가 놉니다.";
    }
}
