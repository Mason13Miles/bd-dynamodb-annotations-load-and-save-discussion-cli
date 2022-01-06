# DynamoDB Annotations, Load, and Save - ATA Discussion CLI

## Phase 0:Deploy your DynamoDB tables

1. Create the tables we'll be using for this activity by running the following `aws` CLI commands:
   ```none
   aws cloudformation create-stack --region us-west-2 --stack-name dynamodbannotationsloadsave-memberstable --template-body file://cloudformation/dynamodbannotationsloadsave/classroom/discussion_cli_table_members.yaml --capabilities CAPABILITY_IAM
   aws cloudformation create-stack --region us-west-2 --stack-name dynamodbannotationsloadsave-messagestable --template-body file://cloudformation/dynamodbannotationsloadsave/classroom/discussion_cli_table_messages.yaml --capabilities CAPABILITY_IAM
   aws cloudformation create-stack --region us-west-2 --stack-name dynamodbannotationsloadsave-topicstable --template-body file://cloudformation/dynamodbannotationsloadsave/classroom/discussion_cli_table_topics.yaml --capabilities CAPABILITY_IAM
   ```
1. Make sure the `aws` command runs without error.
1. Log into your AWS account and verify that the tables exist and have
   sample data.
   
These tables are used by our Discussion CLI. The Discussion CLI lets members create discussion topics, look up
what topics already exist, read messages on those topics, and send messages to those topics..

**GOAL:** `DynamoDbAnnotationsLoadSave-Members`, `DynamoDbAnnotationsLoadSave-Messages` and
`DynamoDbAnnotationsLoadSave-Topics` tables are created in your AWS Account, including sample data.

Phase 0 is complete when:
* `DynamoDbAnnotationsLoadSave-Members`, `DynamoDbAnnotationsLoadSave-Messages`, and `DynamoDbAnnotationsLoadSave-Topics`
  tables exist in your Unit 3 AWS account with some sample data

## Phases 1+

Follow the instructions provided by the instructors in class.
