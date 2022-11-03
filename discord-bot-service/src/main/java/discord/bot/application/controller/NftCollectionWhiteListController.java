package discord.bot.application.controller;

import com.gecko.cloud.kit.rest.ResponseData;
import discord.bot.interfaces.query.dto.NftCollectionWhiteListDTO;
import discord.bot.interfaces.query.impl.NftCollectionWhiteListImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/collection")
public class NftCollectionWhiteListController {

    @Autowired
    NftCollectionWhiteListImpl nftCollectionWhiteList;

    @Autowired

    @GetMapping("/whitelist")
    public ResponseData<List<NftCollectionWhiteListDTO>> whitelist() {
        return ResponseData.success(nftCollectionWhiteList.list());
    }

}
