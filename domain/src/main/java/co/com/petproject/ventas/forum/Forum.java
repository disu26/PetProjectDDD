package co.com.petproject.ventas.forum;

import co.com.sofka.domain.generic.AggregateEvent;

public final class Forum extends AggregateEvent<ForumId> {
    public Forum(ForumId forumId) {
        super(forumId);
    }
}
