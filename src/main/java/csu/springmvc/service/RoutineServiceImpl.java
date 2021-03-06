package csu.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;

import csu.springmvc.dao.RoutineDao;
import csu.springmvc.model.Routine;

public class RoutineServiceImpl implements RoutineService {

  @Autowired
  public RoutineDao routineDao;

  public void createRoutine(Routine routine) {
    routineDao.createRoutine(routine);
  }

  public Routine getRoutine(int routineid) {
    return routineDao.getRoutine(routineid);
  }
}
