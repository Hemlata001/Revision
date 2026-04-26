interface Bird{
    void fly();
    void eat();
}

class Sparrow implements Bird{
    public void fly(){
        System.out.println("Sparrow Flying");
    }
    public void eat(){
        System.out.println("Sparrow Eating");
    }
}
public class Main
{
    public static void doBirdStuff(Bird b){
        b.eat();
        b.fly();
        b.eat();
    }
	public static void main(String[] args) {

		doBirdStuff(new Sparrow());
	}
}
