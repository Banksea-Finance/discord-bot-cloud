package discord.bot.application.controller;

import com.gecko.cloud.kit.rest.ResponseData;
import discord.bot.interfaces.query.dto.NftCollectionValuationDTO;
import discord.bot.interfaces.query.impl.ValuationImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("valuation")
public class ValuationController {
    @Autowired
    ValuationImpl valuationService;
    @GetMapping("/{symbol}")
    public ResponseData<NftCollectionValuationDTO> valuation(@PathVariable("symbol") String symbol) {
        return ResponseData.success(valuationService.valuation(symbol));
    }
}
