
// Clase es un platilla donde se esttructura atributos y metodos de un objeto 
public class Cliente {
	
	/* POJOS : SON OBJETOS SIMPLES, SIGNIFICA QUE NO DEPENDEMOS DE NUNGUN API, ES DECIR TENEMOS QUE CREAR MANUALEMENTE 
	 * TODOS LO QUE CESITAMOS EN ESTA CLASE 
	 * 
	 *  1.- ATRIBUTOS 
	 *  2.- CONTRUCTOR VACIO 
	 *  3.- CONSTRUCTOR CON  PARAMETROS 
	 *  4.- METODOS TOSTRING 
	 *  5.- ENCAPSULAMIENTO 
	 *  
	 *  JAVA APPLICATTION 
	 *  
	 *  --> CUANDO DEPENDEO DE UNA API --> JPA, MOKITO, LOMBOOK -->ACTIBIDAD EMPRESARTUAL --> EN LA 4 SEMANA 
	 * 
	 * 
	 * 
	 * */
	
	// atributos: caracteristicas de un objeto 
	
	 private int id;
	 private String nombre;
	 private String app;
	 private int edad;
	 private String sexo;
	 private String correo;
	
	// conrructor -> es un metodo especial que sirve para iniciar un objeto y sus valores -> instancia de clase
	// new Cliente();
	public Cliente() {
		
	}

	// contructor con parametros -> iniciar un objeto y sus valores 
	public Cliente(int id, String nombre, String app, int edad, String sexo, String correo) {
	
		this.id = id;
		this.nombre = nombre;
		this.app = app;
		this.edad = edad;
		this.sexo = sexo;
		this.correo = correo;
	}

	// toString --> convierte en cadena cuaquier objeto en java
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", app=" + app + ", edad=" + edad + ", sexo=" + sexo
				+ ", correo=" + correo + "]\n";
	}

	// encpasulamiento 
	/* --> esta conformado por funciones y procedimientos 
	 * 
	 *  -> una funcion tiene valor de retorno  --> Get para obtener
	 *  public int getId() {
		return id;
	      }
	 *  
	 *  -> un procedimiento no tiene valor de retorno  -> set para enviar actualizar
	 *  public void setId(int id) {
		this.id = id;
	    }
	 * 
	 * */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
	
	

}
