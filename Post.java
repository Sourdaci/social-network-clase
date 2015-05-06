import java.util.ArrayList;

/**
 * Write a description of class Post here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Post
{
    // instance variables - replace the example below with your own
    private String username;
    private long timestamp;
    private int likes;
    private ArrayList<String> comments;

    /**
     * Constructor for objects of class Post
     */
    public Post(String author)
    {
        // initialise instance variables
        username = author;
        timestamp = System.currentTimeMillis();
        likes = 0;
        comments = new ArrayList<>();
    }

    /**
     * Devuelve el usuario que ha escrito el post
     * 
     * @return Autor del Post
     */
    public String getUsername(){
        return username;
    }
    
    /**
     * Devuelve el numero de 'Me gusta' que tiene el post
     * 
     * @return Numero de 'Me gusta'
     */
    public int getLikes(){
        return likes;
    }
    
    /**
     * Aumenta el contador de likes en uno
     */
    public void like()
    {
        likes++;
    }

    /**
     * Disminuye el contador de likes en uno. Si ya es cero no hace nada.
     */
    public void unlike()
    {
        if(likes > 0)
        {
            likes--;
        }
    }

    /**
     * Agrega comentarios a los post publicados
     * 
     * @param text El comentario que agregar al post
     */
    public void addComment(String text){
        comments.add(text);
    }

    /**
     * Muestra por pantalla los comentarios del post (si tiene)
     */
    public void displayComments(){
        if(comments.isEmpty()){
            System.out.println( "No hay comentarios aun para este post");
        }else{		   			   
            for( String comment : comments){
                System.out.println(comment);
            }
        }
    }
    
    /**
     * Devuelve el tiempo que ha pasado en milisegundos desde el 1 de enero
     * de 1970 hasta que se creo el post
     *
     * @return el tiempo desde el 1 de enero de 1970 hasta que se creo el post.
     */
    public long getTimeStamp()
    {
        return timestamp;
    }

    /**
     * Devuelve el tiempo en string
     *
     * @param tiempo actual en milisegundos.
     * @return informacion en min y segundos del tiempo que ha transcurrido 
     *          desde que subimos la foto hasta ahora.
     */
    public String timeString(long time){
        long diferencia = time - timestamp;
        int segundos = (int)diferencia/1000;
        int minutos = segundos/60;
        int horas = minutos/60;
        minutos -= horas*60;
        segundos -= minutos*60;

        String tiempo = " ";
        if(horas != 0)
        {
            tiempo += horas + " horas ";
        }
        if(minutos != 0)
        {
            tiempo += minutos + " minutos ";
        }
        tiempo += segundos + " segundos ";
        return tiempo;        
    }
}
