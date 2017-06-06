package e03;

public class E03 {

    public static void main(String args[])
		{			
	      double sum = 0,a = 1;
	      int i = 1;
	      while(i <= 20)
	      {
	    	  sum = sum+a;
	    	  i = i+1;
	    	  a = a*(1.0/i);
	      }
	      System.out.println(sum);
	    }

}

/*
使用while循环语句计算：1+1/2!+1/3!+......+1/20!之和
*/