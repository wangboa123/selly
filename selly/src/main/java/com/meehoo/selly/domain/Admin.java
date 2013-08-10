

/***********************************************************************
 * Module:  Admin.java
 * Author:  Administrator
 * Purpose: Defines the Class Admin
 ***********************************************************************/
package com.meehoo.selly.domain;
import java.util.*;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.id.factory.*;
/** @pdOid 8f1e6fc8-de03-4a49-b8b0-3c5b35839389 */
@Entity
@Table(name="tadmin")
public class Admin {
 
	 /** @pdOid 26888565-c76f-477c-8b76-3c73b4b72a9b */
	   @Id
	   @GeneratedValue(generator="uuid")
	   @GenericGenerator(name="uuid",strategy="uuid")
	   public String id;
	   
	   /** @pdOid f735ae99-e671-4f07-a394-d3106361c887 */
		@Column(nullable=false)
	   public String adminId;
	   /** @pdOid 53e2687e-bfbf-4a1b-bef7-dea84f9aff32 */
	   @Column(nullable=false)
		public String adminPwd;
	     
	
	
	public String getAdminPwd() {
		return adminPwd;
	}
	public void setAdminPwd(String adminPwd) {
		this.adminPwd = adminPwd;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
public String getAdminId() {
	return adminId;
}
public void setAdminId(String adminId) {
	this.adminId = adminId;
}

}