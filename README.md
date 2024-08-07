# ChatBot_RAG_V1

## Overview
ChatBot_RAG_V1 is a Retrieval-Augmented Generation (RAG) chatbot application built using Spring Boot and Vaadin (React-based UI framework). This project demonstrates the integration of advanced AI capabilities with a modern web application stack.

## Features
- Spring Boot 3.3.2 based backend
- Vaadin 24.4.4 for the frontend, providing a React-based UI
- Integration with Ollama AI model (llama2) for natural language processing
- Retrieval-Augmented Generation (RAG) capabilities
- PDF document reading support
- PostgreSQL vector store for efficient similarity searches
- JPA for data persistence

## Technologies Used
- Java 21
- Spring Boot 3.3.2
- Spring AI 1.0.0-M1
- Vaadin 24.4.4
- Ollama AI
- PostgreSQL with pgvector
- Maven for dependency management and build

## Setup and Running
1. Ensure you have Java 21 installed
2. Set up PostgreSQL with pgvector extension
3. Clone the repository
4. Configure the application.properties file with your database and Ollama settings
5. Run `mvn spring-boot:run` to start the application
6. Access the application at `http://localhost:8080`


## Potential Future Enhancements
1. Integration with other AI models (OpenAI, etc.)
2. Enhanced document processing capabilities (support for more file types)
3. Improved vector search algorithms for better retrieval
4. User authentication and personalized chat history
5. Multi-language support
6. Integration with external knowledge bases
7. Customizable UI themes
8. Performance optimizations for handling large datasets
9. Deployment guides for cloud platforms (AWS, GCP, Azure)
10. API documentation for potential integrations

## Contributing

Contributions to ChatBot_RAG_V1 are welcome. Please feel free to submit pull requests or create issues for bugs and feature requests.

## License

MIT License

Copyright (c) 2024 HAMZA

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.

## Acknowledgments
- Spring AI team for providing powerful AI integration capabilities
- Vaadin team for their excellent UI framework
- Ollama project for the AI model support