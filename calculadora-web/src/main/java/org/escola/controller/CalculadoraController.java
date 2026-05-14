package org.escola.controller;

import org.escola.model.Calculadora;
import org.escola.repository.CalculadoraRepository;
import org.escola.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    @Autowired
    private CalculadoraService service;

    @Autowired
    private CalculadoraRepository repository;

    @PostMapping
    public Calculadora calcular(@RequestBody Calculadora calculadora) {

        double resultado = service.calcular(calculadora);

        calculadora.setResultado(resultado);

        return repository.save(calculadora);
    }

    @GetMapping
    public ResponseEntity<List<Calculadora>> obterHistorico() {
        List<Calculadora> historico = repository.findAll();
        return ResponseEntity.ok(historico);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleIllegalArgument(IllegalArgumentException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }
}
