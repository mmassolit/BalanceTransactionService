package com.videosharing.service;

import java.util.List;

import com.videosharing.model.Role;

import javassist.NotFoundException;


public interface IRoleService {	
	List<Role> findAll();
	
    Role save(Role adForSave);
    
    Role getById(String adId) throws NotFoundException;

    void deleteById(String adId) throws NotFoundException;
}
