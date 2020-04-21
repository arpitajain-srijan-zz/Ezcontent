package com.Ezcontent.Automation;

import org.testng.annotations.Test;

import Base.BaseClass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;

public class SetupSuite {
//  @Test
//  public void f() {
//  }
//  @AfterClass
//  public void afterClass() {
//  }

  @BeforeSuite
  public void beforeSuite() {
	  BaseClass.beforeSuite();
	  
  }

}
