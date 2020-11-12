/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

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
    
}
