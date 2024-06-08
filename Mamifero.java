public class Mamifero
{
    protected String nombre;
    protected Integer edad;
    protected Integer patas;

    public Mamifero(){
        
    }
    
    public Mamifero(String nombre, Integer edad, Integer patas){
        this.nombre = nombre;
        this.edad = edad;
        this.patas = patas;
    }

    public String getNombre(){
        return nombre;
    }
    public Integer getEdad(){
        return edad;
    }
    public Integer getPatas(){
        return patas;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(Integer edad){
        this.edad = edad;
    }
    public void setPatas(Integer patas){
        this.patas = patas;
    }
    
    public void imprimirDatos(){
        System.out.println("El nombre del mamifero es: " + getNombre() + "\n Laedad del mamifero es: " + getEdad() + "\nEl numero de patas es: " + getPatas());
    }
}
