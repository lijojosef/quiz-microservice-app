# Microservices Quiz App with Spring Boot

Welcome to the Microservices Quiz App, a fully backend application built using Spring Boot! This project demonstrates the implementation of microservices architecture and covers various aspects such as ResponseEntity, Exception Handling, Service Discovery, Feign, Load Balancing, and API Gateway.

## Table of Contents
1. [Introduction](#introduction)
2. [Microservices Overview](#microservices-overview)
    - [Question Service](#question-service)
    - [Quiz Service](#quiz-service)
3. [Service Communication](#service-communication)
    - [Service Discovery](#service-discovery)
    - [Feign Client](#feign-client)
    - [Load Balancing](#load-balancing)
4. [API Gateway](#api-gateway)
5. [Running the Application](#running-the-application)
6. [Contributing](#contributing)
7. [License](#license)

## Introduction

This project is a comprehensive guide to building microservices using Spring Boot. It covers the creation of a Quiz App with a focus on effective communication between microservices, service discovery, and the implementation of an API Gateway.

## Microservices Overview

### Question Service

The foundation of the Quiz App lies in the Question Service. This service is responsible for managing and serving quiz questions. It showcases the use of ResponseEntity and efficient Exception Handling for a seamless user experience.

### Quiz Service

The Quiz Service complements the Question Service by orchestrating the flow of the quiz. It demonstrates how microservices can collaborate to provide a cohesive application.

## Service Communication

### Service Discovery

Service Discovery is a crucial aspect of microservices architecture. Learn how to create a Service Registry that enables microservices to find and communicate with each other dynamically.

### Feign Client

Working with Feign simplifies the process of making one microservice call another. Dive into the details of how Feign is utilized for communication between microservices.

### Load Balancing

As your microservices scale, Load Balancing becomes essential. Discover how to implement Load Balancing for even distribution of traffic and enhanced performance.

## API Gateway

API Gateway acts as a central point for managing and securing APIs. Explore the importance of an API Gateway in a microservices environment and how it streamlines communication.

## Running the Application

To run the Microservices Quiz App locally, follow these steps:

1. **Question Service:**
    - [ ] Build and run the Question Service module.

2. **Quiz Service:**
    - [ ] Create the Quiz Service and ensure it communicates effectively with the Question Service.

3. **Service Discovery:**
    - [ ] Set up a Service Registry to enable dynamic service discovery.

4. **Feign Client and Load Balancing:**
    - [ ] Implement Feign for microservice communication.
    - [ ] Integrate Load Balancing for optimal performance.

5. **API Gateway:**
    - [ ] Deploy an API Gateway to manage and secure the APIs.

6. **Access the Application:**
    - [ ] Access the Microservices Quiz App via the API Gateway.
<img width="1411" alt="image" src="https://github.com/lijojosef/quiz-microservice-app/assets/39986674/ea8dbb29-6420-4533-bf41-55d215d823ea">

## Contributing

Contributions are welcome! If you have ideas for improvements or new features, feel free to open an issue or submit a pull request.

## License

This Microservices Quiz App is licensed under the [MIT License](LICENSE.md). Feel free to use, modify, and distribute it as per the terms of the license.

Happy coding! 🚀
