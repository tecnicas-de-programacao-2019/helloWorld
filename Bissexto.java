public class Bissexto{
	public boolean anoBissexto(int ano){
		if((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))){
			System.out.println(ano + " eh um ano Bissexto!");
			return false;
		}
		else{
			System.out.println(ano + " nao eh um ano Bissexto!");
			return false;
		}
	}
}
