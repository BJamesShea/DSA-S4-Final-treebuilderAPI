package com.keyin.treebuilderAPI.service;

import com.keyin.treebuilderAPI.model.TreeNode;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class TreeService {

    private TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public void buildTreeFromList(List<Integer> values) {
        root = null; // resetting

        for  (int value : values) {
            root = insertRecursive(root, value);
        }
    }

    private TreeNode insertRecursive(TreeNode node, int value) {
        if (node == null) {
            return new TreeNode(String.valueOf(value));
        }

        int currentValue = Integer.parseInt(node.getValue());

        if (value < currentValue) {
            node.setLeft(insertRecursive(node.getLeft(), value));
        } else {
            node.setRight(insertRecursive(node.getRight(), value));
        }
         return node;
    }

}
