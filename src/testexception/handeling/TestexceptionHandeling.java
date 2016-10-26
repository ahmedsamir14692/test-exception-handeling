
package testexception.handeling;


public class TestexceptionHandeling {

    
    public static void main(String[] args) {
        
        in();
       handeling.retur(5);
     handeling.amal(); // autmatic catched but if therare no rubtimes exception occure 
        try{                // no thing will hapen
    handeling.amalgamda();}
        catch ( RuntimeException e)
        {
            
            
        }
                        
       try{                 
    handeling.cosamal();}
       catch(Exception e) {
           
           System.out.println("must be catched ");
           
       }
    finally{
           
           System.out.println("filally action");
       }
       try{
    handeling.teezamal();}
       catch(Exception e) {
           System.out.println(e);
           System.out.println("must be catched ");
           
       }
    finally{
           
           System.out.println("filally action");
       }
       try{
       handeling.teezamal2(4);}
       catch(myexce e) {
           
           System.out.println("must be catched ");
           
       }
    finally{
           
           System.out.println("filally action");
       }
        
    try{
       handeling.teezamal2(5);}
       catch(Exception e) {
           
           System.out.println("must be catched ");
           
       }
    finally{
           
           System.out.println("filally action");
       }
    try
    {
        handeling.shimaa_agmal();
    }
    catch (myexce g)
        
    {
        System.out.println(g);
        System.out.println(g.getCause());
        
        
    }
         try
    {
        handeling.shimaa_agmal_higa();
    }
    catch (myexce g)
        
    {
        System.out.println(g);
        System.out.println(g.getCause());
        
        
    }
           
    //handeling.amalgamda();
     handeling.warkamal(7);
     handeling.warkamal(5);
     handeling.amalgamdaawee(6);
    handeling.amalgamdaawee(5);
   handeling.Deprecatedmethodetest();
    }
    
    private static  void in ()
    {
        
        
    }
}
