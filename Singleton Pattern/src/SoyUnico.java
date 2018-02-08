public class SoyUnico {

    private static String nombre;

    private static SoyUnico soyunico;


    public static SoyUnico getInstance(String nombre) {

        if (soyunico == null){

            soyunico = new SoyUnico(nombre);
        }else{
            System.out.println("Ya existe un objeto de esta clase");
        }

        return soyunico;
    }

    private SoyUnico(String nombre) {

        this.nombre= nombre;
        System.out.println("Soy:" + this.nombre);
    }




}
