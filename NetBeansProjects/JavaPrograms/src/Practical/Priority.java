package Practical;

class clicker implements Runnable {
long click = 0;
Thread t;
private volatile boolean running = true;
public clicker(int p) {
t = new Thread(this);
t.setPriority(p);
}
public void run() {
while (running) {
click++;
}
}
public void stop() {
running = false;
}
public void start() {
t.start();
}
}
class HiLoPri {
public static void main(String args[]) {
Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
clicker hi = new clicker(Thread.NORM_PRIORITY + 2);
clicker lo = new clicker(Thread.NORM_PRIORITY - 2);
lo.start();
hi.start();
try{
    Thread.sleep(10000);
}catch(Exception e){e.printStackTrace();}
lo.stop();
hi.stop();
try{
hi.t.join();
lo.t.join();
}catch(Exception e)
{e.printStackTrace();}
    System.out.println("Low Priority Thread: "+lo.click);
    System.out.println("High Priority Thread: "+hi.click);
}
}