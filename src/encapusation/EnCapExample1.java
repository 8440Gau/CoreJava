package encapusation;

public class EnCapExample1 {
public static void main(String[] args) {
	
	EnCapExample1 capExample1= new EnCapExample1();
	capExample1.setaccountbalance(100);
	System.out.println(capExample1.fetchbal());
	
}
private long bal;
public long setaccountbalance(long balance) {
	long bal = 0;
	this.bal= balance;
	return bal;
}
private long fetchbal() {
	return this.bal;
}
}
