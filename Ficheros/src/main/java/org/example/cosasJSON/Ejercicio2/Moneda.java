package org.example.cosasJSON.Ejercicio2;

import lombok.Data;

@Data
public class Moneda {

    Ethereum ethereum;
    Bitcoin bitcoin;

    @Data
    public class Ethereum{
        public double usd;
        public double eur;
    }

    @Data
    public class Bitcoin {
        public int usd;
        public int eur;
    }

}
