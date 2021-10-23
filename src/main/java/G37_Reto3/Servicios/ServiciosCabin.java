/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package G37_Reto3.Servicios;

import G37_Reto3.Modelo.Cabaña;
import G37_Reto3.Repositorio.RepositorioCabin;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Maicol Moreno
 */
@Service
public class ServiciosCabin {
     @Autowired
    private RepositorioCabin metodosCrud;

    public List<Cabaña> getAll(){
        return metodosCrud.getAll();
    }

    public Optional<Cabaña> getCabin(int cabinId) {
        return metodosCrud.getCabin(cabinId);
    }

    public Cabaña save(Cabaña cabin){
        if(cabin.getId()==null){
            return metodosCrud.save(cabin);
        }else{
            Optional<Cabaña> e=metodosCrud.getCabin(cabin.getId());
            if(e.isEmpty()){
                return metodosCrud.save(cabin);
            }else{
                return cabin;
            }
        }
    }

    public Cabaña update(Cabaña cabin){
        if(cabin.getId()!=null){
            Optional<Cabaña> e=metodosCrud.getCabin(cabin.getId());
            if(!e.isEmpty()){
                if(cabin.getName()!=null){
                    e.get().setName(cabin.getName());
                }
                if(cabin.getBrand()!=null){
                    e.get().setBrand(cabin.getBrand());
                }
                if(cabin.getRooms()!=null){
                    e.get().setRooms(cabin.getRooms());
                }
                if(cabin.getCategory()!=null){
                    e.get().setCategory(cabin.getCategory());
                }
                if(cabin.getCategory()!=null){
                    e.get().setCategory(cabin.getCategory());
                }
                metodosCrud.save(e.get());
                return e.get();
            }else{
                return cabin;
            }
        }else{
            return cabin;
        }
    }


    public boolean deleteCabin(int cabinId) {
        Boolean aBoolean = getCabin(cabinId).map(cabin -> {
            metodosCrud.delete(cabin);
            return true;
        }).orElse(false);
        return aBoolean;
    }
    
}
