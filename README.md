# Log Monitoring on linux server in spring boot

###########
Logging
###########

-> Logging is a process of storing application execution details

-> Log messages will help us to understand the problems occuring in the application execution

-> If any problem occurs in  project execution we need to check log file of that project to find out the root cause

-> In Realtime, for every project Logging will be implemented


						logging					check logs
			application ---------------------> Log file <------------------------------developers


###################
Logging Architecture
####################


1) Logger   : It is an API  which provides methods to perform logging

		Ex : trace ( ),  debug ( ) , info ( ), warn ( ), error ( ) , fatal ( ) etc....

2) Layout : It represents log msg format (what info shud present in log msg)

		Ex:  DATE TIME  ClassName  Method Name : Log Msg

3) Appender	: It is used to write the log msg to destination

		Ex: Console Appender to write log msg to console

		       FileAppender to write log msg to log file

		       RollingFileAppender to write log msgs to log file based on Rolling Policies
		
					- TimeBasedRolling    (Based on given time new log file will be created)
					- SizeBasedRolling  (Based on given size new log file will be created)


############
Log Levels
###########

-> Log level will represent priotiry of log msg
					

		TRACE  	 => 	DEBUG	=>	INFO	=>	WARN	=> 	ERROR	=> 	FATAL


-> Log messages we will generate using Log Levels

-> Based On Log Level Configured, the log msgs will be printed

-> From the configured level to higher level logs will be printed


Note: In Spring Boot the default log level is 'INFO'


##########################################
Logging Properties in application.properties file
###########################################

logging.file.name=app.log
logging.pattern.rolling-file-name=app-%d{yyyy-MM-dd}.%i.log
logging.file.max-size=1MB
logging.file.max-history=30
logging.file.total-size-cap=10MB


##################
logback.xml
##################


<?xml version="1.0" encoding="UTF-8"?>
<configuration>
	<appender name="Console"
		class="ch.qos.logback.core.ConsoleAppender">
		<encoder>
			<pattern>%d [%thread] %-5level %-50logger{40} - %msg%n</pattern>
		</encoder>
	</appender>

	<appender name="RollingFile"
		class="ch.qos.logback.core.rolling.RollingFileAppender">
		<file>MyApp.log</file>
		<encoder>
			<pattern>%d [%thread] %-5level %-50logger{40} - %msg%n</pattern>
		</encoder>

		<rollingPolicy
			class="ch.qos.logback.core.rolling.SizeAndTimeBasedRollingPolicy">
			<fileNamePattern>MyApp-%d{yyyy-MM-dd}.%i.log</fileNamePattern>
			<maxFileSize>1MB</maxFileSize>
			<maxHistory>30</maxHistory>
			<totalSizeCap>10MB</totalSizeCap>
			<cleanHistoryOnStart>true</cleanHistoryOnStart>
		</rollingPolicy>
	</appender>

	<root level="INFO">
		<appender-ref ref="Console" />
		<appender-ref ref="RollingFile" />
	</root>
</configuration>




##############
Assignment
###############

1) Create Spring Boot application with Rest Controller
2) Implement Logging
3) Package application using Maven
4) Create EC2 Linux Machine in AWS Cloud
5) Connect to EC2 Linux Machine using WinSCP/MobaXterm
6) Install Java in Ec2 Linux Machine
7) Upload springboot application jar file into Linux Machine
8) Run boot application using Jar file
9) Access boot application in browser (enable security group with 8080 port number)
10) Check Log file using tail & grep commands





