public class deadlock {

        public static Object lock1 =  new Object();
        public static Object lock2 =  new Object();

        public static void main(String[] args) {


                Thread t1 = new Thread(()->{
                        System.out.println("t1 request lock1" );
                      synchronized (lock1){
                              System.out.println("t1 gets lock1" );
                              try{
                                      Thread.sleep(100);
                              }catch (Exception e){
                                      e.printStackTrace();
                              }
                              System.out.println("t1 request lock2" );
                              synchronized (lock2){
                                        System.out.println("t1 gets lock2" );
                              }
                      }
                });
                Thread t2 = new Thread(()->{
                        System.out.println("t2 request lock2" );
                        synchronized (lock2){
                                System.out.println("t2 gets lock2" );
                                try{
                                        Thread.sleep(100);
                                }catch (Exception e){
                                        e.printStackTrace();
                                }
                                System.out.println("t2 request lock1" );
                                synchronized (lock1){
                                        System.out.println("t2 gets lock1" );
                                }
                        }
                });

                t1.start();
                t2.start();

        }

}