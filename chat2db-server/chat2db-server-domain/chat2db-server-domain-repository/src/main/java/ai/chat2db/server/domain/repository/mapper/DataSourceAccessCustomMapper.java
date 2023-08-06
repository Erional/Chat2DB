package ai.chat2db.server.domain.repository.mapper;

import ai.chat2db.server.domain.repository.entity.DataSourceAccessDO;
import ai.chat2db.server.domain.repository.entity.DataSourceDO;
import com.baomidou.mybatisplus.core.mapper.Mapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.ibatis.annotations.Param;

/**
 * Data Source Access Mapper
 *
 * @author Jiaju Zhuang
 */
public interface DataSourceAccessCustomMapper extends Mapper<DataSourceAccessDO> {

    IPage<DataSourceAccessDO> comprehensivePageQuery(IPage<DataSourceDO> page, @Param("dataSourceId") Long dataSourceId, @Param("searchKey") String searchKey);

}
