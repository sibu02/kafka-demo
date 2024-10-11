# Kafka Demo Project

# Project Overview
This project demonstrates the integration of Apache Kafka with a Spring Boot microservice. It includes a basic setup where messages are produced and consumed using Kafka.

# Prerequisites
Java 8 </br>
Apache Kafka (Locally Installed)</br>
Spring Boot</br>
Maven</br>

# Technologies Used
Spring Boot - Backend framework</br>
Kafka - Message broker</br>
Maven - Dependency management</br>

# Step 1: Kafka Setup

# 1.1 Download and Install Kafka</br>
Download Apache Kafka from the official site: Kafka Downloads</br>
Extract the Kafka files to a directory.</br></br>

# 1.2 Start Zookeeper</br>
Kafka needs Zookeeper to manage distributed brokers. To start Zookeeper, run:</br>
cd /path/to/kafka</br>
bin/windows/zookeeper-server-start.bat config/zookeeper.properties</br>

# 1.3 Start Kafka Server</br>
Once Zookeeper is running, start the Kafka server:</br>
cd /path/to/kafka </br>
bin/windows/kafka-server-start.bat config/server.properties</br></br>

# Step 2: Kafka Topics and Commands</br>

# 2.1 Create a Kafka Topic</br>
bin/windows/kafka-topics.bat --create --topic employee-events --bootstrap-server localhost:9092 </br></br>

# 2.2 List Kafka Topics</br>
bin/windows/kafka-topics.bat --list --bootstrap-server localhost:9092</br></br>

# 2.3 Send a Message to a Topic</br>
bin/windows/kafka-console-producer.bat --topic employee-events --bootstrap-server localhost:9092</br>
Type a message and hit Enter to send it.</br></br>

# 2.4 Read Messages from a Topic</br>
bin/windows/kafka-console-consumer.bat --topic employee-events --from-beginning --bootstrap-server localhost:9092</br>
This will read all messages from the beginning of the topic.</br></br>

# 2.5 Delete a Kafka Topic</br>
bin/windows/kafka-topics.bat --delete --topic employee-events --bootstrap-server localhost:9092</br></br>

# Step 3: Spring Boot Application Setup</br>
</br>
# 3.1 Clone the Repository</br>
git clone https://github.com/your-username/kafka-demo.git</br></br>

# 3.2 Configure Application Properties</br>
In the src/main/resources/application.properties file, configure Kafka and MySQL:</br></br>

# Kafka Configuration</br>
spring.kafka.bootstrap-servers=localhost:9092</br></br>

# Kafka Commands Cheat Sheet</br>

</br>
Start Zookeeper:</br>
bin/windows/zookeeper-server-start.bat config/zookeeper.properties</br></br>

Start Kafka:</br>
bin/windows/kafka-server-start.bat config/server.properties</br></br>

Create a Topic:</br>
bin/windows/kafka-topics.bat --create --topic employee-events --bootstrap-server localhost:9092</br></br>
List Topics:</br>

bin/windows/kafka-topics.bat --list --bootstrap-server localhost:9092</br></br>

Send a Message:</br>
bin/windows/kafka-console-producer.bat --topic employee-events --bootstrap-server localhost:9092</br></br>

Consume Messages:</br>
bin/windows/kafka-console-consumer.bat --topic employee-events --from-beginning --bootstrap-server localhost:9092</br></br>

