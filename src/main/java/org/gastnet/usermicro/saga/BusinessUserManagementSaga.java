package org.gastnet.usermicro.saga;

//@Slf4j
//@Saga
public class BusinessUserManagementSaga {

//	@Autowired
//	private transient CommandGateway commandGateway;
//
//	@StartSaga
//	@SagaEventHandler(associationProperty = "businessSagaId")
//	public void handle(CreateUserForBusinessEvent createUserEvent) {
//		log.info("Started Saga --> CreateUserForBusinessEvent triggered:");
//		SagaLifecycle.associateWith("businessSagaId",createUserEvent.businessSagaId);
//		commandGateway.send(new CreateUserForBusinessCommand(createUserEvent.businessSagaId,createUserEvent.businessUserDTO));
//	}
//
//	@SagaEventHandler(associationProperty = "businessSagaId")
//	public void handle(UserForBusinessCreatedEvent userCreatedEvent) {
//		log.info("UserForBusinessCreatedEvent triggered");
//		long userId = userCreatedEvent.businessUserDTO.getUser().getUserId();
//		SagaLifecycle.associateWith("userId",userId);
//		commandGateway.send(new CreateBusinessUserCommand(userId,SagaUtils.convertBusinessForSaga(userCreatedEvent.businessUserDTO.getBusiness())));
//	}
//
//	@SagaEventHandler(associationProperty = "userId")
//	public void handle(BusinessCreatedEvent businessCreatedEvent) {
//		log.info("BusinessCreatedEvent triggered");
//		long userId = businessCreatedEvent.userId;
//		SagaLifecycle.associateWith("userId" , userId);
//		commandGateway.send(new FinishBusinessUserCreationCommand(userId));
//	}
//
//	@SagaEventHandler(associationProperty = "userId")
//	public void handle(BusinessUserFinishedUser businessUserFinishedEvent) {
//		log.info("BusinessUserFinishedUser troggered: ");
//		SagaLifecycle.end();
//		log.info("Saga finished");
//	}
}
