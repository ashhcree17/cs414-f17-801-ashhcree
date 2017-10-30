package com.spring.controllerTest;

import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import com.spring.controller.ManagerController;
import com.spring.model.Manager;
import com.spring.service.ManagerService;

public class ManagerControllerTest {
	@InjectMocks
	ManagerController controller;
	
	@Mock
	ManagerService mockManagerService;
	
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testListManagerInGroup() {
		List<Manager> expectedManagers = Arrays.asList(new Manager());
        when(mockManagerService.listManagers()).thenReturn(expectedManagers);

        Model model = (Model) new Manager();
        model.addAttribute("listManagers", mockManagerService.listManagers());
        String viewName = controller.listManagers(model);

        Assert.assertEquals("managers", viewName);
        Assert.assertTrue(model.containsAttribute("listManagers"));
    }
}
