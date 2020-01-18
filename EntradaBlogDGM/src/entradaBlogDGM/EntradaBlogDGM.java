package entradaBlogDGM;

/**
 * Clase para manejar las entradas de un blog.
 * @author Daniel Guardia Martinez
 * @version 1.0, 18/01/2019
 * @since entradaBlogDGM 1.0
 */
public class EntradaBlogDGM {
	
	/**
	 * Creacion de los atributos de la clase, id de entrada, autor de la entrada, texto de la entrada
	 */
	public static char separador=':';
	private int id;
	private String texto;
	private String autor;
	
	/**
	 * Constructor de la clase. recibe el número de entrada, el nombre del autor
	 * de la entrada y el texto que contiene la entrada. Si el número de entrada
	 * es negativo, lanza una excepción.
	 * @param id identificacion de la entrada
	 * @param autor nombre del autor de la entrada
	 * @param texto comentario de entrada en el blog
	 * @throws IllegalArgumentException si el id de entrada es negativo se devuelve excepcion 
	 * @since entradaBlogDGM 1.0
	 */
	public EntradaBlogDGM(int id,String autor,String texto)throws IllegalArgumentException{
		if(id<=0) throw new IllegalArgumentException("El id no puede ser negativo");
		this.id=id;
		this.autor=autor;
		this.texto=texto;
	}

	/**
	 * Reescbribir el metodo toString para devolver la informacion de la entrada 
	 * @return mensaje del autor de la entrada y texto
	 * @since entradaBlogDGM 1.0
	 */
	@Override
	public String toString(){
		String cad="";
		cad+="\nENTRADA DE"+separador+autor;
		cad+="\n "+texto;
		return cad;
	}
	
	/**
	 * Devuelve el número de la entrada 
	 * @return id entrada
	 * @since entradaBlogDGM 1.0
	 */
	public int getId(){
		return this.id;
	}
	
	/**
	 * Devuelve el texto completo de la entrada 
	 * @return texto de la entrada al blog
	 * @since entradaBlogDGM 1.0
	 */
	public String getTexto(){
		return this.texto;
	}
	
	/**
	 * devuelve el nombre del autor de la entrada en mayúsculas
	 * @return nombre del autor de la entrada
	 * @since entradaBlogDGM 1.0
	 */
	public String getAutor(){
		return this.autor.toUpperCase();
	}
	
	/**
	 * devuelve el nombre del autor. Ya no se usa
	 * @return nombre del autor
	 * @deprecated usar getAutor()
	 */
	@Deprecated
	public String devuelveAutor(){
		return this.autor;
	}
	
	/**
	 * Metodo main del programa que instancia un objeto de la clase EntradaBlog con valores e imprime
	 * los datos segun se se ha sobrecardo el metodo toString.
	 * @param args no recibe argumentos
	 */
	public static void main(String[] args) {
       
		EntradaBlogDGM e1=new EntradaBlogDGM (3,"Dani","Últimas noticias, está disponible BixBy 2.0");
		System.out.println(e1);
	}
}