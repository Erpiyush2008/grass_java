public class pr {
    
    public static void main(String[] args) {
        int n=5;
     int arr[] = {2, 3, 4, 5};

        Thread t1 = new Thread(()->{
       int sum =0;
       for(int i=0;i<=n;i++){
        sum+=i;
       }
       double avg = sum/(n);
       System.out.println(avg);
        });

        Thread t2 = new Thread(()->{

            try {
                t1.join();
            } catch (Exception e) {
            }
            for(int x:arr){
 System.out.println(x*x);
            }
        });

        t1.start();
        t2.start();
    }
}
