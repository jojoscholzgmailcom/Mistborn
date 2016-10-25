package com.mistborn.entity;

import com.mistborn.main.Mistborn;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class Entityobsidiandolch extends EntityThrowable {
	
	
	public Entityobsidiandolch(World world){
		super(world);
	}
	public Entityobsidiandolch(World world, EntityLivingBase entity){
		
		super(world, entity);
	}
	@Override
	protected void onImpact(MovingObjectPosition position) {
		if(!this.worldObj.isRemote){
			this.setDead();
			if(!this.worldObj.isRemote){
				if(position.entityHit != null){
					//position.entityHit.setFire(8);
					//DamageSource damagesource = null;
					position.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), (float)8);
			        
					//damagesource = DamageSource.causeIndirectMagicDamage(this, position.entityHit);
					//this.worldObj.getClosestPlayerToEntity(this, 100).addPotionEffect(new PotionEffect(Potion.harm.id, 1, 2));
				}else{
					dropItem(Mistborn.obsidiandolch, 1); 
				}
			}
		}
		
	}

}
