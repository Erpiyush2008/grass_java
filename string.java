public  class string{
    public static void main(String[] args) {

        
        String str = "hello my name is piyush";
      
        String arr[] = str.split(" ");
        for(String s:arr){
            System.out.println(s);
        }

        String b=str.replace("p","P");
        System.out.println(b);

    }
}