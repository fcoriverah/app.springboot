package cl.everis.app.springboot.services;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Services {

    /* Método que se encarga de sumar dos números de tipo Double */
    public Double sumar(Double num1, Double num2) {
        if(validar(num1, num2)) {
            return Double.sum(num1, num2);
        }else {
            throw new RuntimeException("Debe ingresar números válidos");
        }
    }

    /* Método que se encarga de restar dos números de tipo Double */
    public Double restar(Double num1, Double num2) {
        if(validar(num1, num2)) {
            return Double.sum(num1, -num2);
        }else {
            throw new RuntimeException("Debe ingresar números válidos");
        }
    }

    /* Método que se encarga de multiplicar dos números de tipo Double */
    public Double multiplicar(Double num1, Double num2) {
        if(validar(num1, num2)) {
            return num1*num2;
        }else {
            throw new RuntimeException("Debe ingresar números válidos");
        }
    }

    /* Método que se encarga de dividir dos números de tipo Double */
    public Double dividir(Double num1, Double num2) {
        if(validar(num1, num2) && validarDiv(num2)) {
            return num1/num2;
        }else {
            throw new RuntimeException("Debe ingresar números válidos");
        }
    }

    /* Método que se encarga de validar que los numeros sean distintos de null */
    public Boolean validar(Double num1, Double num2) {
        if(num1 == null || num2 == null) {
            return false;
        }else {
            return true;
        }
    }

    /* Método que se encarga de validar que num2 sea distinto de 0 */
    public Boolean validarDiv(Double num2) {
        if(num2.compareTo(0D) == 0) {
            return false;
        }else {
            return true;
        }
    }

    /* Método  */
    public List <Integer> ordDesc (List<Integer> lista){
        Integer aux;
        for (int i=0; i<=lista.size(); i++) {
            for (int j = 0; j <= lista.size() - i - 1; j++) {
                if (lista.get(j + 1) > lista.get(j)) {
                    aux = lista.get(j + 1);
                    lista.set(j + 1, lista.get(j));
                    lista.set(j, aux);
                }
            }
        }
        return lista;
    }
}
