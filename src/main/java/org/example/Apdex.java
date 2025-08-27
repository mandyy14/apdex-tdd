// Amanda Mesquita Cirino da Silva RM559177

package org.example;

public class Apdex {
    public double validarApdex(double satisfatorio, double toleravel, double total){
        if (total == 0) return 0.0;
        return (satisfatorio + (toleravel / 2)) / total;
    }
}
