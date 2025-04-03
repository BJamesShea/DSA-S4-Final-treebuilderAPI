package com.keyin.treebuilderAPI.service;

import com.keyin.treebuilderAPI.model.TreeNode;
import org.springframework.stereotype.Service;


@Service
public class TreeService {

    private TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

}
