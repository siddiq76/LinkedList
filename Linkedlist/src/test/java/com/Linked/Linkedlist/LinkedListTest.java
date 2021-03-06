package com.Linked.Linkedlist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class LinkedListTest 
{
	LinkedList linkedList; 
    /**
     * Rigorous Test :-)
     */
	
	@Before
	public void init() {
		linkedList = new LinkedList();
	}
	
	
    @Test
    public void addElementsAtFirst_Correct(){
    	linkedList.addNodeAtFirst(70);
    	linkedList.addNodeAtFirst(30);
    	linkedList.addNodeAtFirst(56);
        assertEquals(3, linkedList.getSize());
        assertEquals(56, linkedList.returnFirst());
    }
    
    @Test
    public void addElementsAtFirst_InCorrect(){
    	linkedList.addNodeAtFirst(70);
    	linkedList.addNodeAtFirst(30);
    	linkedList.addNodeAtFirst(56);
        assertEquals(3, linkedList.getSize());
        assertNotEquals(70, linkedList.returnFirst());
    }
    
    @Test
    public void addElementsAtLast_Correct(){
    	linkedList.addNodeAtLast(56);
    	linkedList.addNodeAtLast(30);
    	linkedList.addNodeAtLast(70);
        assertEquals(3, linkedList.getSize());
        assertEquals(56, linkedList.returnFirst());
    }
    
    @Test
    public void addElementsAtLast_InCorrect(){
    	linkedList.addNodeAtLast(56);
    	linkedList.addNodeAtLast(30);
    	linkedList.addNodeAtLast(70);
        assertEquals(3, linkedList.getSize());
        assertNotEquals(70, linkedList.returnFirst());
    }
    
    @Test
    public void addElementsAtIndex_Correct(){
    	linkedList.addNodeAtLast(56);
    	linkedList.addNodeAtLast(70);
//    	for adding element in between please specify index as 1 in runtime
    	linkedList.addNodeAtIndex(30);
        assertEquals(3, linkedList.getSize());
        assertEquals(56, linkedList.returnFirst());
    }
    
    @Test
    public void addElementsAtIndex_InCorrect(){
    	linkedList.addNodeAtLast(56);
    	linkedList.addNodeAtLast(70);
//    	for adding element in at front please specify index as 0 in runtime
    	linkedList.addNodeAtIndex(30);
        assertEquals(3, linkedList.getSize());
        assertNotEquals(56, linkedList.returnFirst());
    }
    
    @Test
    public void deleteFirstNode_Correct(){
    	linkedList.addNodeAtLast(56);
    	linkedList.addNodeAtLast(70);
//    	for adding element in between index taken as 1
    	linkedList.addNodeAtIndex(30,1);
    	linkedList.pop();
        assertEquals(2, linkedList.getSize());
        assertEquals(30, linkedList.returnFirst());
    }
    
    @Test
    public void deleteFirstNode_InCorrect(){
    	linkedList.addNodeAtLast(56);
    	linkedList.addNodeAtLast(70);
//    	for adding element in between index taken as 1
    	linkedList.addNodeAtIndex(30,1);
    	linkedList.pop();
        assertNotEquals(56, linkedList.returnFirst());
    }
    
    @Test
    public void deleteLastNodeTest_Correct(){
    	linkedList.addNodeAtLast(56);
    	linkedList.addNodeAtLast(70);
//    	for adding element in between index taken as 1
    	linkedList.addNodeAtIndex(30,1);
    	linkedList.popLast();
        assertEquals(2, linkedList.getSize());
        assertEquals(56, linkedList.returnFirst());
    }
    
    @Test
    public void deleteLastNodeTest_InCorrect(){
    	linkedList.addNodeAtLast(56);
    	linkedList.addNodeAtLast(70);
//    	for adding element in between index taken as 1
    	linkedList.addNodeAtIndex(30,1);
    	linkedList.popLast();
        assertEquals(2, linkedList.getSize());
        assertNotEquals(30, linkedList.returnFirst());
    }
    @Test
    public void searchNodeTest_Correct(){
    	linkedList.addNodeAtLast(56);
    	linkedList.addNodeAtLast(70);
//    	for adding element in between index taken as 1
    	linkedList.addNodeAtIndex(30,1);
    	linkedList.popLast();
        assertEquals(2, linkedList.getSize());
        assertTrue("The value is not present in list", linkedList.search(30));
    }
    
    @Test
    public void searchNodeTest_InCorrect(){
    	linkedList.addNodeAtLast(56);
    	linkedList.addNodeAtLast(70);
//    	for adding element in between index taken as 1
    	linkedList.addNodeAtIndex(30,1);
    	linkedList.popLast();
        assertEquals(2, linkedList.getSize());
        assertFalse("The value is present inside list", linkedList.search(70));
    }
    
    @Test
    public void addNodeAfterTest_Correct(){
    	linkedList.addNodeAtLast(56);
    	linkedList.addNodeAtLast(70);
//    	for adding element in between index taken as 1
    	linkedList.addNodeAtIndex(30,1);
    	linkedList.addNodeAfter(40, 30);
    	linkedList.popLast();
        assertEquals(3, linkedList.getSize());
        assertEquals(56, linkedList.returnFirst());
    }
    
    @Test
    public void addNodeAfterTest_InCorrect(){
    	linkedList.addNodeAtLast(56);
    	linkedList.addNodeAtLast(70);
//    	for adding element in between index taken as 1
    	linkedList.addNodeAtIndex(30,1);
    	linkedList.addNodeAfter(40, 30);
    	linkedList.popLast();
        assertEquals(3, linkedList.getSize());
        assertNotEquals(40, linkedList.returnFirst());
    }
}
