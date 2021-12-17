package com.amazon.ata.dynamodbannotationsloadsave.handler;

import com.amazon.ata.dynamodbannotationsloadsave.cli.DiscussionCliOperation;
import com.amazon.ata.dynamodbannotationsloadsave.cli.DiscussionCliState;
import com.amazon.ata.input.console.ATAUserHandler;

/**
 * Handler for the CREATE_TOPIC operation.
 */
public class CreateTopicMessageHandler implements DiscussionCliOperationHandler {
    private ATAUserHandler userHandler;

    /**
     * Constructs handler with its dependencies.
     * @param userHandler the ATAUserHandler, for user input
     */
    public CreateTopicMessageHandler(ATAUserHandler userHandler) {
        this.userHandler = userHandler;
    }

    @Override
    public String handleRequest(DiscussionCliState state) {
        if (null == state.getCurrentMember()) {
            throw new IllegalStateException(
                "Encountered request to create topic message but there is no current member. Exiting"
            );
        }
        if (null == state.getCurrentTopic()) {
            state.setNextOperation(DiscussionCliOperation.VIEW_TOPICS);
            return "You must select a topic first.";
        }

        String messageContent = userHandler.getString("Message:");
        // PARTICIPANTS: Create the TopicMessage and save it
        state.setNextOperation(DiscussionCliOperation.VIEW_TOPIC_MESSAGES);


        return "\n*** Creating topic messages isn't supported yet. Maybe you can implement it? :)";
    }
}
