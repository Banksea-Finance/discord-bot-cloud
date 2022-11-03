package discord.bot.interfaces.query.impl;

import discord.bot.infrastructure.db.repository.NftCollectionValuationRepositoryImpl;
import discord.bot.interfaces.query.dto.NftCollectionValuationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ValuationImpl {

    @Autowired
    NftCollectionValuationRepositoryImpl nftCollectionValuationService;

    public NftCollectionValuationDTO valuation(String symbol) {
        return nftCollectionValuationService.valuation(symbol);
    }
}
