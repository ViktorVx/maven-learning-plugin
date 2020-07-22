package org.pva;

import org.apache.maven.plugin.testing.AbstractMojoTestCase;
import org.pva.DependencyCounterMojo;

import java.io.File;

public class DependencyCounterMojoTest extends AbstractMojoTestCase {

    /**
     * @throws Exception
     */
    public void testMojoGoal() throws Exception {
        File testPom = new File(getBasedir(), "src/test/resources/test-pom.xml" );
        DependencyCounterMojo mojo = (DependencyCounterMojo) lookupMojo( "dependency-counter", testPom);

        assertNotNull(mojo);
    }

}