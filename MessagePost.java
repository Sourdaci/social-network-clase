
public class MessagePost extends Post{
    private String message;

    /**
     * Constructor de la clase MessagePost
     *
     * @param author el nombre de usuario que crea el post
     * @param text el mensaje del post
     *
     **/
    public MessagePost(String author, String text)
    {
        super(author);
        message = text;
    }

    /**
     * Devuelve el texto del post
     *
     * @return el texto del post
     **/
    public String getText()
    {
        return message;
    }

    /*
     * Muestra por pantalla los datos del post
     *
     */
    public void display()
    {
        System.out.println("Autor del mensaje " + getUsername());
        System.out.println("Mensaje " + message);
        System.out.println("Me gusta " + getLikes());
        System.out.println(timeString(System.currentTimeMillis()));
        displayComments();
    }
}

