import java.util.regex.Pattern;

public class AddtwoNumbers {

	public static void main(String[] args) {

		int a = 26;
		int b = 36;
		int[] ab=new int[2];
		char[] ch1 = String.valueOf(a).toCharArray();
		char[] ch2 = String.valueOf(b).toCharArray();
		System.out.println(ch1);
		int k=1;
		int carry=0;
		for(int i=ch1.length-1;i!=-1;i--)
		{
			    int j=i;
				int c=Character.getNumericValue(ch1[i])+Character.getNumericValue(ch2[j]);
				if(c>10)
				{
					 carry=c/10;
					int result=c%10;
					ab[k]=result;
					System.out.println(result);
					k--;
				}
				else
				{
					System.out.println(c);
					ab[k]=c+carry;
				}
				
				
			
		}
		System.out.println(ab[0]);
		System.out.println(ab[1]);
		System.out.println(ab.toString());
		
		String no="";
		
		for(int i=0;i<ab.length;i++)
		{
			no=no+ab[i];
		}

		System.out.println(no);
	}

}
