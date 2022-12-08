package org.mklinkj.ddd_start_study;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * 초기화 SQL 스크립트 실행 확인을 위해 임시로 넣은 엔티티 
 */
@Entity
public class User {
  @Id
  private String userId;

}
