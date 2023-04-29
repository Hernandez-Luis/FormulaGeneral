import java.util.Scanner;

public class OpMain {
    public void op(){
        Scanner scanner = new Scanner(System.in);
        Operaciones operaciones = new Operaciones();
        Validacion validacion = new Validacion();

        int a=0,b=0,c=0,op;
        float valRaiz = 0;
        int x = 0;

        while(x!=2){
            System.out.println("Ejemplo de un trinomio: ax^2+bx+c=0");
            System.out.println("Ingresa un valor para a: ");
            a = scanner.nextInt();
            System.out.println("Ingresa un valor para b: ");
            b = scanner.nextInt();
            System.out.println("Ingresa un valor para c: ");
            c = scanner.nextInt();

            valRaiz = operaciones.calculaRaiz(a,b,c);
            op = validacion.resultado(valRaiz);
            operaciones.solucion(op,valRaiz,a,b,c);

            System.out.println("¿Quieres resolver otra ecuacion? Si(1) No(2)");
            x = scanner.nextInt();
        }
    }
}
