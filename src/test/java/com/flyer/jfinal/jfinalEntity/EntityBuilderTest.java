package com.flyer.jfinal.jfinalEntity;

import java.io.IOException;
import java.sql.SQLException;

import com.flyer.jfinal.createEntity.EntityBuilder;

import freemarker.template.TemplateException;
import junit.framework.TestCase;

public class EntityBuilderTest extends TestCase {

	public void testBuild() throws SQLException, IOException, TemplateException {
		
		new EntityBuilder().build("createEntity.properties", "entity.ftl");
	}

}
