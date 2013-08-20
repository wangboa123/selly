/***********************************************************************
 * Module:  User.java
 * Author:  Administrator
 * Purpose: Defines the Class User
 ***********************************************************************/
package com.meehoo.selly.domain;
import java.util.*;

/** @pdOid 14cced87-b1bd-4195-ac05-fc4f96542627 */
@Entity
@Table(name="tuser")
public class User {
   /** @pdOid 095cd6d6-ab4c-4822-a552-c012c9aca2e3 */
	@Id
	@GeneratedValue(genertor="uuid")
	@GenericGenerator(name="uuid",strategy="uuid")
   public String userID;
   /** @pdOid 85a63777-5a9a-409b-ae8d-566076f3777f */
	@Column(nullable=false)
   public String userName;
   /** @pdOid 7052c4a3-ab7b-4f78-a69e-50aa1ecd6c54 */
	@Column(nullable=false)
   public String id;

}
