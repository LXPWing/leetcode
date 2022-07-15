package ThreadLocal学习;

public class Main {

    public static void main(String[] args) {

        test t = new test();

        new Thread(()->{
            for(int i=0;i<5;i++){
                t.addNum();
            }
            System.out.println("t1 num:" + t.getNum());
        },"t1").start();

        new Thread(()->{
            for(int i=0;i<8;i++){
                t.addNum();
            }
            System.out.println("t2 num:" + t.getNum());
        },"t2").start();

        new Thread(()->{
            for(int i=0;i<10;i++){
                t.addNum();
            }
            System.out.println("t3 num:" + t.getNum());
        },"t3").start();
    }
}

class test {
    ThreadLocal<Integer> integerThreadLocal = ThreadLocal.withInitial(() -> 0);

    public test(){
        //
    }

    public int getNum(){
        return integerThreadLocal.get();
    }

    public void addNum(){
        integerThreadLocal.set(integerThreadLocal.get() + 1);
    }
}
