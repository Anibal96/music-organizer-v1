public class Test
{
   
    /**
     * Constructor for objects of class Test
     */
    public void Test()
    {
        MusicOrganizer coleccion = new MusicOrganizer();
        System.out.println("Añadiendo 3 elementos de la colección");
        coleccion.addFile("1.mp3");
        coleccion.addFile("2.mp3");
        coleccion.addFile("3.mp3");
        System.out.println("##########################");
        System.out.println("Comprobamos que el numero de elementos es 3");
        System.out.println(coleccion.getNumberOfFiles());
        System.out.println("##########################");
        System.out.println("Comprobamos listFile");
        coleccion.listFile(0);
        coleccion.listFile(1);
        coleccion.listFile(2);
        System.out.println("##########################");
        System.out.println("Comprobamos checkIndex");
        coleccion.checkIndex(3);
        System.out.println("##########################");
        System.out.println("Comprobamos validIndex false");
        coleccion.validIndex(3);
        System.out.println(coleccion.getValidIndex());
        System.out.println("Comprobamos validIndex true");
        coleccion.validIndex(1);
        System.out.println(coleccion.getValidIndex());
        System.out.println("##########################");
        System.out.println("Comprobamos removeFile");
        coleccion.removeFile(2);
        System.out.println("Comprobamos que el numero de elementos es 2 despues de eliminar el tercero");
        System.out.println(coleccion.getNumberOfFiles());
    }
}
