# Kafka Project Details

* Download the Apache Kafka and unzip the folder.
* Start Zookeeper
   ```
  C:\Home\Personal\Projects\Kafka\Apache>.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
  ```

* Start Kafka server
    ```
    C:\Home\Personal\Projects\Kafka\Apache>.\bin\windows\kafka-server-start.bat .\config\server.properties
    ```
* Use OKHTTP eventsource Event Listener which will read the events from wikimedia
    *  To read real time stream data from wikimedia, we use event source
* Add the above dependency

Kafka Project
==============
In this project we will Stream the data from Wiki Media using kafka producer send the data to kafka topic.We will read this data from kafka consumer.

    Wiki Media sends the events in a stream/Twittwer 
    |
    |
    kafka Producer reads the events and send to Topic
    |
    |
    KAFKA TOPIC
    |
    |
    kafka Consumer

