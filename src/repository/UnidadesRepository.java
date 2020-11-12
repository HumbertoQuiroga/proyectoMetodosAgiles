/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.util.ArrayList;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author Alfredo Perez
 */
public class UnidadesRepository extends BaseRepository{
    
    public UnidadesRepository() 
    {
        super("unidades");
    }
    
    public Document buscarUnidad(Document curso, String indice)
    {
        Document unidadBuscada = new Document();
        unidadBuscada.append("curso", curso);
        unidadBuscada.append("indice", indice);
        Document unidadEncontrada = database.getCollection(collectionName).find(unidadBuscada).first();
        if(unidadEncontrada==null){return null;}
        else{return unidadEncontrada;}
    }
    
    public List<Document> buscarUnidades(Document curso)
    {
        Document unidadesBuscada = new Document();
        unidadesBuscada.append("curso", curso);
        List<Document> listaUnidadesEncontrada = new ArrayList<>();
        database.getCollection(collectionName).find(unidadesBuscada).into(listaUnidadesEncontrada);
        if(listaUnidadesEncontrada.isEmpty()){return null;}
        else{return listaUnidadesEncontrada;}
    }
    
}
