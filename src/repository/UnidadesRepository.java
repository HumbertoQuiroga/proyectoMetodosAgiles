/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.util.ArrayList;
import java.util.List;
import org.bson.Document;
import org.bson.conversions.Bson;

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
    
    public void actualizarCursos(Document cursoAntiguo, Document cursoNuevo)
    {
        Document cursoAntiguo2 = new Document();
        cursoAntiguo2.append("nombre", cursoAntiguo.getString("nombre"));
        cursoAntiguo2.append("periodo", cursoAntiguo.getString("periodo"));
        cursoAntiguo2.append("dias", cursoAntiguo.getString("dias"));
        cursoAntiguo2.append("hora", cursoAntiguo.getString("hora"));
        
        List<Document> listaUnidadesCurso = new ArrayList<>();
        database.getCollection(collectionName).find(new Document("curso", cursoAntiguo2)).into(listaUnidadesCurso);
        
        if(!listaUnidadesCurso.isEmpty())
        {
            for(int cont = 0; cont < listaUnidadesCurso.size() ;cont++)
            {
                Bson valorCursoAcualizado = new Document("curso", cursoNuevo);
                Bson operacionActualizar = new Document("$set",valorCursoAcualizado);
                database.getCollection(collectionName).updateOne(listaUnidadesCurso.get(cont), operacionActualizar);
            }
        }
    }
    
    public boolean actualizarUnidad(Document unidadAntigua, Document unidadNueva)
    {
        try {
            Bson valorUnidadAcualizada = new Document(unidadNueva);
            Bson operacionActualizar = new Document("$set",valorUnidadAcualizada);
            database.getCollection(collectionName).updateOne(unidadAntigua, operacionActualizar);
            return true;
        } catch (Exception e) {
            System.out.println("Error al actualizar documento en: " + this.collectionName);
            System.err.println(e.getMessage());
            return false;
        }
    }
    public boolean eliminarUnidad(Document unidad)
    {
        try 
        {
            database.getCollection(collectionName).findOneAndDelete(unidad);
            return true;
        }catch (Exception e){return false;}
    }
    
    public boolean eliminarUnidadesEnElCurso(Document curso)
    {
        Document cursoAeliminar = new Document();
        cursoAeliminar.append("nombre", curso.getString("nombre"));
        cursoAeliminar.append("periodo", curso.getString("periodo"));
        cursoAeliminar.append("dias", curso.getString("dias"));
        cursoAeliminar.append("hora", curso.getString("hora"));
        
        List<Document> listaUnidadesCurso = new ArrayList<>();
        database.getCollection(collectionName).find(new Document("curso", cursoAeliminar)).into(listaUnidadesCurso);
        
        if(!listaUnidadesCurso.isEmpty())
        {
            for(int cont = 0; cont < listaUnidadesCurso.size() ;cont++)
            {
                database.getCollection(collectionName).findOneAndDelete(listaUnidadesCurso.get(cont));
            }
            return true;
        }
        return false;
    }
    
}
