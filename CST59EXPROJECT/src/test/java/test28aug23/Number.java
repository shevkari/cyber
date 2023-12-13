package test28aug23;

public class Number {

	public static void main(String[] args) {

		for (int orgNo=1; orgNo<=1000000000; orgNo++)
		{
		int  r, sum =1, add =0;
		int No=orgNo;
		while(No!=0)
		{
		r= No % 10;
		for(int i=r; i>=1; i--)
		{
			sum = sum * i;
		}
		add = add + sum;
		No= No/10;
		sum =1;
	}
		if(add==orgNo)
			System.out.println(orgNo + " is Same Number");
		//else
			//System.out.println(orgNo + " is Not Same Number");
	}
	}

}
