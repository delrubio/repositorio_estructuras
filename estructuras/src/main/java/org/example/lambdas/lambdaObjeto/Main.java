package org.example.lambdas.lambdaObjeto;

public class Main {

    public static void main(String[] args) {

        Profesor profe1 = new Profesor("Paco", "DAM", 42);
        Profesor profe2 = new Profesor("Ivan", "DAW", 23);

        VerificarVotoProfe voto = (profesor) ->{

            System.out.println("Verificando voto para " + profesor.getNombre());

            if (profesor.getEdad()>=18){
                return true;
            }else{
                return false;
            }

        };

        System.out.println(voto.pudesVotar(profe1));
        System.out.println(voto.pudesVotar(profe2));

    }

}
