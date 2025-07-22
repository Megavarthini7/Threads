class Threads extends Thread {
  String name;
  Threads(String name) {
    this.name=name;
  }
  public void run (){
    for(int i=1;i<=3;i++) {
      System.out.println(name+" iteration : "+i);
      try {
        Thread.sleep((int)(Math.random() * 100));
      }
      
      catch (InterruptedException e) {
        System.out.println("Dynamic");
      }
    }
  }
}

public class ThreadsEg {
  public static void main(String[] sel){
    Threads t1=new Threads("Thread one");
    Threads t2=new Threads("Threads two");
    t1.start();
    t2.start();
  }
  
}
