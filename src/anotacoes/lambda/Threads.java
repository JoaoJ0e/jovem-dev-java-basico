package anotacoes.lambda;

public class Threads {

	public static void main(String[] args) {
		
		// Exclusivo para interfaces funcionais
		// , possuem apenas um método
		
		
//		Thread t = new Thread(new Runnable()) {
//			
//			@Override
//			public void run() {
//				for (int i = 0; i < 100; i++) {
//					System.out.println(i);
//				}
//			}
//		};

//		Runnable r1 = () -> {
//			for (int i = 0; i < 100; i++) {
//				System.out.println(i);
//			}
//		};
		
		Thread t = new Thread(() -> {
			for (int i = 0; i < 100; i++) {
				System.out.println(i);
			}
		});
		
		
		
		System.out.println("Iniciando thread");
		t.start();
		System.out.println("Fim");
		
	}

}
