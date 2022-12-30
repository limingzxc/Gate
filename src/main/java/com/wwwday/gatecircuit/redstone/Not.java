package com.wwwday.gatecircuit.redstone;

import com.wwwday.gatecircuit.ModBlockStateProperties;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.RedstoneDiodeBlock;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Not extends Gate {
    public static final BooleanProperty POWERED = BlockStateProperties.POWERED;
    public static final BooleanProperty IN = ModBlockStateProperties.IN;

    public Not(Properties p_i48416_1_) {
        super(p_i48416_1_);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH)
                .setValue(POWERED, Boolean.TRUE).setValue(IN, Boolean.FALSE));
    }

    @Override
    public void setPlacedBy(World world, BlockPos pos, BlockState state, LivingEntity entity, ItemStack stack) {
        boolean i = getInputSignal(world, pos, state) > 0;
        if (i) {
            world.getBlockTicks().scheduleTick(pos, this, 1);
        }
    }

    @Override
    protected void refreshOutputState(World world, BlockPos pos, BlockState state) {
        boolean i = getInputSignal(world, pos, state) > 0;

        boolean in = state.getValue(IN);

        boolean flag = getLogic(i, i);

        if(i != in) {
            world.setBlock(pos, state.setValue(IN, i).setValue(POWERED, flag), 2);
        }

        this.updateNeighborsInFront(world, pos, state);
    }

    @Override
    protected boolean shouldTurnOn(World world, BlockPos pos, BlockState state) {
        boolean i = getInputSignal(world, pos, state) > 0;

        boolean flag = state.getValue(POWERED);
        boolean flag1 = getLogic(i, i);

        boolean in = state.getValue(IN);

        return flag != flag1 || i != in;
    }

    @Override
    protected boolean getLogic(boolean x, boolean y) {
        return !x;
    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> p_206840_1_) {
        p_206840_1_.add(FACING, POWERED, IN);
    }
}
