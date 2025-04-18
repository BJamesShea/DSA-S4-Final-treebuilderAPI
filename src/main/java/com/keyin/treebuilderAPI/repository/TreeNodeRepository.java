package com.keyin.treebuilderAPI.repository;

import com.keyin.treebuilderAPI.model.TreeNodeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TreeNodeRepository extends JpaRepository<TreeNodeEntity, Long> {
}
