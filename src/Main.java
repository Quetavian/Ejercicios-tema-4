// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //Variables
        int numeroIf;
        String Cadena;
        int numeroWhile;
        String estacion;

        //Creamos un número aleatorio entre 100 y -100 (DataType)(Math.random() * RANGO) + MIN
        numeroIf = (int) (Math.random() * 200) + (-100);

        //Ahora comprobamos si es positivo, igual a cero o negativo
        if (numeroIf == 0) {
            Cadena = " es igual a cero.";
        } else if (numeroIf > 0) {
            Cadena = " es un valor positivo.";
        } else {
            Cadena = " es un valor negativo.";
        }

        //Mostramos por pantalla si el valor generado aleatoriamente es positivo, igual a cero o negativo
        System.out.println(numeroIf+Cadena);

        System.out.println("-·-");

        //Creamos un nuevo número aleatorio entre -10 y 0
        numeroWhile = (int) (Math.random() * 11) - 10;
        System.out.println("Se ha generado el número "+numeroWhile);

        //Creamos un bucle while que aumente el valor hasta 3.
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("Ahora es "+numeroWhile);
        }

        System.out.println("-·-");

        //Creamos un bucle do-while que sólo se ejecute una vez.
        do {
            numeroWhile++;
            System.out.println("Ahora con do-while es "+numeroWhile);
        } while (false);

        System.out.println("-·-");

        //Creamos un bucle for que se ejecute 4 veces
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++)
            System.out.println("Ahora con for hacemos: "+numeroFor);

        System.out.println("-·-");

        //Creamos un array con las estaciones y un número aleatorio para seleccionar el índice del ejemplo
        String [] estaciones = {"invierno", "primavera", "verano", "otoño", "ERROR"};
        estacion = (estaciones[(int) (Math.random() * 5)]);

        //Creamos un selector switch-case
        switch (estacion) {
            case "invierno":
                System.out.println("Es invierno.");
                break;
            case "primavera":
                System.out.println("Es primavera.");
                break;
            case "verano":
                System.out.println("Es verano.");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            default:
                System.out.println("No es una estación");
                break;
        }
    }
}