package repository;

import com.mongodb.*;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import org.bson.Document;

/**
 *
 * @author PC
 */
public abstract class BaseRepository 
{
    private static final MongoClient mongoClient = new MongoClient();
    protected MongoDatabase database;
    protected String collectionName;

    public BaseRepository(String collectionName)
    {
       this.database = mongoClient.getDatabase("cursosDB");
       this.collectionName = collectionName;
       //System.out.println("Base Datos:"+collectionName); 
    }
    
    
    public boolean agregarDoumento(Document doc)
    {
        try {
            this.database.getCollection(this.collectionName).insertOne(doc);
            return true;
        } catch (Exception e) {
            System.out.println("Error al insertar documento en: " + this.collectionName+" \n"+e.getMessage());
            return false;
        }
    }
    
    public ArrayList<Document> buscarRegistrosEnLaColeccion()
    {
        try {return database.getCollection(this.collectionName).find().into(new ArrayList<>());} 
        catch (Exception e) 
        {
            System.out.println("Error al buscar documento en: " + this.collectionName+" \n"+e.getMessage());
            return new ArrayList<>();
        }
    }
    
    public boolean eliminarDoumento(Document doc)
    {
        try {
            this.database.getCollection(this.collectionName).deleteOne(doc);
            return true;
        } catch (Exception e) {
            System.out.println("Error al intentar eliminar en: " + this.collectionName+" \n"+e.getMessage());
            return false;
        }
    }
    
}
