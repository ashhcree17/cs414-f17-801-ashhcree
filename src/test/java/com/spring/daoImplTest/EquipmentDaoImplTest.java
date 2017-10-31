package com.spring.daoImplTest;

import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import junit.framework.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
//import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.spring.dao.EquipmentDao;
import com.spring.model.Equipment;

//@ContextConfiguration(locations = "classpath:application-context-test.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class EquipmentDaoImplTest {
     
    @Autowired
    private EquipmentDao equipmentDao;
    
    Equipment equipment1 = new Equipment();
    Equipment equipment2 = new Equipment();
    
    @Before
    public void setup() {
        equipment1.setEquipmentId(1);
        equipment1.setName("Equip1");
        equipment1.setQuantity(2);
        equipment1.setExercises(null);

        equipment2.setEquipmentId(2);
        equipment1.setName("Equip2");
        equipment1.setQuantity(4);
        equipment1.setExercises(null);
    }
     
    @Test
    @Transactional
    @Rollback(true)
    public void testAddEquipment() {
		List<Equipment> inventory = equipmentDao.listInventory();

		equipmentDao.addEquipment(equipment1);
    Assert.assertEquals(1, inventory.size());         
		
    equipmentDao.addEquipment(equipment2);
    Assert.assertEquals(2, inventory.size());         
	 
    Assert.assertEquals(equipment1.getName(), inventory.get(0).getName());
}
    
    @Test
    @Transactional
    @Rollback(true)
    public void testDeleteEquipment() {
		equipmentDao.addEquipment(equipment1);
        equipmentDao.addEquipment(equipment2);

		equipmentDao.deleteEquipment(equipment1.getEquipmentId());
        Assert.assertEquals(1, equipmentDao.listInventory().size());
    }
}