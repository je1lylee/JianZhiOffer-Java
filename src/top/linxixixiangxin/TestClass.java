package top.linxixixiangxin;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class TestClass {
    public int test;
    public static void main(String args[]) {
        int a;
//        Account account = new Account("Mr.Zhang",0.0);
//        double[] moneyData = new double[]{120.00,300.00,500,700,5000.0};
//        for (int x = 0;x <5;x++){
//            new Thread(() ->{
//                for (int y = 0;y<moneyData.length;y++){
//                    account.saveMoney(moneyData[y]);
//                }
//            }).start();
//        }
//        for (int x = 0;x<5;x++){
//            new Thread(() ->{
//                while (true){
//                    System.err.println(account.toString());
//                }
//            }).start();
//        }
    }


}
class Account{
    private String name;
    private double asset;
    private ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    public Account(String name, double asset) {
        this.name = name;
        this.asset = asset;
    }
    public void saveMoney(double money){
        this.readWriteLock.writeLock().lock();
        try{
            this.asset += money;
            TimeUnit.SECONDS.sleep(2);
            System.out.println(Thread.currentThread().getName() + "is changing asset data:" + money
            +"the current data is:"+this.asset);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            this.readWriteLock.writeLock().unlock();
        }
    }
    @Override
    public String toString() {
        this.readWriteLock.readLock().lock();
        try{
            return "Account info :" + Thread.currentThread().getName() +
                    "Account Name :" + this.name +
                    "Account Asset :" + this.asset;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            this.readWriteLock.readLock().unlock();
        }
    }
}