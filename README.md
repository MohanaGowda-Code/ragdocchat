**Ragdocchat**
RAG-based Document Chat application built using Java 17, Spring Boot 3.5, Apache Tika, OCR (Tesseract), and OpenAI (upcoming steps).
This project demonstrates a real-world Retrieval Augmented Generation (RAG) pipeline implemented in Java.

**Tech Stack**
Java 17
Spring Boot 3.5
Apache Tika 2.8.0
Tesseract OCR 5.x
Maven

**REST APIs**
Project Goal
To build a production-ready backend that allows users to:
Upload documents (PDF)
Extract text (including scanned PDFs using OCR)
Chunk documents intelligently
Generate embeddings
Chat with documents using RAG

**PDF Upload + OCR (COMPLETED)**
Upload PDF via REST API
Text extraction using Apache Tika
OCR fallback using Tesseract for scanned PDFs
Handles small and large PDFs safely

**Roadmap**
🔜 STEP-3: Smart Chunking
🔜 STEP-4: OpenAI Embeddings
🔜 STEP-5: Vector Store Integration
🔜 STEP-6: RAG-based Chat API

**API Endpoints**
Upload PDF
POST /api/rag/upload
Request
Multipart file (file)
Response
Extracted text from PDF (text-based or scanned)

** Sample Output**
Received file: Document.pdf, size: 23490
Extracted text: [Mohana Gowda]

**Important Notes**
Scanned PDFs require Tesseract OCR installed locally
Text-based PDFs are parsed directly using Apache Tika
No external API calls are used in STEP-2
WebClient will be used in future steps (embeddings & chat)

**Author**
Mohana
Senior Java & Microservices Engineer
Exploring AI, RAG, and LLM integration with Spring Boot

