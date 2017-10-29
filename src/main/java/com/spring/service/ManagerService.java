package com.spring.service;

import java.util.List;

import com.spring.model.Manager;

public interface ManagerService {
	public void addManager(Manager manager);
	public void updateManager(Manager manager);
	public List<Manager> listManagers();
	public Manager getManager(int id);
	public void deleteManager(Manager manager);
}