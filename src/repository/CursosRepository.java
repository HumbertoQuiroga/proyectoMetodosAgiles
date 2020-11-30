package repository;

import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author PC
 */
public class CursosRepository extends BaseRepository{

    public CursosRepository()
    {
      super("cursos");
    }
    
    public Document buscarCurso(Document documento)
    {
        if(!documento.isEmpty())
        {
           Document documentoEncontrado = database.getCollection(collectionName).find(documento).first();
           if(documentoEncontrado==null){return null;}
           else{return documentoEncontrado;}
           
        }
        return null;
    }
    
    public boolean actualizarCurso(Document cursoAntiguo, Document cursoNuevo) {
        
        try {
            Bson valorCursoAcualizado = new Document(cursoNuevo);
            Bson operacionActualizar = new Document("$set",valorCursoAcualizado);
            database.getCollection(collectionName).updateOne(cursoAntiguo, operacionActualizar);
            return true;
        } catch (Exception e) {
            System.out.println("Error al actualizar documento en: " + this.collectionName);
            System.err.println(e.getMessage());
            return false;
        }
    }
    
    
    
}
