abstract class Bird{
    abstract void fly();
    abstract void eat();
}

class Sparrow extends Bird{
    void fly(){
        System.out.println("Sparrow Flying");
    }
    void eat(){
        System.out.println("Sparrow Eating");
    }
}
public class Main
{
	public static void main(String[] args) {

		Bird b = new Sparrow();
		b.fly();
		b.eat();
	}
}
