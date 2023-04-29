public class Operaciones {

    public float calculaRaiz(int a,int b,int c){
        return (b*b)-(4*a*c);
    }

    public void solucion(int op,float valRaiz,int a,int b,int c){
        double raiz;
        double x,y,mult,resultado,resultado2;

        if(op==1){
            System.out.println("Solucion X = " + (-1*b)/2*a);
        }else if(op==2){
            raiz = Math.sqrt(valRaiz);
            x= (-1*b) + raiz;
            y = (-1*b) - raiz;
            mult = 2*a;
            resultado = x/mult;
            resultado2 = y/mult;


            System.out.println("Primer solucion X1 = " + resultado);
            System.out.println("Segunda solucion X2 = " + resultado2);
        }else System.out.println("La ecuacion no tiene solucion en los numeros reales");
    }
}


