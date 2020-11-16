package observerpattern;

public class Youtube {
	
	public static void main(String[] args){
		Channel telusko = new Channel();
		Subscriber s1 = new Subscriber("akshay"); 
		Subscriber s2 = new Subscriber("guru"); 
		Subscriber s3 = new Subscriber("balu"); 
		Subscriber s4 = new Subscriber("krish"); 
		Subscriber s5 = new Subscriber("kumar"); 
				
		telusko.Subscribe(s1);
		telusko.Subscribe(s2);
		telusko.Subscribe(s3);
		telusko.Subscribe(s4);
		telusko.Subscribe(s5);
				
		telusko.unSubscribe(s3);
				
		s1.subscribeChannel(telusko);
		s2.subscribeChannel(telusko);
		s3.subscribeChannel(telusko);
		s4.subscribeChannel(telusko);
		s5.subscribeChannel(telusko);
				
		telusko.upload("how to learn programming??");
	}
}
