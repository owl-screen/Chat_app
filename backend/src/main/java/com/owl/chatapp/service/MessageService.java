package com.owl.chatapp.service;

import com.owl.chatapp.dto.request.SendMessageRequestDTO;
import com.owl.chatapp.exception.ChatException;
import com.owl.chatapp.exception.MessageException;
import com.owl.chatapp.exception.UserException;
import com.owl.chatapp.model.Message;
import com.owl.chatapp.model.User;

import java.util.List;
import java.util.UUID;

public interface MessageService {

    Message sendMessage(SendMessageRequestDTO req, UUID userId) throws UserException, ChatException;

    List<Message> getChatMessages(UUID chatId, User reqUser) throws UserException, ChatException;

    Message findMessageById(UUID messageId) throws MessageException;

    void deleteMessageById(UUID messageId, User reqUser) throws UserException, MessageException;

}
