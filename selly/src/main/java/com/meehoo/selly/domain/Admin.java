

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

/** @pdOid 8f1e6fc8-de03-4a49-b8b0-3c5b35839389 */
@Entity
@Table(name="tadmin")
public class Admin {
 
	
	
	/** @pdOid f735ae99-e671-4f07-a394-d3106361c887 */
	@Column(nullable=false)
   public java.lang.String adminId;
   /** @pdOid 53e2687e-bfbf-4a1b-bef7-dea84f9aff32 */
   @Column(nullable=false)
	public java.lang.String adminPwd;
   /** @pdOid 26888565-c76f-477c-8b76-3c73b4b72a9b */
   @Id
   @GeneratedValue(generator="uuid2")
   @GenericGenerator(name="uuid2",strategy="uuid2")
   public java.lang.String id;

}