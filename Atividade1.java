public class Atividade1{

	public static void main(String[] args){

		//valores iniciais do problema

		int n1 = 38;
		int n2 = 37;
		int d = 1;

		// vetor com 37 posições
		double[] vetor = new double[37];

		//contadores auxiliares
		int cont = 0;
		double soma = 0;


		//variaveis usadas para a soma dos resultados
		double positivos = 0; //armazena todos os valores positivos da sequencia
		double negativos = 0; //armazena todos os valores negativos da sequencia

		double resultado = 0; //resultado final




		//inicio do programa


		//Multiplica todos os dividendos e adiciona no vetor
		while(cont < 37){

			soma = n1 * n2;			
			vetor[cont] = soma;
			n1 = n2;
			n2--;
			cont++;
		}

		//primeiro resultado da sequencia é add na variavel dos positivos, para ficar mais facil os proximos laços (for).
		positivos = vetor[0]; 



		for(int i = 0; i< vetor.length; i++){
			

			//realiza a divisão com os Quocientes de 1 a 37
			vetor[i] = vetor[i] / d;			
			d++;			



			}	
				//começando da do segundo elemento do vetor, somando a cada duas posições, são os valores positivos.
				for(int z = 1; z< 37; z = z+2){
					positivos = positivos + vetor[z];
						
			}

				//a cada duas somas existe a subtração, começando da terceira posição e somando o valor na variavel.
				for(int j = 2; j < vetor.length; j = j+2){
					negativos = negativos + vetor[j]; 

				}

				resultado = positivos - negativos;
				//retirando a soma dos numeros negativos temos o valor total.
				

				System.out.printf("X ---> %f%n",resultado);

			
		}		

						
}

//fim aplicação

			

		
		
