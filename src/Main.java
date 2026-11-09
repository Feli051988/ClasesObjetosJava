
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// crear objetos

		// 1.- utilizando contructor vacio
		Cliente cliente1 = new Cliente();

		// aginacion de valores
	/*	cliente1.id = 1;
		cliente1.nombre = "Felipe";
		cliente1.app = "Morales";
		cliente1.edad = 39;
		cliente1.sexo = "M";
		cliente1.correo = "correo@gmial.com";

		System.out.println("ID: " + cliente1.id);
		System.out.println("Nombre: " + cliente1.nombre);
		System.out.println("App: " + cliente1.app);
		System.out.println("Edad: " + cliente1.edad);
		System.out.println("Sexo: " + cliente1.sexo);
		System.out.println("Correo: " + cliente1.correo);
		
		*/

		// 2.- instancia de objetos con contructor con parametros

		Cliente cliente2 = new Cliente(2, "Juan", "Perez", 40, "M", "correo@hotmail.com");
		System.out.println("Cliente: " + cliente2);
		
		// --> Cliente@77459877  --> es la forma de como se almacena en memoria --> 
		
		// 3.- encapsulamiento 
		Cliente cliente3 = new Cliente();
		
		// SET 
		cliente3.setId(3);
		cliente3.setNombre("Mario");
		cliente3.setApp("Perez");
		cliente3.setEdad(40);
		cliente3.setSexo("M");
		cliente3.setCorreo("test@gmail.com");
		
		// GET 
		System.out.println("ID: " + cliente3.getId());
		System.out.println("Nombre: " + cliente3.getNombre());
		System.out.println("App: " + cliente3.getApp());
		System.out.println("Edad: " + cliente3.getEdad());
		System.out.println("Sexo: " + cliente3.getSexo());
		System.out.println("Correo: " + cliente3.getCorreo());
		
	}

}
