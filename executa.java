import java.util.Scanner;


public class executa {

	public static void main(String[] args) {
		
		try{
			Scanner leia = new Scanner(System.in);
			int numero1;
			int numero2;
			int resultado;
			 
			System.out.println("informe o primeiro numero: ");
			numero1 = leia.nextInt();
			System.out.println("informe o segundo numero: ");
			numero2 = leia.nextInt();
			
			resultado = numero1 / numero2;
			System.out.println("Resultado da divisão é: "+ resultado);
		}catch(exception e){
			System.out.println("Erro,você informou algum número inválido");
			
		}
		 
		
	}

}
