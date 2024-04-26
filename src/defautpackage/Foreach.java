// foreach - para cada

package defautpackage;

public class Foreach {
	
	public static void main(String[] args) {
		String jvm = "Java Virtual Machine";
		
			for (char letra : jvm.toCharArray()) {
				System.out.println(letra);
				// System.out.print(letra);
				// Imprime as letras uma do lado da outra
			}

	}

}
