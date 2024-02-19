
public class OperadorRelacional {
public static void main(String[] args) {
	Boolean tresMaiorQueDois = 3 > 2;
	System.out.println("3 é maior que 2? " + tresMaiorQueDois);
	
	Boolean tresMenorQueDois = 3 < 2;
	System.out.println("3 é menor que 2? " + tresMenorQueDois);
	
	Boolean tresMaiorQueTres = 3 > 3;
	System.out.println("3 é maior 3? " + tresMaiorQueTres);
	
	Boolean tresMaiorOuIgualTres = 3 >= 3;
	System.out.println("3 é mmaior ou igual 3? " + tresMaiorOuIgualTres);
	
	Boolean tresMenorOuIgualTres = 3 <= 3;
	System.out.println("3 é menor ou igual 3? " + tresMenorOuIgualTres);

	Boolean doisIgualADois = 2 == 2;
	System.out.println("2 é igual 2? " + doisIgualADois);
	
	Boolean doisDiferenteDeDois = 2 != 2;
	System.out.println("2 é diferente 2? " + doisDiferenteDeDois);
	
	Integer quatro = 4;
	Boolean quatroMaiorQueQuatro = quatro > quatro;
	System.out.println("Quatro é maior quatro? " +quatroMaiorQueQuatro);
	
	Integer cinco = 5;
	Boolean cincoMaiorOuIgualCinco = cinco >= cinco;
	System.out.println("Cinco é maior ou igual cinco? " +cincoMaiorOuIgualCinco);
	
	Integer seis = 6;
	Boolean seisIgualSeis = seis.equals(seis);
	System.out.println("Seis é equals seis? " + seisIgualSeis);
	
	Integer sete = 7;
	Boolean cincoIgualSete = sete.equals(cinco);
	System.out.println("Seis é equals seis? " + cincoIgualSete);
	
	Integer duzentos = 200;
	Integer duzentos02 = 200;
	Boolean duzentosEqualDuzentos = duzentos.equals(duzentos02);
	System.out.println("Duzentos é equals duzentos? " +duzentosEqualDuzentos);

	Integer trezentos = 200;
	Integer trezentos02 = 200;
	Boolean trezentosIgualTrezentos = trezentos == trezentos02;
	System.out.println("Trezentos é igual trezentos? " +trezentosIgualTrezentos);
}
}
