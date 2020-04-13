package com.proj1.FirstSpring.Service;

/**
 * GreetingService
 */
public class GreetingService {

    private final String content;
    private final long id;

    public GreetingService(long id, String content) {
        this.id = id;
        this.content = content;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

}