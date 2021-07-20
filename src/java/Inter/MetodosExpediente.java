/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inter;

import Model.Expediente;
import java.util.ArrayList;

/**
 *
 * @author EMProducciones
 */
public interface MetodosExpediente {
    
    void cargarExpediente(Expediente exp);
    ArrayList<Expediente> listarTodo();
    
}
