package com.test11.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="table_column_info")
@Data
public class TableColumnInfoEntity {
	@Column(name="table_name")
	private String tablename;
	
	@Column(name="column_name")
	private String columnname;
}
