package com.xh.mapper;
import com.xh.vo.BedVo;
import com.xh.vo.PlaceVo;

import java.util.List;

public interface PlaceDao {

    List<PlaceVo> call_Place();

    List<BedVo> call_Bed(String Place_NO);

}
