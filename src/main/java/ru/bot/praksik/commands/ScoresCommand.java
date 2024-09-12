package ru.bot.praksik.commands;

import discord4j.core.event.domain.interaction.ChatInputInteractionEvent;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class ScoresCommand implements SlashCommand {

    @Override
    public String getName() {
        return "scores";
    }

    @Override
    public Mono<Void> handle(ChatInputInteractionEvent event) {
        return event.reply()
                .withEphemeral(false)
                .withContent("У меня педикулез");
    }
}
