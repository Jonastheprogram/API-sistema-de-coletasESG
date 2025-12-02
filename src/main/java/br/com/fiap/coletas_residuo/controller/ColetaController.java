package br.com.fiap.coletas_residuo.controller;



import br.com.fiap.coletas_residuo.model.Coleta;
import br.com.fiap.coletas_residuo.repository.ColetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/coletas")
public class ColetaController {

    @Autowired
    private ColetaRepository coletaRepository;

    @GetMapping
    public List<Coleta> getColetas() {
        return coletaRepository.findAll();
    }

    @PostMapping("/registrarcoleta")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Coleta> save(@RequestBody Coleta coleta) {
        Coleta newColeta = coletaRepository.save(coleta);
        return ResponseEntity.created(null).body(newColeta);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Coleta> getById(@PathVariable Long id) {
        Optional<Coleta> residuo = coletaRepository.findById(id);
        if (residuo.isPresent()) {
            return ResponseEntity.ok(residuo.get());
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteById(@PathVariable Long id) {
        Coleta coleta = coletaRepository.findById(id).orElse(null);
        if (coleta != null) {
            coletaRepository.delete(coleta);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/atualizarcoleta")
    public ResponseEntity<Coleta> update(@RequestBody Coleta coleta) {
        Coleta actualColeta = coletaRepository.findById(coleta.getId()).orElse(null);
        if (actualColeta != null) {
            return ResponseEntity.ok(coletaRepository.save(coleta));
        }
        return ResponseEntity.notFound().build();
    }

}