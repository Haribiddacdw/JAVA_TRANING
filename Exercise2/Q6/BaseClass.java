package Q6;

public class BaseClass {
    BaseClass() throws Exception{
        throw new Exception("hii");
    }
    
}
class DerivedClass extends BaseClass{
    DerivedClass() throws Exception{
        
       super();
    }
    public static void main(String[] args) throws Exception{
        
        try {
            DerivedClass derivedClass = new DerivedClass();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}