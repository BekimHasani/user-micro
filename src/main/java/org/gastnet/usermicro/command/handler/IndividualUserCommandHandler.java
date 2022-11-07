package org.gastnet.usermicro.command.handler;

//@Slf4j
//@Component
public class IndividualUserCommandHandler{
	
//	@Autowired
//	private EventBus eventBus;
//
//	@Autowired
//	private UserService userService;
//
//	@CommandHandler
//	protected void handle(InitializeIndividualUserSagaCommand initializeSagaCommand) {
//		eventBus.publish(GenericEventMessage.asEventMessage(new CreateUserForIndividualEvent(initializeSagaCommand.individualSagaId,initializeSagaCommand.individualUserDTO)));
//	}
//
//
//	@CommandHandler
//	protected void handle(CreateUserForIndividualCommand createUserCommand) {
//		try {
//			log.info("Handling CreateUserCommand");
//			User user = createUserCommand.individualUserDTO.getUser();
//			user.setCreationDate(new Date());
//			user.setGoogleUser(false);
//			user.setStatus(true);
//			user.setUserState(UserState.PENDING);
//			user.setRole(Role.INDIVIDUAL);
//			User persistedUser = userService.save(user);
//			createUserCommand.individualUserDTO.setUser(persistedUser);
//			log.info("User " + persistedUser + "Created \n Triggering UserCreatedEvent");
//			eventBus.publish(GenericEventMessage.asEventMessage(new UserForIndividualCreatedEvent(createUserCommand.individualSagaId,createUserCommand.individualUserDTO)));
//		} catch (Exception e) {
//			log.error("Exception on CreateUserCommand handler :" + e.getMessage());
//		}
//	}
//
//	@CommandHandler
//	protected void handle(FinishIndividualUserCreationCommand finishUserCreationCommand) {
//		try {
//			log.info("Handling FinishIndividualUserCreationCommand");
//			User user = userService.findById(finishUserCreationCommand.userId);
//			user.setUserState(UserState.CREATED);
//			userService.save(user);
////			EmailSender.builder().withFrom("")
////					.withTo(user.getEmail()).withContext("")
////					.withSubject("User Created Succesfully")
////					.build().send();
//			log.info("User " + user + "Created \n Triggering UserFinishedEvent");
//			eventBus.publish(GenericEventMessage.asEventMessage(new IndividualUserFinishedEvent(user.getEmail(),user.getUserId())));
//		} catch (Exception e) {
//			log.error("Exception on FinishIndividualUserCreationCommand handler :" + e.getMessage());
//		}
//
//	}
}
