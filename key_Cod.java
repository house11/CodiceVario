import java.*;
import java.io.*;
class Key_Cod
{
	static String  p_co="";
	static String  p_de="";

	static int cod [] = {33,35,36,37,38,40,41,43,45,48,49,50,51,52,53,54,55,56,57,61,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,
				 87,88,89,90,91,93,94,95,96,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122};

				
	public static void main(String[] args) {
		
		String parola="";
		int i=0;
		while(i<args.length){
		parola=args[i];
		i++;
		}
	
		getCodifica(parola);
		//getCo();
		//getCod();
		
	}
	public static void getCo()
	{
		for (int i=60 ; i <126 ;i++){ System.out.print(","+i);}
	}
public static void getCod()
{
	for (int i=0; i<cod.length; i++) {
		System.out.println(cod[i]+ "  = = = "+(char)cod[i]);
	}
}

	public static void getCodifica(String p)
		{

		for (int i=0; i<p.length(); i++) 
			{
				char parola = p.charAt(i);
				int x =(int) parola;
				
				System.out.print(x);
				System.out.print("  "+(char) x+"  ");
				
				int g=0,cont=0;
				while(true)
				{
					
					if(x==cont)
					{
						p_co+=(char)cod[g];
						break;
					}
				g++;
				if(g>=cod.length)
					{
						g=0;
					}
				cont++;
				
				}
				
			
			}
			System.out.println( "\n--"+p_co+"\n");
		try{
			new File(p_co).createNewFile();
		}catch(IOException g){}
	}
	
	
}