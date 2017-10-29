package dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import model.Manager;

@Repository
public class ManagerDaoImpl implements ManagerDao {
	private static final Logger logger = LoggerFactory.getLogger(ManagerDaoImpl.class);
	/*
	 * Type SessionFactory:
	 * 		Creates Sessions. Usually an application has a single SessionFactory. 
	 * 		Threads servicing client requests obtain Sessions from the factory.
	 * */
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}
	
	/*
	 * Obtains the current session and adds a new Manager entity to 
	 * the persistant context (aka the database).
	 * */
	@Override
	public void addManager(Manager manager) {
		sessionFactory.getCurrentSession().persist(manager);
		logger.info("Manager saved successfully, Manager Details=" + manager);
	}
	
	@Override
	public void updateManager(Manager manager) {
		sessionFactory.getCurrentSession().update(manager);
		logger.info("Manager updated successfully, Manager Details=" + manager);
	}
	
	@SuppressWarnings({ "unchecked" })
	@Override
	public List<Manager> listManagers() {
		return (List<Manager>) sessionFactory.getCurrentSession()
				.createQuery("from Manager").list();
	}
	
	@Override
	public Manager getManager(int id) {
		return (Manager) sessionFactory.getCurrentSession().get(Manager.class, id);
	}
	
	@Override
	public void deleteManager(Manager manager) {
		Manager eq = (Manager) sessionFactory.getCurrentSession().load(Manager.class, new Integer(manager.getManagerId()));
		if (eq != null) {
			sessionFactory.getCurrentSession().delete(eq);
		}
		logger.info("Manager deleted successfully, Manager Details=" + manager);
	}
}
