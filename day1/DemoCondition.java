/*class DemoCondition{
        public static void main(String [] args){   
               int number= 2;
               
               if(number==1)
                   System.out.println("ONE");
               
               else if (number==2)
                   System.out.println("Two"); 
               
               else if (number==2)
                   System.out.println("Three"); 
               
               else
                   System.out.println("invalid"); 

        }
  
}*/

class DemoCondition{
        public static void main(String [] args){   
               int number= 2;
               
               switch(number){
               case 1: System.out.println("ONE");
                       break;
               case 2: System.out.println("Two");
                       break;
               case 3: System.out.println("Three");      
                        break;
               default: System.out.println("invalid"); 
                         break;
              }
                   
               
                                
        }
  
}