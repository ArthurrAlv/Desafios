public class Main {

	public static void main(String[] args) throws Exception {
		String texto = "";
		char c;
		int v1=0,v2=0;
		for (int i = 0; i < 18; i++) {
			c=texto.charAt(i);
			if(c=='>')
				v1=v1+1;
			else {
				v2=v2+1;
				}
			}
		System.out.println("há "+v1+" itens >\n"+"há "+v2+" itens <");
		}
		

	
	
}