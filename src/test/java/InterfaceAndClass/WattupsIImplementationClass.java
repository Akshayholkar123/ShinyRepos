package InterfaceAndClass; 


class WattupsIImplementationClass implements WattusInterface
{

	  public static void main(String[] args) {
		  WattupsIImplementationClass obj=new WattupsIImplementationClass();
		  obj.send();
	}
	public void send() {
System.out.println("send mtd implemented in WattupsIImplementationClass");		
	}
	
}