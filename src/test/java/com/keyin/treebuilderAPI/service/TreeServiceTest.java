// TreeServiceTest.java
package com.keyin.treebuilderAPI.service;

import com.keyin.treebuilderAPI.model.TreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

public class TreeServiceTest {

    @Test
    public void testTreeBuildFromListCreatesCorrectRoot() {
        TreeService service = new TreeService();
        List<Integer> values = Arrays.asList(10, 5, 15);
        service.buildTreeFromList(values);

        TreeNode root = service.getRoot();
        assertEquals("10", root.getValue());
    }

    @Test
    public void testTreeBuildFromListAddsLeftAndRightNodes() {
        TreeService service = new TreeService();
        List<Integer> values = Arrays.asList(10, 5, 15);
        service.buildTreeFromList(values);

        TreeNode root = service.getRoot();
        assertEquals("5", root.getLeft().getValue());
        assertEquals("15", root.getRight().getValue());
    }

    @Test
    public void testEmptyInputReturnsNullRoot() {
        TreeService service = new TreeService();
        service.buildTreeFromList(Arrays.asList());
        assertNull(service.getRoot());
    }
}
