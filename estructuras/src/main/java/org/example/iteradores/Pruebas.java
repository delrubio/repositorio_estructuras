package org.example.iteradores;

import org.example.hascode_equals.Informe;

import java.util.*;

public class Pruebas {
    public static void main(String[] args) {

        LinkedList<String> empresas = new LinkedList<>(Arrays.asList("NTT", "DXC", "Calconut", "Icaro Cloud"));

        Iterator<String> it = empresas.iterator();

        empresas.remove();

        while (it.hasNext()){
            String empresa = it.next();
            if (empresa.equals("DXC")){
                it.remove();
            }
        }

        System.out.println(empresas);

        ArrayList<Empresa> listaEmpresas = new ArrayList<>();

        listaEmpresas.add(new Empresa("DXC", 356));
        listaEmpresas.add(new Empresa("NTT", 670));
        listaEmpresas.add(new Empresa("Calconut", 197));
        listaEmpresas.add(new Empresa("Icaro Cloud", 10));

        Iterator<Empresa> itEmpresa = listaEmpresas.iterator();

        while (itEmpresa.hasNext()){
            Empresa empresa = itEmpresa.next();
            System.out.println(empresa);

            if (empresa.getEmpleados()>10){
                itEmpresa.remove();
            }
        }

        System.out.println(listaEmpresas);

        HashMap<String, Integer> notasFinales = new HashMap<>();
        notasFinales.put("Isamel", 3);
        notasFinales.put("Antonio", 1);
        notasFinales.put("Cesa", 7);
        notasFinales.put("Mauro", 7);
        notasFinales.put("David", 5);

        for (Map.Entry<String, Integer> mapita : notasFinales.entrySet());

        Iterator<Map.Entry<String, Integer>> itMapita = notasFinales.entrySet().iterator();

        while (itMapita.hasNext()){
            Map.Entry<String, Integer> mapita = itMapita.next();

            System.out.println("Alumno: " + mapita.getKey() + " con nota final " + mapita.getValue());
        }

    }
}
