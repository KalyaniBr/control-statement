package Arrays;

public class Example5 {
public static void main(String[] args) {
	
	String[][]str= {{"ki","ka","ku"},{"kal","kum","kul"},{"kim","kao","kai"}};
	
	System.out.println(str.length);
	
	System.out.println(str[2][1]);
	
	for(int i=0;i<=2;i++)
	{
		for(int j=0;j<=2;j++)
		{
			System.out.print(str[i][j]+"  ");
		}
	System.out.println();
	}
	
	
}
}
