package discord.bot.application.controller;

import com.gecko.cloud.kit.rest.ResponseData;
import discord.bot.infrastructure.db.entity.DiscordChannelDO;
import discord.bot.interfaces.query.command.cmd.CollectionNftCommand;
import discord.bot.interfaces.query.dto.CollectionDTO;
import discord.bot.interfaces.query.dto.CollectionNftDTO;
import discord.bot.interfaces.query.impl.DiscordImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Discord-bot控制器
 *
 * @author qiang
 * @date 2022/11/28
 */
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@RequestMapping("discord")
public class DiscordController {
    private final DiscordImpl discord;

    @GetMapping("/config/{channelId}")
    public ResponseData<List<String>> config(@PathVariable String channelId) {
        return ResponseData.success(discord.config(channelId));
    }

    @PostMapping("/bind")
    public ResponseData<Boolean> bind(@RequestBody DiscordChannelDO discordChannelDO) {
        return ResponseData.success(discord.bind(discordChannelDO));
    }

    @PostMapping("/unbind")
    public ResponseData<Boolean> unbind(@RequestBody DiscordChannelDO discordChannelDO) {
        return ResponseData.success(discord.unbind(discordChannelDO));
    }

    @PostMapping("nftInfo")
    public ResponseData<CollectionNftDTO> nftInfo(@RequestBody CollectionNftCommand collectionNftCommand) {
        return ResponseData.success(discord.nftInfo(collectionNftCommand));
    }

    @GetMapping("/collection/{contractAddress}")
    public ResponseData<CollectionDTO> collection(@PathVariable String contractAddress) {
        return ResponseData.success(discord.collection(contractAddress));
    }
}
