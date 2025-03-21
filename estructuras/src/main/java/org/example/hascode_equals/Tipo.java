package org.example.hascode_equals;

public enum Tipo {
    ADMINISTRATIVO, EMPRESARIAL, PERSONAL, ERROR;

    public Tipo siguiente(String tarea){

        switch (tarea){
            case "ADMINISTRATIVO":
                return Tipo.ADMINISTRATIVO;
            case "EMPRESARIAL":
                return Tipo.EMPRESARIAL;
            case "PERSONAL":
                return Tipo.PERSONAL;
            default:
                return ERROR;
        }
    }
}
