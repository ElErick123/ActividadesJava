package practicapersona1;
public class Persona {
    private String nombre, apellidos;
    protected int edad;
    public Persona (String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    public String getNombre () {
        return this.nombre;
    }
    public void setNombre (String nombre) {
        this.nombre = nombre;
    } 
    public String getApellidos () {
        return this.apellidos;
    }
    public void setApellidos (String apellidos) {
        this.apellidos = apellidos;
    }
    public int getEdad () {
        return this.edad;
    }
    public void setEdad (int edad) {
        this.edad = edad;
    }
    public void caminar () {
        System.out.println(this.nombre+ " esta caminando...");
    }
    public void duerme () {
        System.out.println(this.nombre+ " esta durmiendo...");
    }
}
