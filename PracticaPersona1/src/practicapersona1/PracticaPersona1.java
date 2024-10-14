package practicapersona1;
public class PracticaPersona1 {
    String nombre, apellidos;
    int edad;
    public PracticaPersona1 (String nombre, String apellidos, int edad) {
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
    public static void main(String[] args) {
        PracticaPersona1 erick = new PracticaPersona1("Erick", "Caro Cravioto", 16);
        PracticaPersona1 arturo = new PracticaPersona1 ("Arturo", "Carmona Vera", 30);
        erick.caminar();
        erick.duerme();
        arturo.caminar();
        arturo.duerme();
        
    }
}
