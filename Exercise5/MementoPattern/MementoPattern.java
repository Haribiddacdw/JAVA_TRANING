package MementoPattern;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/*@author Hari Prasath V
 *  @version 1.0
  */
public class MementoPattern {
	public static void main(String[] args)throws Exception {

		Phone myPhone=new Phone();
		System.out.println("Phone Charge Percentage Now:"+myPhone.chargePercentage);
		new WriteObject().writeObject(myPhone);
		System.out.println("Using the phone for 1 Hour ");
		myPhone.chargePercentage=66;
		System.out.println("After Using the phone for 1 Hour now the Battery Percentage is :"+myPhone.chargePercentage);
		
		System.out.println("now Charging the Phone");
		
		Phone myPhoneAfterCharging=new ReadObject().readObject("new.dat");
		System.out.println("After charging now the Battery Percentage is "+myPhoneAfterCharging.chargePercentage);
		
	}
}
class Phone implements Serializable{
	int chargePercentage=100;
}
class WriteObject {
	public void writeObject(Phone  laddu) throws Exception{
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("new.dat"))) {
			oos.writeObject(laddu);
		}
	}
}
class ReadObject {
	public Phone  readObject(String filename) throws Exception{
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
			return (Phone )ois.readObject();
		}
	}
}


//save and restore the previous state of object without revealing the implementation