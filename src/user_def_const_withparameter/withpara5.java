package user_def_const_withparameter;

public class withpara5 {

	int mark;
     int per;
     withpara5(int x,int y)
     {
    	 mark=x;
    	 per=y;
     }
   public void qwe() {
	System.out.println(mark+per);
	 System.out.println(per-mark);  
}  
     public static void main(String[] args) {
		
    	 withpara5 rat=new withpara5(100,50);
    	 rat.qwe();
    	 withpara5 fat=new withpara5(110,45);
    	 fat.qwe();

    	 withpara5 bat=new withpara5(200,51);
    	 bat.qwe();

    	 withpara5 mat=new withpara5(150,60);
    	 mat.qwe();

    	 withpara5 cat=new withpara5(170,55);
    	 cat.qwe();

	}
     
     
     
     
     
     
     
     
     
     
     
     
     
     
}
