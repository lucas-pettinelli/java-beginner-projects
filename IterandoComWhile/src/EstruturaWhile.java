
public class EstruturaWhile {
	public static void main(String[] args) {
//		int i = 0;
//		while(i < 10) {
//			System.out.println("Um texto qualquer");
//		}
//	}
		
//	int i = 0;
//	while(i < 10) {
//		if(i == 5) {
//			System.out.println("Vai parar aqui.");
//			break;
//		}
//		System.out.println(i + ": Um texto qualquer");
//		i++;
//	}
//	}
		int i = 0;
		while(i < 10) {
			if(i == 5) {
				System.out.println("Vai pular e continuar aqui...");
				i++;
				continue;
			}
			System.out.println(i + ": Um texto qualquer.");
			i++;
		}
	}
}
