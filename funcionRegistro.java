public bool registrarNuevoUsuario (Usuario user){

    //registrar datos
    //almacenar en bd
    //return true
    return true;
}


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

