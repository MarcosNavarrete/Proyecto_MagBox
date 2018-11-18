import java.util.ArrayList;
import java.util.Scanner;
public class Cliente {
	private String nombre;
	private String rut;
	private String contacto; 
        
	private ArrayList<Cotizacion> cotizacion = new ArrayList<Cotizacion>();
        
        public Cliente(){
            pedirDatos();
            crearCotizacion();
        }
        public String getNombre(){
        return this.nombre;
        }
        public String getRut(){
            return rut;
        }
        public String getContacto(){
            return contacto;
        }
        public void crearCotizacion(){
         Cotizacion e = new Cotizacion(nombre,rut,contacto); // en la cotizacion se pide el ingreso de la descripcion y el tipo de servicio
            this.cotizacion.add(e);                             // y se guardan ademas los datos del cliente
        }
        
        public void pedirDatos( ){
        Scanner sc = new Scanner(System.in);    
        Validar val = new Validar();
            do {
                        System.out.println("Ingrese su nombre ");
                        nombre = sc.next();
                        if (!val.validarNombre(nombre)){
                            System.out.println("Asegurese de estar ingresando un nombre correcto(La primera letra tiene que ser Mayuscula)");                            
                        }
                        }while(!(val.validarNombre(nombre)));
            setNombre(nombre);
                    do {
                        System.out.println("Ingrese su rut ");
                        rut = sc.next();
                        if (!val.validarRut(rut)){
                            System.out.println("Asegurese de estar ingresando un rut correcto)");                            
                        }
                        }while(!(val.validarRut(rut)));
            setRut(rut);
            do {
                        System.out.println("Ingrese su numero de celular ");
                        contacto = sc.nextLine();
                        if (!val.validarContacto(contacto)){
                            System.out.println("Asegurese de estar ingresando un numero correcto");                            
                        }
                        }while(!(val.validarContacto(contacto)));
            setContacto(contacto);
            
        }
	
        private void setNombre(String nombre) {
                this.nombre = nombre;
	}

	private void setRut(String rut) {
		this.rut = rut;
	}

	private void setContacto(String contacto) {
		this.contacto = contacto;
	}
}
	
	