package com.willi.demo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HolaMundoController {

    private static final List<Auto> autos = new ArrayList<>();

    @GetMapping(value = "/auto/{patente}")
    public Auto getAuto(@PathVariable String patente){
        return autos.stream()
                .filter(a -> a.getPatente().equalsIgnoreCase(patente))
                .findFirst()
                .orElseThrow(RuntimeException::new);
    }

    @GetMapping(value = "/autos")
    public List<Auto> getAuto(){
        return autos;
    }

    @PostMapping(value = "/auto")
    public void chauMundo(@RequestBody CreacionAutoDTO creacionAutoDTO){
        Auto nuevoAuto = new Auto(creacionAutoDTO.getPatente(), creacionAutoDTO.getCantidadDeKilos());
        autos.add(nuevoAuto);
    }

    @PatchMapping(value = "/auto/{patente}")
    public void modificarAuto(@PathVariable String patente, @RequestBody ModificacionAutoDTO modificacionAutoDTO){
        getAuto(patente).setCantidadDeKilos(modificacionAutoDTO.getCantidadDeKilos());
    }

    @DeleteMapping(value = "/auto/{patente}")
    public void deleteAuto(@PathVariable String patente){
        Auto auto = getAuto(patente);
        autos.remove(auto);
    }

    @GetMapping(value = "/suma/{numero1}/{numero2}")
    public Long sumaDosNumeros(@PathVariable Long numero1, @PathVariable Long numero2){
        return numero1 + numero2;
    }
}
