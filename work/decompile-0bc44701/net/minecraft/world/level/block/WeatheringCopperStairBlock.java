package net.minecraft.world.level.block;

import java.util.Random;
import net.minecraft.core.BlockPosition;
import net.minecraft.server.level.WorldServer;
import net.minecraft.world.level.block.state.BlockBase;
import net.minecraft.world.level.block.state.IBlockData;

public class WeatheringCopperStairBlock extends BlockStairs implements WeatheringCopper {

    private final WeatheringCopper.a weatherState;

    public WeatheringCopperStairBlock(WeatheringCopper.a weatheringcopper_a, IBlockData iblockdata, BlockBase.Info blockbase_info) {
        super(iblockdata, blockbase_info);
        this.weatherState = weatheringcopper_a;
    }

    @Override
    public void randomTick(IBlockData iblockdata, WorldServer worldserver, BlockPosition blockposition, Random random) {
        this.onRandomTick(iblockdata, worldserver, blockposition, random);
    }

    @Override
    public boolean isRandomlyTicking(IBlockData iblockdata) {
        return WeatheringCopper.getNext(iblockdata.getBlock()).isPresent();
    }

    @Override
    public WeatheringCopper.a getAge() {
        return this.weatherState;
    }
}
