package com.owl.chatapp.dto.request;

import java.util.UUID;

public record SendMessageRequestDTO(UUID chatId, String content) {
}
