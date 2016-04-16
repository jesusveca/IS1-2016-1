import pila.pila;

public class HolaMundo {
	public static void main(String[] args) throws Exception{
		System.out.println("hola IS1!");
		pila<Object> p = new pila<Object>(1000);
		p.push(5);
                p.push(3);
                p.push(1);
                p.push(10);
		System.out.println(p.pop());
	}
}