/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package G37_Reto3.Interfaz;

import G37_Reto3.Modelo.Cliente;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Maicol Moreno
 */
public interface InterfaceCliente extends CrudRepository<Cliente,Integer>
 {
    
}
