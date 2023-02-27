package Q8;

public class SharedThread extends Thread{
    StringBuffer sb;
SharedThread(StringBuffer sb){
  this.sb=sb;

}
public void run(){
    synchronized(sb){
           System.out.print(Thread.currentThread().getName());
           for(int i=0;i<=100;i++){
            System.out.print(sb);
           }
           System.out.println();
         sb.setCharAt(0,(char) (sb.charAt(0)+1));
    }
}
public static void main(String[] args) {
    StringBuffer sb = new StringBuffer("H");
    SharedThread t1 = new SharedThread(sb);
    SharedThread t2= new SharedThread(sb);
    SharedThread t3 = new SharedThread(sb);
    t1.start();
    t2.start();
    t3.start();
}
}
