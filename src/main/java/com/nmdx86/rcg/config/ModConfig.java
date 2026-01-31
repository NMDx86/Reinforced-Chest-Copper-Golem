package com.nmdx86.rcg.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

import java.util.ArrayList;
import java.util.List;

@Config(name = "reinfgolem")
public class ModConfig implements ConfigData {
    //Add Input (Storage that Copper Golem take from)
    @ConfigEntry.Gui.Tooltip
    public List<String> inputChests = new ArrayList<>();

    //Add Output (Storage that Copper Golem deposit to)
    @ConfigEntry.Gui.Tooltip
    public List<String> outputChests = new ArrayList<>(List.of(
            "reinfchest:copper_chest",
            "reinfchest:iron_chest",
            "reinfchest:gold_chest",
            "reinfchest:diamond_chest",
            "reinfchest:netherite_chest")
        );

    //Enable Input list
    @ConfigEntry.Gui.Tooltip
    public boolean allowReinforcedAsInput = true;

    //Enable Output list
    @ConfigEntry.Gui.Tooltip
    public boolean allowReinforcedAsOutput = true;

}