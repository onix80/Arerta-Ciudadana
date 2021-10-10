package dominio;

public class Cliente {
    
    private int idCliente;
    private String nombre;
 
    private String tipo;
    private String categoria;
    private String ciudad;
    private double edad;

    public Cliente() {
    }

    public Cliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Cliente(String nombre, String tipo, String categoria, String ciudad, double edad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.categoria = categoria;
        this.ciudad = ciudad;
        this.edad = edad;
    }

    public Cliente(int idCliente, String nombre, String tipo, String categoria, String ciudad, double edad) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.tipo = tipo;
        this.categoria = categoria;
        this.ciudad = ciudad;
        this.edad = edad;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHurto() {
        return tipo;
    }

    public void setHurto(String tipo) {
        this.tipo = tipo;
    }

    public String getEmail() {
        return categoria;
    }

    public void setEmail(String categoria) {
        this.categoria = categoria;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", tipo=" + tipo + ", categria=" + categoria + ", ciudad=" + ciudad + ", edad=" + edad + '}';
    }
    
}
