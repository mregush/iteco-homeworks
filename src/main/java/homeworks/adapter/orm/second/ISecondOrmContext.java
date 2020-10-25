package homeworks.adapter.orm.second;


import homeworks.adapter.DbUserEntity;
import homeworks.adapter.DbUserInfoEntity;
import homeworks.adapter.orm.OrmContext;

import java.util.Set;

/**
 * ISecondOrmContext.
 *
 * @author Ilya_Sukhachev
 */
public interface ISecondOrmContext extends OrmContext {

    Set<DbUserEntity> getUsers();
    Set<DbUserInfoEntity> getUserInfos();

}
