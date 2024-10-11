# Kafka Demo Project

# Project Overview
This project demonstrates the integration of Apache Kafka with a Spring Boot microservice. It includes a basic setup where messages are produced and consumed using Kafka.

Prerequisites
Java 8
Apache Kafka (Locally Installed)
Spring Boot
Maven

Technologies Used
Spring Boot - Backend framework
Kafka - Message broker
Maven - Dependency management

Step 1: Kafka Setup

1.1 Download and Install Kafka
Download Apache Kafka from the official site: Kafka Downloads
Extract the Kafka files to a directory.

1.2 Start Zookeeper
Kafka needs Zookeeper to manage distributed brokers. To start Zookeeper, run:

cd /path/to/kafka
bin/windows/zookeeper-server-start.bat config/zookeeper.properties

1.3 Start Kafka Server
Once Zookeeper is running, start the Kafka server:

cd /path/to/kafka </br>
bin/windows/kafka-server-start.bat config/server.properties

Step 2: Kafka Topics and Commands

2.1 Create a Kafka Topic
You can create a Kafka topic for your demo by running:

bin/windows/kafka-topics.bat --create --topic employee-events --bootstrap-server localhost:9092 

2.2 List Kafka Topics
To view the list of existing topics:

bin/windows/kafka-topics.bat --list --bootstrap-server localhost:9092

2.3 Send a Message to a Topic
To produce (send) a message to the employee-events topic:

bin/windows/kafka-console-producer.bat --topic employee-events --bootstrap-server localhost:9092
Type a message and hit Enter to send it.

2.4 Read Messages from a Topic
To consume messages from the topic:

bin/windows/kafka-console-consumer.bat --topic employee-events --from-beginning --bootstrap-server localhost:9092
This will read all messages from the beginning of the topic.

2.5 Delete a Kafka Topic
To delete a topic:

bin/windows/kafka-topics.bat --delete --topic employee-events --bootstrap-server localhost:9092

Step 3: Spring Boot Application Setup

3.1 Clone the Repository
Clone this repository to your local machine:

git clone https://github.com/your-username/kafka-demo.git
3.2 Configure Application Properties
In the src/main/resources/application.properties file, configure Kafka and MySQL:

# Kafka Configuration
spring.kafka.bootstrap-servers=localhost:9092


Kafka Commands Cheat Sheet
Start Zookeeper:

bin/windows/zookeeper-server-start.bat config/zookeeper.properties
Start Kafka:

bin/windows/kafka-server-start.bat config/server.properties
Create a Topic:

bin/windows/kafka-topics.bat --create --topic employee-events --bootstrap-server localhost:9092
List Topics:

bin/windows/kafka-topics.bat --list --bootstrap-server localhost:9092
Send a Message:

bin/windows/kafka-console-producer.bat --topic employee-events --bootstrap-server localhost:9092
Consume Messages:

bin/windows/kafka-console-consumer.bat --topic employee-events --from-beginning --bootstrap-server localhost:9092

