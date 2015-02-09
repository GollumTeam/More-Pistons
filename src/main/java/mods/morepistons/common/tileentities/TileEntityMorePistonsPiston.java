package mods.morepistons.common.tileentities;

import static mods.morepistons.ModMorePistons.log;
import mods.gollum.core.utils.math.Integer3d;
import mods.morepistons.common.block.BlockMorePistonsBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;


public class TileEntityMorePistonsPiston extends TileEntity {
	
	public  int       currentOpened = 0;
	public  boolean   running       = false;
	public  Integer3d extentionPos  = new Integer3d();
	
	public TileEntityMorePistonsPiston () {
	}
	
	
	public BlockMorePistonsBase getBlockPiston() {
		return (BlockMorePistonsBase)this.worldObj.getBlock(this.xCoord, this.yCoord, this.zCoord);
	}	
	
	public void updateEntity() {
		super.updateEntity();
	}
	
	
	@Override
	public void readFromNBT(NBTTagCompound nbtTagCompound) {
		super.readFromNBT(nbtTagCompound);
		this.currentOpened  = nbtTagCompound.getInteger("currentOpened");
		this.running        = nbtTagCompound.getBoolean("running");
		this.extentionPos.x = nbtTagCompound.getInteger("extentionPosX");
		this.extentionPos.y = nbtTagCompound.getInteger("extentionPosY");
		this.extentionPos.z = nbtTagCompound.getInteger("extentionPosZ");
	}

	@Override
	public void writeToNBT(NBTTagCompound nbtTagCompound) {
		nbtTagCompound.setInteger("currentOpened", this.currentOpened);
		nbtTagCompound.setBoolean("running"      , this.running);
		nbtTagCompound.setInteger("extentionPosX", this.extentionPos.x);
		nbtTagCompound.setInteger("extentionPosY", this.extentionPos.y);
		nbtTagCompound.setInteger("extentionPosZ", this.extentionPos.z);
		super.writeToNBT(nbtTagCompound);
	}


	
	
}
