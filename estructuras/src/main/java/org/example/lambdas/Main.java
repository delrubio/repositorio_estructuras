package org.example.lambdas;

public class Main {

    public static void main(String[] args) {

        //CLASE ANÓNIMA
        Profesores patri = new Profesores() {
            @Override
            public String calificar(int nota) {
                System.out.println("Aprobado General con nota " + nota);
                return "Teneis que espabilar un poco.";
            }
        };

        String notas_generales = patri.calificar(6);
        System.out.println(notas_generales);




        //LAMBDA
        //Profesores paco = (int nota) -> System.out.println("Aprobado para David " + nota);
        //como es tipo Profesor, ya sabe a que clase llama y tiene disponible los metodos. Si es solo 1 cosa,
        // se puede hacer en la misma línea

        Profesores paco = (int nota) -> {
            System.out.println("Aprobado para David " + nota);
            return "Espabila un poco chaval...";
        };

        String notas_paco = paco.calificar(8);
        System.out.println(notas_paco);





        Ejecutor ejec = (numero) -> {
            if (numero<10){
                return false;
            }else {
                return true;
            }
        };

        System.out.println(ejec.ejecutar(1)  );





        VerificarVoto voto = (nombre, edad) -> {

            System.out.println("Verificando voto para " + nombre);

            if (edad>=18){
                return true;
            }else{
                return false;
            }
        };

        System.out.println(voto.puedesVotar("David Andres", 18));
        System.out.println(voto.puedesVotar("Patricia Domenech", 16));

    }
}
