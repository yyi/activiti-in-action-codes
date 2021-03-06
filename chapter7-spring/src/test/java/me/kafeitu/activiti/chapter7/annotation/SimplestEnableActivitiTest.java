package me.kafeitu.activiti.chapter7.annotation;

import org.activiti.engine.FormService;
import org.activiti.engine.HistoryService;
import org.activiti.engine.ManagementService;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author Joram Barrez
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/a*.xml"})
public class SimplestEnableActivitiTest {

  @Configuration
  public static class SimplestConfiguration {

  }

  @Autowired
  private ProcessEngine processEngine;
  
  @Autowired
  private RuntimeService runtimeService;
  
  @Autowired
  private TaskService taskService;
  
  @Autowired
  private HistoryService historyService;
  
  @Autowired
  private RepositoryService repositoryService;
  
  
  @Autowired
  private ManagementService managementService;
  
  @Autowired
  private FormService formService;
  
  @Test
  public void testAutoWiring() {
  	Assert.assertNotNull(processEngine);
  	Assert.assertNotNull(runtimeService);
  	Assert.assertNotNull(taskService);
  	Assert.assertNotNull(historyService);
  	Assert.assertNotNull(repositoryService);
  	Assert.assertNotNull(managementService);
  	Assert.assertNotNull(formService);
  }

}
