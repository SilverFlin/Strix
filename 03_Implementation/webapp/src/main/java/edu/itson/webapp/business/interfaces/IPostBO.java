package edu.itson.webapp.business.interfaces;

import edu.itson.dominio.Comentario;
import edu.itson.dominio.Post;
import edu.itson.dominio.Usuario;
import edu.itson.webapp.exceptions.BusinessException;
import java.util.List;

/**
 *
 */
public interface IPostBO {

    /**
     * Obtiene la cantidad especificada de posts.
     *
     * @param amount
     * @return los posts solicitados.
     * @throws BusinessException
     */
    List<Post> getPosts(int amount) throws BusinessException;

    /**
     * Crea un post y lo regresa.
     *
     * @param post
     * @return el post creado.
     * @throws BusinessException
     */
    Post createPost(Post post) throws BusinessException;

    /**
     * Consigue un post por id.
     *
     * @param id
     * @return El post, o null si no existe.
     * @throws BusinessException
     */
    Post getPostById(String id) throws BusinessException;

    /**
     * Verifica si el post existe.
     *
     * @param id
     * @return true, si el post existe.
     * @throws BusinessException
     */
    boolean postExists(String id) throws BusinessException;

    /**
     * Edita el post, si existe.
     *
     * @param user
     * @param post
     * @return el post editado.
     * @throws BusinessException
     */
    Post editPost(Usuario user, Post post) throws BusinessException;

    /**
     * Elimina el post, si existe.
     *
     * @param id
     * @param user
     * @return el post eliminado.
     * @throws BusinessException
     */
    Post deletePost(String id, Usuario user) throws BusinessException;

    /**
     * Obtiene todos los comentarios del post.
     *
     * @param post
     * @return lista de todos los comentarios.
     * @throws edu.itson.webapp.exceptions.BusinessException
     */
    List<Comentario> getPostComments(Post post) throws BusinessException;
}
