/***********************************************************************
 * Module:  Discount.java
 * Author:  Administrator
 * Purpose: Defines the Class Discount
 ***********************************************************************/
package com.meehoo.selly.domain;
import java.util.*;

/** @pdOid e7b5f7ee-ecc0-4c8a-8a0c-09efb3dce48e */
@Entity
@Table(name="tdiscont")
public class Discount {
   /** @pdOid d76f1dfc-4d40-4a16-8a54-0fda7b7b2577 */
	@Id
	@GeneratedValue(generator="uuid")
	@GenericGenerator(name="uuid",strategy="uuid")
   public String id;
   /** @pdOid e45e662c-c9e5-4f0c-8d5b-1e1acfe4dac7 */
	@Column(nullabel=false)
   public String discountName;
   /** @pdOid f162ccbc-124b-4c36-9d8e-98780e017800 */
	@Column(nullable=false)
   public float discountPrice;
   /** @pdOid 10d85ee2-8d77-402c-808a-372253d855c9 */
	@Column(nullable=false)
   public Date discountTime;
   
   /** @pdRoleInfo migr=no name=Clothes assc=discount coll=java.util.Collection impl=java.util.HashSet mult=0..* side=A */
	@OneToMany
   public Collection<Clothes> clothes;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Clothes> getClothes() {
      if (clothes == null)
         clothes = new java.util.HashSet<Clothes>();
      return clothes;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorClothes() {
      if (clothes == null)
         clothes = new java.util.HashSet<Clothes>();
      return clothes.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newClothes */
   public void setClothes(java.util.Collection<Clothes> newClothes) {
      removeAllClothes();
      for (java.util.Iterator iter = newClothes.iterator(); iter.hasNext();)
         addClothes((Clothes)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newClothes */
   public void addClothes(Clothes newClothes) {
      if (newClothes == null)
         return;
      if (this.clothes == null)
         this.clothes = new java.util.HashSet<Clothes>();
      if (!this.clothes.contains(newClothes))
         this.clothes.add(newClothes);
   }
   
   /** @pdGenerated default remove
     * @param oldClothes */
   public void removeClothes(Clothes oldClothes) {
      if (oldClothes == null)
         return;
      if (this.clothes != null)
         if (this.clothes.contains(oldClothes))
            this.clothes.remove(oldClothes);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllClothes() {
      if (clothes != null)
         clothes.clear();
   }

}
