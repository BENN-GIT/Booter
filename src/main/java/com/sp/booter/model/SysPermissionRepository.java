package com.sp.booter.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SysPermissionRepository extends JpaRepository<SysPermission,Long> {

}
