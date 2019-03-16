public bool registrarNuevoUsuario (Usuario user){

    //registrar datos
    //almacenar en bd
    //return true
    return true;
}

<<<<<<< HEAD

/*
*@param user contiene toda la informacion del usuario
*@param playlist contiene toda la informacion de la playlist creada
	(nombre, descripcion, artista);


*/

public void crearPlayList(Usuario user, PlayList playlist){
	//variable user contiene los datos del usuario
	user.addPlaylist(playlist);//añadir playlist al usuario

	//actualizamos la base de datos agregando la nueva playlist creada al usuario
	mysql.procedure_addPlaylist(user.getPlaylist.last);

}

=======
public bool Login(String usuario, String contraseña)
{
	//verificar el usuario y contraseña en la base de datos
	//si cumple entonces se muestra la pantalla de bienvenida
	//sino se muestra un mensaje de error
	//
	return estado_sesion;
}
>>>>>>> 9433286e00d607f3568dcb6693e430e9882b1294
