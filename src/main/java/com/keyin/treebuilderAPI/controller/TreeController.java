package com.keyin.treebuilderAPI.controller;

import com.keyin.treebuilderAPI.model.TreeRequestDTO;
import com.keyin.treebuilderAPI.model.TreeNode;
import com.keyin.treebuilderAPI.model.TreeNodeEntity;
import com.keyin.treebuilderAPI.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/tree")
public class TreeController {

    @Autowired
    private TreeService treeService;

    @PostMapping
    public String setTree(@RequestBody TreeRequestDTO request) {

        treeService.buildTreeFromList(request.getValues());

        TreeNodeEntity rootEntity = convertToEntity(treeService.getRoot());

        treeService.saveTree(rootEntity);

        return "Tree has been built and saved.";
    }

    @GetMapping
    public TreeNode getTree() {
        return treeService.getRoot();
    }

    private TreeNodeEntity convertToEntity(TreeNode node) {
        if (node == null) return null;

        TreeNodeEntity entity = new TreeNodeEntity();
        entity.setValue(node.getValue());
        entity.setLeft(convertToEntity(node.getLeft()));
        entity.setRight(convertToEntity(node.getRight()));
        return entity;
    }

    @GetMapping("/all")
    public List<TreeNodeEntity> getAllTrees() {
        return treeService.getAllTrees();
    }
}
