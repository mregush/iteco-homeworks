package homeworks.adapter.orm;

import homeworks.adapter.DbUserEntity;
import homeworks.adapter.DbUserInfoEntity;
import homeworks.adapter.IDbEntity;
import homeworks.adapter.orm.first.IFirstOrmContext;
import homeworks.adapter.orm.second.ISecondOrmContext;

import java.util.Set;

public class OrmAdapterImpl implements IFirstOrmContext, ISecondOrmContext {

    private OrmContext ormContext;

    @Override
    public void create(IDbEntity entity) {
        if (ormContext instanceof IFirstOrmContext) {
            IFirstOrmContext context = (IFirstOrmContext) ormContext;
            context.create(entity);
        } else {
            return;
        }
    }

    @Override
    public IDbEntity read(int id) {
        if (ormContext instanceof IFirstOrmContext) {
            IFirstOrmContext context = (IFirstOrmContext) ormContext;
            return context.read(id);
        }
        return null;
    }

    @Override
    public void update(IDbEntity entity) {
        if (ormContext instanceof IFirstOrmContext) {
            IFirstOrmContext context = (IFirstOrmContext) ormContext;
            context.update(entity);
        } else {
            return;
        }
    }

    @Override
    public void delete(IDbEntity entity) {
        if (ormContext instanceof IFirstOrmContext) {
            IFirstOrmContext context = (IFirstOrmContext) ormContext;
            context.delete(entity);
        } else {
            return;
        }
    }

    @Override
    public Set<DbUserEntity> getUsers() {
        if (ormContext instanceof ISecondOrmContext) {
            ISecondOrmContext context = (ISecondOrmContext) ormContext;
            return context.getUsers();
        }
        return null;
    }

    @Override
    public Set<DbUserInfoEntity> getUserInfos() {
        if (ormContext instanceof ISecondOrmContext) {
            ISecondOrmContext context = (ISecondOrmContext) ormContext;
            return context.getUserInfos();
        }
        return null;
    }
}
