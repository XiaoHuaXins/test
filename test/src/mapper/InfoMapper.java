package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pojo.Info;
import pojo.InfoExample;
import pojo.InfoWithBLOBs;

public interface InfoMapper {
    int countByExample(InfoExample example);

    int deleteByExample(InfoExample example);

    int insert(InfoWithBLOBs record);

    int insertSelective(InfoWithBLOBs record);

    List<InfoWithBLOBs> selectByExampleWithBLOBs(InfoExample example);

    List<Info> selectByExample(InfoExample example);

    int updateByExampleSelective(@Param("record") InfoWithBLOBs record, @Param("example") InfoExample example);

    int updateByExampleWithBLOBs(@Param("record") InfoWithBLOBs record, @Param("example") InfoExample example);

    int updateByExample(@Param("record") Info record, @Param("example") InfoExample example);
}