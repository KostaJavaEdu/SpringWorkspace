package sample01;

public class MessageBeanEnImpl implements MessageBean {

	public MessageBeanEnImpl() {
		System.out.println("MessageBeanEnImpl생성자 호출됨...");
	}
	
	@Override
	public void sayHello(String name) {
		System.out.println("Hello~ "+name);
	}
}
