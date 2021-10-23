/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package G37_Reto3.Repositorio;

import G37_Reto3.*;
import G37_Reto3.Interfaz.InterfaceCabin;
import G37_Reto3.Modelo.Cabaña;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Maicol Moreno
 */
@Repository
public class RepositorioCabin {
    
    @Autowired
    private InterfaceCabin crud;

    public List<Cabaña> getAll(){
        return (List<Cabaña>) crud.findAll();
    }

    public Optional<Cabaña> getCabin(int id){
        return crud.findById(id);
    }

    public Cabaña save(Cabaña cabin){
        return crud.save(cabin);
    }
    public void delete(Cabaña cabin){
        crud.delete(cabin);
    }
    
}

