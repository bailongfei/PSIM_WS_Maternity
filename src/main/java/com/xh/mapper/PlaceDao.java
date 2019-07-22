package com.xh.mapper;
import com.xh.vo.BedVo;
import com.xh.vo.FindMaternalVo;
import com.xh.vo.PlaceVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PlaceDao {

    List<PlaceVo> call_Place();

    List<BedVo> call_Bed(String Place_NO);

    List<FindMaternalVo> findMaternal(
            @Param("Puerpaer_Name") String Puerpaer_Name,
            @Param("Bed_Name") String Bed_Name,
            @Param("Puerpaer_Status") int Puerpaer_Status
    );

}
