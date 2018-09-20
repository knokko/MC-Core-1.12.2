package nl.knokko.util.forge.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import nl.knokko.util.blocks.BlockPlacer;
import nl.knokko.util.blocks.BlockType;

public class ForgeBlockPlacer implements BlockPlacer {
	
	private World world;

	public ForgeBlockPlacer(World world) {
		setWorld(world);
	}
	
	public ForgeBlockPlacer(){}
	
	public void setWorld(World world){
		if(world == null)
			throw new NullPointerException("world");
		this.world = world;
	}

	public void place(BlockType blocktype, int x, int y, int z) {
		Block block = getBlock(blocktype);
		if(block == null)
			throw new IllegalArgumentException("Unavailable block: " + blocktype);
		if(blocktype.getMetaData() == 0)
			world.setBlockState(new BlockPos(x, y, z), block.getDefaultState());
		else 
			world.setBlockState(new BlockPos(x, y, z), block.getStateFromMeta(blocktype.getMetaData()));
	}
	
	public static Block getBlock(BlockType blocktype){
		return Block.REGISTRY.getObject(new ResourceLocation(blocktype.getBlockID()));
	}
}
