package ee.mj1400.kt;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for Yl1.
 */
public class Tests {

    @Test
    public void wordTest() {

        Word testwordobj = new Word("pere");
        assertEquals("Pere returns one p", 1, testwordobj.charCount('p'));
        assertEquals("Pere returns two e's", 2, testwordobj.charCount('e'));
        assertEquals("Pere returns one r", 1, testwordobj.charCount('r'));

    }

    @Test
    public void sentenceTest() {
        Sentence testsentenceobj = new Sentence("Ananass apple maa map");
        testsentenceobj.wordCount();
        testsentenceobj.getWordObjList().toString();
        assertEquals("Sentence returns 6 a's", 6, testsentenceobj.getSentenceCharCount('a'));
    }
}
