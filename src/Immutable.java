
public final class Immutable {
	public static void main(String[] args) {
		ImmutableDemo immutable = new ImmutableDemo("ABC");
		String a= immutable.getPan();
		System.out.println(a);
		
	}
	

}
 final class ImmutableDemo{
	 private final String Pancard;
	 public ImmutableDemo(String pan) {
	 	this.Pancard= pan;
	 }
	 public String getPan() {
	 	return Pancard;
	 }

 }