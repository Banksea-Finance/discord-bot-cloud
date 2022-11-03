package discord.bot.interfaces.query.impl;

import discord.bot.infrastructure.db.entity.NftCollectionWhiteListDO;
import discord.bot.infrastructure.db.repository.NftCollectionWhiteListRepositoryImpl;
import discord.bot.interfaces.query.assembler.NftCollectionWhiteListDTOAssembler;
import discord.bot.interfaces.query.dto.NftCollectionWhiteListDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class NftCollectionWhiteListImpl {
    @Autowired
    NftCollectionWhiteListRepositoryImpl nftCollectionWhiteListRepository;
    @Autowired
    NftCollectionWhiteListDTOAssembler converter;

    public List<NftCollectionWhiteListDTO> list() {
        List<NftCollectionWhiteListDO> nftCollectionWhiteListDOS = nftCollectionWhiteListRepository.selectList();
        return nftCollectionWhiteListDOS.stream().map(converter::apply).collect(Collectors.toList());
    }
}
