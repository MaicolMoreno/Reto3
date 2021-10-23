/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package G37_Reto3.Controler;

import G37_Reto3.Servicios.ServiciosCabin;
import G37_Reto3.Modelo.Cabaña;
import G37_Reto3.*;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author Maicol Moreno
 */
@RestController
@RequestMapping("/api/Cabin")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class ControladorCabin {
    @Autowired
    private ServiciosCabin servicio;
    @GetMapping("/all")
    public List<Cabaña> getCabins(){
        return servicio.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Cabaña> getCabin(@PathVariable("id") int cabinId) {
        return servicio.getCabin(cabinId);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Cabaña save(@RequestBody Cabaña cabin) {
        return servicio.save(cabin);
    }
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Cabaña update(@RequestBody Cabaña cabin) {
        return servicio.update(cabin);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int cabinId) {
        return servicio.deleteCabin(cabinId);
    }
    
}
