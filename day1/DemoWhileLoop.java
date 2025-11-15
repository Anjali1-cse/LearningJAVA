class DemoWhileLoop{
          public static void main(String[] args){
          int number=96;
          boolean flag = true;
          int i = 2 ;
          while(i<number){
               if(number%i==0){
                   flag= false;
                   break;
               }
               i++;
          }
          if(flag)
             System.out.println("num is prime.");
          else
             System.out.println("num is not prime.");

          }


}