package org.gastnet.usermicro.saga;

//@Slf4j
//@Saga
public class IndividualUserManagementSaga {

//	@Autowired
//	private transient CommandGateway commandGateway;
//
//	@StartSaga
//	@SagaEventHandler(associationProperty = "individualSagaId")
//	public void handle(CreateUserForIndividualEvent createUserEvent) {
//		log.info("Started Saga --> CreateUserForIndividualEvent triggered:");
//		SagaLifecycle.associateWith("individualSagaId",createUserEvent.individualSagaId);
//		commandGateway.send(new CreateUserForIndividualCommand(createUserEvent.individualSagaId,createUserEvent.individualUserDTO));
//	}
//
//	@SagaEventHandler(associationProperty = "individualSagaId")
//	public void handle(UserForIndividualCreatedEvent userCreatedEvent) {
//		log.info("UserForIndividualCreatedEvent triggered:");
//		Long userId = userCreatedEvent.individualUserDTO.getUser().getUserId();
//		SagaLifecycle.associateWith("userId",userId);
//		commandGateway.send(new CreateIndividualCommand(userId , SagaUtils.convertIndividualForSaga(userCreatedEvent.individualUserDTO.getIndividual())));
//	}
//
//	@SagaEventHandler(associationProperty = "userId")
//	public void handle(IndividualCreatedEvent individualCreatedEvent) {
//		log.info("IndividualCreatedEvent triggered: ");
//		Long userId = individualCreatedEvent.userId;
//		SagaLifecycle.associateWith("userId",userId);
//		commandGateway.send(new FinishIndividualUserCreationCommand(userId));
//	}
//
//	@SagaEventHandler(associationProperty = "userId")
//	public void handle(IndividualUserFinishedEvent individualUserFinishedEvent) {
//		log.info("IndividualUserFinishedEvent troggered: ");
//		SagaLifecycle.end();
//		log.info("Saga finished");
//	}
}
