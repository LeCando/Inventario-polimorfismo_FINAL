import java.util.List;
import java.util.Scanner;

public class Inventario {


    public void agregarProducto(List<Productos> listaProductos){

        String opcion="null" ;

        Scanner sc = new Scanner(System.in);
        do {
            int instrumento = 0;
            System.out.println("\nINGRESE UNA OPCIÓN (1=Viento, 2=Cuerda, 3=Percusion");
            instrumento = sc.nextInt();
            switch (instrumento){
                case 1:

                    Viento viento = new Viento();
                    viento.ingresarDatos();
                    listaProductos.add(viento);
                    System.out.println("Producto "+viento.getNombre()+" ingresado");
                    System.out.println("==================================================================");
                    System.out.println("¿Desea agregar otro producto? (si/no)");
                    opcion=sc.next().toLowerCase();

                    break;

                case 2:

                    Cuerda cuerda = new Cuerda();
                    cuerda.ingresarDatos();
                    listaProductos.add(cuerda);
                    System.out.println("Producto "+cuerda.getNombre()+" ingresado");
                    System.out.println("==================================================================");
                    System.out.println("¿Desea agregar otro producto? (si/no)");
                    opcion=sc.next().toLowerCase();

                    break;

                case 3:

                    Percusion percusion = new Percusion();
                    percusion.ingresarDatos();
                    listaProductos.add(percusion);
                    System.out.println("Producto "+percusion.getNombre()+" ingresado");
                    System.out.println("==================================================================");
                    System.out.println("¿Desea agregar otro producto? (si/no)");
                    opcion=sc.next().toLowerCase();

                    break;
            }

        }while(opcion.equals("si"));
    }
    public void eliminarProducto(List<Productos> listaProductos){

        String codigo ="";
        Scanner sc = new Scanner(System.in);
        char encontrado = 'F';
        do {
            System.out.println("Ingrese el código del producto que desea eliminar o escriba salir:");
            codigo = sc.next();

            for (Productos producto : listaProductos) {

                if (producto.getCodigo().equals(codigo)) {

                    if (producto instanceof Viento){
                        Viento viento = (Viento) producto;
                        listaProductos.remove(viento);
                        encontrado= 'T';
                        System.out.println("PRODUCTO ELIMINADO");
                        break;
                    } else if (producto instanceof Cuerda) {
                        Cuerda cuerda = (Cuerda) producto;
                        listaProductos.remove(cuerda);
                        encontrado= 'T';
                        System.out.println("PRODUCTO ELIMINADO");
                        break;

                    } else if (producto instanceof Percusion) {
                        Percusion percusion = (Percusion) producto;
                        listaProductos.remove(percusion);
                        encontrado= 'T';
                        System.out.println("PRODUCTO ELIMINADO");
                        break;

                    }
                }
            }
            if(codigo.equals("salir")){
                encontrado='T';
            }
        } while (encontrado=='F');
    }
    public void imprimirTodosProductos(List<Productos> listaProductos){
        for (Productos producto : listaProductos) {

            if (producto instanceof Viento) {
                System.out.println("Producto: " + producto.getNombre());
                System.out.println("Codigo: " + producto.getCodigo());
                System.out.println("Marca: " + producto.getMarca());
                System.out.println("Color: " + producto.getColor());
                System.out.println("Calidad: " + producto.getCalidad());
                System.out.println("Precio: " + producto.getPrecio());
                System.out.println("Stock: " + producto.getStock());
            }else if (producto instanceof Cuerda) {
                System.out.println("Producto: " + producto.getNombre());
                System.out.println("Codigo: " + producto.getCodigo());
                System.out.println("Marca: " + producto.getMarca());
                System.out.println("Color: " + producto.getColor());
                System.out.println("Calidad: " + producto.getCalidad());
                System.out.println("Precio: " + producto.getPrecio());
                System.out.println("Stock: " + producto.getStock());

            } else if (producto instanceof Percusion) {
                System.out.println("Producto: " + producto.getNombre());
                System.out.println("Codigo: " + producto.getCodigo());
                System.out.println("Marca: " + producto.getMarca());
                System.out.println("Color: " + producto.getColor());
                System.out.println("Calidad: " + producto.getCalidad());
                System.out.println("Precio: " + producto.getPrecio());
                System.out.println("Stock: " + producto.getStock());

            }
        }
    }
    public void imprimirProducto(List<Productos> listaProductos){

        String codigo =" " ;
        Scanner sc = new Scanner(System.in);
        char encontrado = 'F';
        do {
            System.out.println("Ingrese el código del producto que desea ver o escriba salir:");
            codigo = sc.next();

            for (Productos producto : listaProductos) {

                if (producto.getCodigo().equals(codigo)) {

                    if (producto instanceof Viento){
                        System.out.println("Producto: " + producto.getNombre());
                        System.out.println("Codigo: " + producto.getCodigo());
                        System.out.println("Marca: " + producto.getMarca());
                        System.out.println("Color: " + producto.getColor());
                        System.out.println("Calidad: " + producto.getCalidad());
                        System.out.println("Precio: " + producto.getPrecio());
                        System.out.println("Stock: " + producto.getStock());
                        break;
                    } else if (producto instanceof Cuerda) {
                        System.out.println("Producto: " + producto.getNombre());
                        System.out.println("Codigo: " + producto.getCodigo());
                        System.out.println("Marca: " + producto.getMarca());
                        System.out.println("Color: " + producto.getColor());
                        System.out.println("Calidad: " + producto.getCalidad());
                        System.out.println("Precio: " + producto.getPrecio());
                        System.out.println("Stock: " + producto.getStock());
                        break;

                    } else if (producto instanceof Percusion) {
                        System.out.println("Producto: " + producto.getNombre());
                        System.out.println("Codigo: " + producto.getCodigo());
                        System.out.println("Marca: " + producto.getMarca());
                        System.out.println("Color: " + producto.getColor());
                        System.out.println("Calidad: " + producto.getCalidad());
                        System.out.println("Precio: " + producto.getPrecio());
                        System.out.println("Stock: " + producto.getStock());
                        break;

                    }
                }
            }
            if(codigo.equals("salir")){
                encontrado='T';
            }
        } while (encontrado=='F');
    }
}