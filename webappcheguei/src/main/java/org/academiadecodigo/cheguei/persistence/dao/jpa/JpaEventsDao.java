package org.academiadecodigo.cheguei.persistence.dao.jpa;

import org.academiadecodigo.cheguei.persistence.dao.EventsDao;
import org.academiadecodigo.cheguei.persistence.model.Events.Events;

public class JpaEventsDao extends GenericJpaDao<Events> implements EventsDao {

    public JpaEventsDao() {
        super(Events.class);
    }
}
