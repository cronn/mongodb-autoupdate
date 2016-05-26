package de.cronn.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;

/**
 * Test class for {@link MongoDBMigrator}
 * 
 * @author Leandro Baltazar, cronn GmbH
 */
public class MongoDBMigratorTest {

	@Test
	public void testGetResourceContent() throws Exception {
		// given
		Resource r = new ByteArrayResource(
				"var sum = function (a, b) {\n\r\t	return a + b;\n\r};\n\r\n\r\n    console.log(sum(17, 4));"
						.getBytes());

		// when
		String resourceContent = new MongoDBMigrator().getResourceContent(r);

		// then
		assertEquals("var sum = function (a, b) {\n\r\t	return a + b;\n\r};\n\r\n\r\n    console.log(sum(17, 4));",
				resourceContent);
	}
}
