package com.keyin.treebuilderAPI.controller;

import com.keyin.treebuilderAPI.model.TreeNode;
import com.keyin.treebuilderAPI.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/tree")
public class TreeController {

    @Autowired
    private TreeService treeService;

    @PostMapping
    public String setTree(@RequestBody TreeNode root) {
        treeService.setRoot(root);
        return "Tree has been set.";
    }

    @GetMapping
    public TreeNode getTree() {
        return treeService.getRoot();
    }




}
