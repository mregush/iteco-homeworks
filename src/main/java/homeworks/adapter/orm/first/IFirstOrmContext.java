package homeworks.adapter.orm.first;

import homeworks.adapter.IDbEntity;
import homeworks.adapter.orm.OrmContext;

public interface IFirstOrmContext <T extends IDbEntity> extends OrmContext {

    void create(T entity);

    T read(int id);

    void update(T entity);

    void delete(T entity);
}
