package com.putacollartoyourchild.app.entity.service;
//Interfaz conecta el controlador del backend con el DAO.
import java.util.List;

import com.putacollartoyourchild.app.entity.model.AppUser;

public interface IAppUserService {
	public List<AppUser> getAll();
	public AppUser  getOne(long id);
}

