package org.gastnet.usermicro.command.service;

import org.gastnet.usermicro.command.InitializeIndividualUserSagaCommand;
import org.gastnet.usermicro.dto.BusinessUserDTO;
import org.gastnet.usermicro.dto.IndividualUserDTO;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class UserCommandServiceImpl implements UserCommandService{


//	private final CommandGateway commandGateway;
//
//    public UserCommandServiceImpl(CommandGateway commandGateway) {
//        this.commandGateway = commandGateway;
//    }

	@Override
	public CompletableFuture<Long> saveIndividualUser(IndividualUserDTO individualUserDTO) {
		return null; //commandGateway.send(new InitializeIndividualUserSagaCommand(UUID.randomUUID().toString(),individualUserDTO));
	}

	@Override
	public CompletableFuture<Long> saveBusinessUser(BusinessUserDTO businessUserDTO) {
		return null; // commandGateway.send(new InitializeBusinessUserSagaCommand(UUID.randomUUID().toString(),businessUserDTO));
	}



}
