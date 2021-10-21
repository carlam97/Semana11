public class Programa{
    public static void main(String args[]){
        int numero=10;

        Atributo2 at = new Atributo2();
        Atributo2 at2 = new Atributo2();

        at.numero2=10;    // nome do objeto   // objetos diferentes com valores diferentes acessando o mesmo atributo
        at2.numero2=20;      

    while(true){
        int cont=0;
        cont+=1;
        if(cont>0){
            break;
        }
    System.out.println(cont);
    }
    }
}