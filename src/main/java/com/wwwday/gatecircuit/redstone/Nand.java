package com.wwwday.gatecircuit.redstone;

import com.wwwday.gatecircuit.ModBlockStateProperties;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.Direction;


public class Nand extends Gate {
    public static final BooleanProperty POWERED = BlockStateProperties.POWERED;
    public static final BooleanProperty LEFT = ModBlockStateProperties.LEFT;
    public static final BooleanProperty RIGHT = ModBlockStateProperties.RIGHT;

    public Nand(Properties p_i48416_1_) {
        super(p_i48416_1_);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH)
                .setValue(POWERED, Boolean.TRUE).setValue(LEFT, Boolean.FALSE).setValue(RIGHT, Boolean.FALSE));
    }

    @Override
    protected boolean getLogic(boolean x, boolean y) {
        return !(x && y);
    }
}
