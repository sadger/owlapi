package org.obolibrary.oboformat;

import static junit.framework.Assert.*;

import org.junit.Test;
import org.obolibrary.obo2owl.OboFormatTestBasics;
import org.obolibrary.oboformat.model.Frame;
import org.obolibrary.oboformat.model.FrameStructureException;
import org.obolibrary.oboformat.model.OBODoc;

public class MultipleCommentsTest extends OboFormatTestBasics {
	
	@Test(expected=FrameStructureException.class)
	public void testCheckForMultipleCommentsinFrame() throws Exception {
		OBODoc obodoc = parseOBOFile("multiple_comments_test.obo");
		assertTrue(obodoc.getTermFrames().size() == 1);
		Frame frame = obodoc.getTermFrames().iterator().next();
		assertNotNull(frame);
		
		renderOboToString(obodoc); // throws FrameStructureException
	}

}
