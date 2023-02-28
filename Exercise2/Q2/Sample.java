package Q2;

public class Sample {
    public void mth1() {
        mth2();
        System.out.println("caller");
    }

    public void mth2() {
        try {
            // return;
          int a = 4/0;
          System.out.println(a);
        } catch (Exception e) {
            System.out.println("catch-mth2");
        } finally {
            System.out.println("finally-mth2");
        }
    }

    
    public static void main(String p[]) {
        Sample s = new Sample();
        s.mth1();
    }
}
