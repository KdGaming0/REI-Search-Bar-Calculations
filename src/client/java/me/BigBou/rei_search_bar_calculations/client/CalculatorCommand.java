package me.BigBou.rei_search_bar_calculations.client;

import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.Text;

public class CalculatorCommand {
    public static int executeCommandWithArg(CommandContext<ServerCommandSource> context) {
        String value = StringArgumentType.getString(context, "value");
        context.getSource().sendFeedback(() -> Text.literal(CalculatorSearch.format(value)), false);
        return 1;
    }
}
