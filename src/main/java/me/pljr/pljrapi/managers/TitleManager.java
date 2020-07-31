package me.pljr.pljrapi.managers;

import com.cryptomorin.xseries.messages.Titles;
import me.pljr.pljrapi.objects.PLJRTitle;
import org.bukkit.entity.Player;

public class TitleManager {

    public static void send(Player player, PLJRTitle title){
        Titles.sendTitle(player, title.getIn(), title.getStay(), title.getOut(), title.getTitle(), title.getSubtitle());
    }

    public static void clear(Player player){
        Titles.clearTitle(player);
    }
}