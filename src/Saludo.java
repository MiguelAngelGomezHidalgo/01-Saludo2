import javax.swing.JOptionPane;
/**
 * 
 * @author Miguel Angel Gomez Hidalgo 
 *
 */
public class Saludo {
	
 public static void main(String[] args) {
	 String nombre = "Miguel";
		Object edad = "22";
		//System.out.println("Hola: " + nombre );
		//System.out.printf("Hola: %s", nombre);
		JOptionPane.showMessageDialog(null, String.format("Hola: %s tu edad es %s años de edad", nombre, edad ));

	
}
}
