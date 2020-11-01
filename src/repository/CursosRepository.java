package repository;

import java.util.ArrayList;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author PC
 */
public class CursosRepository extends BaseRepository{

    public CursosRepository()
    {
      super("cursos");
    }
    
    public Document buscarCurso(Document doc)
    {
        List<Document> documentosEnontrados = new ArrayList<>();
        database.getCollection(this.collectionName).find(doc).into(documentosEnontrados);
        if(!documentosEnontrados.isEmpty())
        {
           for(int cont =0 ;cont < documentosEnontrados.size() ; cont++)
           {
               if(documentosEnontrados.get(cont).getString("nombre").equals(doc.getString("nombre")) &&
                  documentosEnontrados.get(cont).getString("periodo").equals(doc.getString("periodo")) &&
                  documentosEnontrados.get(cont).getString("dias").equals(doc.getString("dias"))&&
                  documentosEnontrados.get(cont).getString("hora").equals(doc.getString("hora")))
               {
                   return documentosEnontrados.get(cont);
               }
           }
        }
        return null;
    }
    
    public boolean actualizarCurso(Document doc) {
        try {
            Document filter = new Document("_id", doc.getObjectId("_id"));
            Document docUpdate = new Document();
            docUpdate.append("nombre", doc.getString("nombre"));
            docUpdate.append("dias", doc.getInteger("dias"));
            docUpdate.append("hora", doc.getString("hora"));
            docUpdate.append("unidades", doc.getInteger("unidades"));

            this.database.getCollection(this.collectionName).updateOne(filter, new Document("$set", docUpdate));
            return true;
            
        } catch (Exception e) {
            System.out.println("Error al actualizar documento en: " + this.collectionName);
            System.err.println(e.getMessage());
            return false;
        }
    }
    
    
}
