package co.com.petproject.ventas.forum.commands;

import co.com.petproject.ventas.forum.values.ForumId;
import co.com.petproject.ventas.generic.values.Fecha;
import co.com.sofka.domain.generic.Command;

public final class CrearForum extends Command {
    private final ForumId forumId;
    private final Fecha fecha;

    public CrearForum(ForumId forumId, Fecha fecha) {
        this.forumId = forumId;
        this.fecha = fecha;
    }

    public ForumId getForumId() {
        return forumId;
    }

    public Fecha getFecha() {
        return fecha;
    }
}
