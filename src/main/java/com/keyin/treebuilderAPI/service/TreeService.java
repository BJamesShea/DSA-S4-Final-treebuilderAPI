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

}
