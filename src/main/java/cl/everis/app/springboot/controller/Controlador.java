package cl.everis.app.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import cl.everis.app.springboot.services.Services;

import java.util.List;
import java.util.ListIterator;

/**
 * Clase encargada de contener los métodos necesarios para
 * obtener, crear, actualizar y borrar datos de la base de datos
 */
@RestController
@RequestMapping("operaciones")
public class Controlador {

    /* Objeto que permite usar los métodos contenidos en Services.java */
    @Autowired
    private Services services;

    /**
     * Métodos para sumar, restar, multiplicar y dividir 2 números
     */

    /* Método encargado de sumar dos números */
    @GetMapping(value = "/sumar")
    public ResponseEntity<Double> sumar(@RequestParam Double num1, @RequestParam Double num2){
        return new ResponseEntity<Double>(services.sumar(num1, num2), HttpStatus.OK );
    }

    /* Método encargado de restar dos números */
    @GetMapping(value = "/restar")
    public ResponseEntity<Double> restar(@RequestParam Double num1, @RequestParam Double num2){
        return new ResponseEntity<Double>(services.restar(num1, num2), HttpStatus.OK );
    }

    /* Método encargado de multiplicar dos números */
    @GetMapping(value = "/multiplicar")
    public ResponseEntity<Double> multiplicar(@RequestParam Double num1, @RequestParam Double num2){
        return new ResponseEntity<Double>(services.multiplicar(num1, num2), HttpStatus.OK );
    }

    /* Método encargado de dividir dos números */
    @GetMapping(value = "/dividir")
    public ResponseEntity<Double> dividir(@RequestParam Double num1, @RequestParam Double num2){
        return new ResponseEntity<Double>(services.dividir(num1, num2), HttpStatus.OK );
    }

    /* Método encargado de ordenar la lista descendientemente */
    @GetMapping(value = "/ordDesc")
    public ResponseEntity<List<Integer>> ordDesc(@RequestParam List<Integer> numList){
        return new ResponseEntity<List<Integer>>(services.ordDesc(numList), HttpStatus.OK );
    }
}
