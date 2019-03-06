package com.laibao.kotlin.dataclass;

import java.net.URI;
import java.util.Date;
import java.util.List;

public class BlogEntryJ {
    private final String title;
    private final String description;
    private final Date publishTime;
    private final Boolean approved;
    private final Date lastUpdated;
    private final URI url;
    private final Integer comments;
    private final List<String> tags;
    private final String email;

    public BlogEntryJ(String title, String description, Date publishTime, Boolean approved, Date lastUpdated, URI url, Integer comments, List<String> tags, String email) {
        this.title = title;
        this.description = description;
        this.publishTime = publishTime;
        this.approved = approved;
        this.lastUpdated = lastUpdated;
        this.url = url;
        this.comments = comments;
        this.tags = tags;
        this.email = email;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public Boolean getApproved() {
        return approved;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public URI getUrl() {
        return url;
    }

    public Integer getComments() {
        return comments;
    }

    public List<String> getTags() {
        return tags;
    }

    public String getEmail() {
        return email;
    }
}
