package me.BigBou.rei_search_bar_calculations.client;

import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.context.CommandContext;
import net.fabricmc.fabric.api.client.command.v2.FabricClientCommandSource;
import net.minecraft.text.Text;

public class CalculatorCommand {
    public static int executeCommandWithArg(CommandContext<FabricClientCommandSource> context) {
        String value = StringArgumentType.getString(context, "value");
        context.getSource().getPlayer().sendMessage(Text.of(CalculatorSearch.format(value)), false);
        return 1;
    }
}
