
package testexception.handeling;
 

public class myexce extends Exception {
    private final String sms;
    public myexce (){
        super("masage");
        
        sms=null;
    }  
    public myexce( String x) {
        
        super(x);
        sms=x;
    }
    public myexce (String x,String t)
    {
        super(x,new NullPointerException());
     sms=x;   
    }
    @Override
         public String toString() {
        
             myexce t=new myexce("somethings are wrrong");
             String s=t.getClass().getName()+t.getMessage();
             return s;
    }     
    @Override
    public String getMessage() {
        return sms;
    }
}
