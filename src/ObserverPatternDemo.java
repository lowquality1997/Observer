
 public class ObserverPatternDemo {

	 public static void main(String[] args) {
		// TODO Auto-generated method stub
   Subject subject = new Subject();

  new BinaryObserver(subject);
  new OctalObserver(subject);


System.out.println("First state change: 15");
subject.setState(15);
subject.setState(10);
subject.setState(+10);	
	 }

}
