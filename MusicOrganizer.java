import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael KÃ¶lling
 * @version 2011.07.31
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
    //Booleano que muestra si el indice es correcto o no.
    private boolean validIndex;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<String>();
        validIndex = false;
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        validIndex(index);
        if(validIndex == true) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        validIndex(index);
        if(validIndex == true) {
            files.remove(index);
        }
    }
    
    /**
     * Método que toma un parámetro entero y comprueba que sea un índice válido para el atributo files
     */
    public void checkIndex(int index)
    {
        if(index < 0 || index >= files.size()){
           System.out.println("Error rango dado no es correcto,introducir rango de 0 a " + (files.size() - 1));
            
        }
    }
    
    public void validIndex(int index)
    {
        if(index < 0 || index >= files.size())
        {
            validIndex = false;
        }
        else
        {
            validIndex = true;
        }
    }
    
    public boolean getValidIndex()
    {
        return validIndex;
    }
    
    
}
