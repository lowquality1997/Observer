
public class OctalObserver extends Observer {

	public OctalObserver(Subject subject){
		this.subject = subject;
		this.subject.attach(this);
	}

	public void update() {
		// TODO Auto-generated method stub
System.out.println("Octal String: " +Integer.toOctalString(subject.getState()));
	}


}
