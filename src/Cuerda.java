import java.util.Scanner;

public class Cuerda extends Productos {

    public Cuerda() {
    }

    public Cuerda(String nombre, String codigo, String marca, String color, String calidad, double precio, int stock) {
        super(nombre, codigo, marca, color, calidad, precio, stock);
    }

    @Override
    public void ingresarDatos(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto: ");
        this.nombre = sc.next();
        System.out.println("Ingrese el codigo del producto: ");
        this.codigo = sc.next();
        System.out.println("Ingrese la marca del producto");
        this.marca = sc.next();
        System.out.println("Ingrese el color del producto");
        this.color = sc.next();
        System.out.println("Ingrese la calidad del producto");
        this.calidad = sc.next();
        System.out.println("Ingrese el precio del producto");
        this.precio = sc.nextDouble();
        System.out.println("Ingrese el stock del producto");
        this.stock = sc.nextInt();

    }
}
