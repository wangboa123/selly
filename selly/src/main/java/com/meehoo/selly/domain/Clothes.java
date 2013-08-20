

/***********************************************************************
 * Module:  Clothes.java
 * Author:  Administrator
 * Purpose: Defines the Class Clothes
 ***********************************************************************/
package com.meehoo.selly.domain;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/** @pdOid 0fc742a0-358b-4f64-ab2f-aee117acf989 */
@Entity
@Table(name ="tclothes")
public class Clothes {
   /** @pdOid 69cf1280-2f86-46dd-b39b-a6a905428c83 */
   @Id
   @GeneratedValue(generator="uuid")
   @GenericGenerator(name="uuid",strategy="uuid")
   public java.lang.String id;

   /** @pdOid b9028986-4765-48a0-bc1a-8b7e7372142c */
   @Column(length=255,nullable=false)
   public java.lang.String clothesType;
   /** @pdOid e59faeaa-8ade-404a-8ae2-77317b84d93a */
   @Column(nullable=false)
   public int color;
   /** @pdOid b9e7969f-a323-4ff2-9e73-7b0a90c5092d */
   @Column(nullable=false)
   public float price;
   /** @pdOid 51a9be32-981a-4c54-8180-48b39912554b */
   @Column(nullable=false)
   public java.lang.String material;
   /** @pdOid a0d6bb96-81b9-4fa6-900c-a798e3fdf919 */
   @Column(nullable=false)
   public int season;
   /** @pdOid d5f17a72-106e-4f14-b227-0d38fe5eb71c */
   @Column(nullable=false)
   public int clothesSize;
   /** @pdOid 0e09db22-ba3e-4d07-9e74-c69697a0967f */
   @Column(nullable=false)
   public int remainNum;
   /** @pdOid 06035544-cf33-41e7-9910-82e13c301ca0 */
   public java.lang.String countory;
   /** @pdOid 30012883-f91d-4bd4-a94b-32d13122085d */
   @Column(nullable=false)
   public int sex;
   /** @pdOid 03721686-fdd4-4a98-af70-d081f6aa53b9 */
   @Column(nullable=false)
   public boolean newStyle;

}
