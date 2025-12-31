package com.aiworld.ragdocchat.model;

public class DocumentChunk {

    private String content;
    private String metadata;

    public DocumentChunk() {}

    public DocumentChunk(String content, String metadata) {
        this.content = content;
        this.metadata = metadata;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }
}
