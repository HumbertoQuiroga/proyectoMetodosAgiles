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
public class AsistenciaCursosRepository extends BaseRepository{
    
    public AsistenciaCursosRepository() 
    {
        super("asistenciasCursos");
    }
    
    public Document buscarListaAsistencias(Document curso, String fecha)
    {
        if(!curso.isEmpty() && !"".equals(fecha))
        {
            Document documento = new Document();
            documento.append("curso", curso);
            documento.append("fecha", fecha);
            Document documentoEncontrado = database.getCollection(collectionName).find(documento).first();
            if(documentoEncontrado==null){return null;}
            else{return documentoEncontrado;}
        }
        return null;
    }
    
    public void actualizarListaAsistencias(Document curso, String fecha, List<Document> listaActualizada)
    {
        Document listaAsistenciasBuscada = buscarListaAsistencias(curso, fecha);
        if(listaAsistenciasBuscada != null)
        {
            Bson valorListaAcualizada = new Document("listaAsistencia", listaActualizada);
            Bson operacionActualizar = new Document("$set",valorListaAcualizada);
            database.getCollection(collectionName).updateOne(listaAsistenciasBuscada, operacionActualizar);
        }
    }
    
    public void actualizarCursos(Document cursoAntiguo, Document cursoNuevo)
    {
        Document cursoAntiguo2 = new Document();
        cursoAntiguo2.append("nombre", cursoAntiguo.getString("nombre"));
        cursoAntiguo2.append("periodo", cursoAntiguo.getString("periodo"));
        cursoAntiguo2.append("dias", cursoAntiguo.getString("dias"));
        cursoAntiguo2.append("hora", cursoAntiguo.getString("hora"));
        
        List<Document> listaAsistenciasCurso = new ArrayList<>();
        database.getCollection(collectionName).find(new Document("curso", cursoAntiguo2)).into(listaAsistenciasCurso);
        
        if(!listaAsistenciasCurso.isEmpty())
        {
            for(int cont = 0; cont < listaAsistenciasCurso.size() ;cont++)
            {
                Bson valorCursoAcualizado = new Document("curso", cursoNuevo);
                Bson operacionActualizar = new Document("$set",valorCursoAcualizado);
                database.getCollection(collectionName).updateOne(listaAsistenciasCurso.get(cont), operacionActualizar);
            }
        }
    }
    
    public void actualizarUnidad(Document unidadAntigua, Document unidadNueva)
    {
        Document unidadAntigua2 = new Document();
        unidadAntigua2.append("indice", unidadAntigua.getString("indice"));
        unidadAntigua2.append("nombre", unidadAntigua.getString("nombre"));
        unidadAntigua2.append("descripcion", unidadAntigua.getString("descripcion"));
        
        List<Document> listaAsistenciasCurso = new ArrayList<>();
        database.getCollection(collectionName).find(new Document("unidad", unidadAntigua2)).into(listaAsistenciasCurso);
        
        if(!listaAsistenciasCurso.isEmpty())
        {
            for(int cont = 0; cont < listaAsistenciasCurso.size() ;cont++)
            {
                Bson valorUnidadAcualizada = new Document("unidad", unidadNueva);
                Bson operacionActualizar = new Document("$set",valorUnidadAcualizada);
                database.getCollection(collectionName).updateOne(listaAsistenciasCurso.get(cont), operacionActualizar);
            }
        }
    }
    
    
    public List<Document> buscarListaAsistenciasPorUnidad(Document curso, Document unidad)
    {
        Document unidadesBuscada = new Document();
        unidadesBuscada.append("curso", curso);
        unidadesBuscada.append("unidad", unidad);
        List<Document> listaUnidadesEncontrada = new ArrayList<>();
        database.getCollection(collectionName).find(unidadesBuscada).into(listaUnidadesEncontrada);
        if(listaUnidadesEncontrada.isEmpty()){return null;}
        else{return listaUnidadesEncontrada;}
    }
    
    public List<Document> buscarListaAsistenciasPorCurso(Document curso)
    {
        Document unidadesBuscada = new Document();
        unidadesBuscada.append("curso", curso);
        List<Document> listaUnidadesEncontrada = new ArrayList<>();
        database.getCollection(collectionName).find(unidadesBuscada).into(listaUnidadesEncontrada);
        if(listaUnidadesEncontrada.isEmpty()){return null;}
        else{return listaUnidadesEncontrada;}
    }
    
    public boolean eliminarAsistenciasEnElCurso(Document curso)
    {
        Document cursoAeliminar = new Document();
        cursoAeliminar.append("nombre", curso.getString("nombre"));
        cursoAeliminar.append("periodo", curso.getString("periodo"));
        cursoAeliminar.append("dias", curso.getString("dias"));
        cursoAeliminar.append("hora", curso.getString("hora"));
        
        List<Document> listaAsistenciaCurso = new ArrayList<>();
        database.getCollection(collectionName).find(new Document("curso", cursoAeliminar)).into(listaAsistenciaCurso);
        
        if(!listaAsistenciaCurso.isEmpty())
        {
            for(int cont = 0; cont < listaAsistenciaCurso.size() ;cont++)
            {
                database.getCollection(collectionName).findOneAndDelete(listaAsistenciaCurso.get(cont));
            }
            return true;
        }
        return false;
    }
    
    public boolean eliminarAsistenciasEnLaUnidad(Document unidad)
    {
        Document unidadAeliminar = new Document();
        unidadAeliminar.append("indice", unidad.getString("indice"));
        unidadAeliminar.append("nombre", unidad.getString("nombre"));
        unidadAeliminar.append("descripcion", unidad.getString("descripcion"));
        
        Document listasBuscadas = new Document();
        listasBuscadas.append("curso", unidad.get("curso"));
        listasBuscadas.append("unidad", unidadAeliminar);
       
        List<Document> listaAsistenciaCursoyUnidad = new ArrayList<>();
        database.getCollection(collectionName).find(listasBuscadas).into(listaAsistenciaCursoyUnidad);
        
        if(!listaAsistenciaCursoyUnidad.isEmpty())
        {
            for(int cont = 0; cont < listaAsistenciaCursoyUnidad.size() ;cont++)
            {
                database.getCollection(collectionName).findOneAndDelete(listaAsistenciaCursoyUnidad.get(cont));
            }
            return true;
        }
        return false;
    }
    
    
}
