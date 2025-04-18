package com.keyin.treebuilderAPI.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tree_nodes")
public class TreeNodeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String value;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "left_id")
    private TreeNodeEntity left;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "right_id")
    private TreeNodeEntity right;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public TreeNodeEntity getLeft() {
        return left;
    }

    public void setLeft(TreeNodeEntity left) {
        this.left = left;
    }

    public TreeNodeEntity getRight() {
        return right;
    }

    public void setRight(TreeNodeEntity right) {
        this.right = right;
    }
}
