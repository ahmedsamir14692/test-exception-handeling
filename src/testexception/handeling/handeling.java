
package testexception.handeling;

public class handeling{
    // propagtor
    public static void amal ()throws RuntimeException  {
        
       
        // مش هترمي اكسبشن
        // autmatic catched
    }
          public static void cosamal ()throws myexce {
        
        System.out.println("must be catched");
        
    }    
            public static void teezamal ()throws myexce {
        throw new myexce();
        
    } 
              public static void teezamal2 (int x )throws RuntimeException,myexce {
        // must be catched
        if(x==5)
        {
            throw new myexce ();
            
        }
        
    }
            
            
            public static void amalgamda () {
        
        throw new RuntimeException();
        // must throw exception
        // بترمي من عغير سروس
    }
           public static void amalgamdaawe () {
        
        throw new myruntimeex();
        // must throw exception
        // بترمي من عغير سروس
    } 
           
           public static void shimaa_agmal ()throws myexce{
               
              throw new myexce ("exceptin",null);
               
           }
              public static void shimaa_agmal_higa ()throws myexce{
               
              myexce h= new myexce ();
               h.initCause(new NumberFormatException());
               throw h;
              
           }
       ///////////////////////////////////////////////
            // curer
            
      public static void warkamal(int x)
      {
          try {
              if(x==5) 
                  throw new myexce ();
          }
          catch (myexce e)
          {
              System.out.println(e.getMessage());
              
              
          }          
           finally{
              
              System.out.println("finalyyyy");
              
          }
          
      }
        public static void amalgamdaawee ( int x ) {
       try{ if (x==5)
        throw new myruntimeex();}
      finally{
            
            System.out.println("amal moza fasha5");
             // finally block must be excute even htere is no 
             // Exception thrown
        }
       
       
    } 
        
        @Deprecated 
        /**
         * this oldfasfioned method
         */
        public static void Deprecatedmethodetest ()
        {
            
            
        }
      // @SuppressWarnigs
          public static void warnigmethode (){
              
              
          }
          
          public static void retur (int x)
          {
              try {
                  if (x==7)
                      return; 
                      System.out.println("with out return");        
              }
              
              finally{
                  
                  System.out.println("with return ");
              }
          }
}
