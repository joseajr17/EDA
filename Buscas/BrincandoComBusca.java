package atividade01;


public class BrincandoComBusca {
    public static void main (String []args){
        Busca_IF b = new Busca();

		//PRIMEIRO: VETOR GERADO + Num que vai buscar
        int tamanho = 11; //Declare o tamanho do vetor gerado aqui aqui
        int[] vetor = b.geraVetorNumericoOrdenado(tamanho);
        int numeroParaBuscar = -1; //Num que vai buscar

		/*for(int i=0; i<tamanho; i++ ) {
          System.out.println(vetor[i]);
        }*/


		//SEGUNDO: BUSCA LINEAR ITERATIVA
        long antes1, depois1;
        antes1 = System.nanoTime();
        System.out.println(b.buscaLinear_iterativa(vetor, numeroParaBuscar));
        depois1 = System.nanoTime();
        System.out.println("Tempo da Busca Linear Iterativa: " + (depois1 - antes1));


		//TERCEIRO: BUSCA LINEAR RECURSIVA
        long antes2, depois2;
        antes2 = System.nanoTime();
		System.out.println(b.buscaLinear_recursiva(vetor, numeroParaBuscar));
		depois2 = System.nanoTime();
		System.out.println("Tempo da Busca Linear Recursiva: " + (depois2 - antes2));
		

		//QUARTO: BUSCA BINARIA ITERATIVA
        long antes3, depois3;
		antes3 = System.nanoTime();
        System.out.println(b.buscaBinaria_iterativa(vetor, numeroParaBuscar));
        depois3 = System.nanoTime();
        System.out.println("Tempo da Busca Binaria Iterativa: " + (depois3 - antes3));


        //QUINTO: BUSCA BINARIA RECURSIVA
        long antes4, depois4;
        antes4 = System.nanoTime();
		System.out.println(b.buscaBinaria_recursiva(vetor, numeroParaBuscar));
		depois4 = System.nanoTime();
		System.out.println("Tempo da Busca Binaria Recursiva: " + (depois4 - antes4));
    }
}
