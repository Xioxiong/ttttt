package extend;

public class Cat extends Animal{

    @Override
    public void run() {
        super.run();
    }

    @Override
    public void eat() {
        super.eat();
    }

    public void miao(){
        System.out.println("喵喵喵！");
    }
}
