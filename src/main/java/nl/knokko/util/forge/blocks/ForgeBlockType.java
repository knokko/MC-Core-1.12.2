package nl.knokko.util.forge.blocks;

import java.io.DataInputStream;
import java.io.IOException;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import nl.knokko.util.blocks.BlockType;

public class ForgeBlockType extends BlockType {

	public ForgeBlockType(DataInputStream input) throws IOException {
		super(input);
	}
	
	public ForgeBlockType(String id, int meta){
		super(id, meta);
	}
	
	public ForgeBlockType(IBlockState block){
		this(Block.REGISTRY.getNameForObject(block.getBlock()).toString(), block.getBlock().getMetaFromState(block));
	}
	
	public ForgeBlockType(Block block, int meta){
		this(block.getStateFromMeta(meta));
	}
	
	/*
	private final Block block;
	
	private final byte meta;
	
	public static ForgeBlockType fromNBT(NBTTagCompound nbt, String key){
		int id = nbt.getInteger(key);
		Block block = Block.getBlockById(id / 16);
		int meta = id - id / 16 * 16;
		return new ForgeBlockType(block, meta);
	}
	
	public ForgeBlockType(Block block, int meta){
		if(block == null)
			throw new NullPointerException("Block parameter is null");
		this.block = block;
		if(meta < 0 || meta >= 16)
			throw new IllegalArgumentException("Meta out of range: " + meta);
		this.meta = (byte) meta;
	}
	
	public ForgeBlockType(Block block){
		this(block, 0);
	}
	
	public ForgeBlockType(IBlockState block){
		this(block.getBlock(), block.getBlock().getMetaFromState(block));
	}
	
	@Override
	public boolean equals(Object other){
		if(other instanceof ForgeBlockType){
			ForgeBlockType bt = (ForgeBlockType) other;
			return bt.block == block && bt.meta == meta;
		}
		return false;
	}
	
	@Override
	public int hashCode(){
		return id();
	}
	
	@Override
	public String toString(){
		return block.toString() + "[" + meta + "]";
	}

	public int compareTo(ForgeBlockType bt) {
		int hash = hashCode();
		int other = bt.hashCode();
		if(hash > other)
			return 1;
		if(hash < other)
			return -1;
		return 0;
	}
	
	public void place(World world, int x, int y, int z){
		world.setBlockState(new BlockPos(x, y, z), getBlock().getStateFromMeta(getMetaData()));
	}
	
	public Block getBlock(){
		return block;
	}
	
	public byte getMetaData(){
		return meta;
	}
	
	public int id(){
		return Block.getIdFromBlock(block) * 16 + meta;
	}
	
	public void save(NBTTagCompound nbt, String key){
		nbt.setInteger(key, id());
	}

	public int compareTo(BlockType other) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean sameBlock(BlockType other) {
		// TODO Auto-generated method stub
		return false;
	}

	public String getBlockID() {
		// TODO Auto-generated method stub
		return null;
	}
	*/
}