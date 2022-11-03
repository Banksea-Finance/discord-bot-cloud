package discord.bot.application.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class Test {
    @GetMapping("test")
    public void test(@RequestParam String xxx,  String yyy) {
      log.info("xxx={}, yyy={}", xxx, yyy);
    }
}
