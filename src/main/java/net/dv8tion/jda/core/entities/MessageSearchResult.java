package net.dv8tion.jda.core.entities;

import org.json.JSONObject;

import java.util.Collections;
import java.util.List;

/**
 * Created by JunHyeong Lim on 2018-02-24
 */
public class MessageSearchResult {
    private final String analyticsId;
    private final int totalResults;
    private final List<Message> messages;

    public MessageSearchResult(String analyticsId, int totalResults, List<Message> messages) {
        this.analyticsId = analyticsId;
        this.totalResults = totalResults;
        this.messages = Collections.unmodifiableList(messages);
    }

    public String getAnalyticsId() {
        return analyticsId;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public List<Message> getMessages() {
        return messages;
    }
}
