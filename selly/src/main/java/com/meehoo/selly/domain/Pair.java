/***********************************************************************
 * Module:  Pair.java
 * Author:  Administrator
 * Purpose: Defines the Class Pair
 ***********************************************************************/
package com.meehoo.selly.domain;
import java.util.*;

/** @pdOid 61618f3d-0b53-4e1b-8b6a-4085c58dcce7 */
@Entity
@Table(name="tpair)
public class Pair {
   /** @pdOid d2a0c68a-3683-48c1-9e0e-00ae611f1ee8 */
	@Id
	@GeneratedValue(generator="uuid")
	@GenericGenerator(name="uuid",strategy="uuid")
   public String id;
   /** @pdOid e414c32b-1097-44ed-9c26-c8f979f2f881 */
	@Column(nallable=false)
   public String pairName;
   /** @pdOid d7a7cd7d-a4c7-4070-8e32-c71fd8d98ac7 */
	@Column(nallable=false)
   public float pairPrice;
   
   /** pair是组合，这个网站支持组合销售 */
   /** @pdRoleInfo migr=no name=Clothes assc=pairandclothes coll=java.util.Collection impl=java.util.HashSet mult=0..* */
	@OneToMany
   public java.util.Collection<Clothes> clothes;
   
   
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
