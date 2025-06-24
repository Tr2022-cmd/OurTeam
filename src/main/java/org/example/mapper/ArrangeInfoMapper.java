package org.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.example.entity.ArrangeInfo;

import java.util.Date;
import java.util.List;

@Mapper
public interface ArrangeInfoMapper extends BaseMapper<ArrangeInfo> {

    @Select("select *from arrange_info where arrange_id=#{id}")
    public ArrangeInfo selectArrangeById(int id);

    @Update("UPDATE arrange_info " +
            "SET arrange_date = #{arrangedate}, " +
            "arrange_timezone = #{arrangetimezone.displayValue}, " +
            "arrange_balance = #{arrangebalance}, " +
            "arrange_doc_id = #{arrangedocid} " +
            "WHERE arrange_id = #{arrangeid}")
    public int updateArrangeInfo(ArrangeInfo arrangeInfo);

    @Delete("delete  from arrange_info where arrange_id=#{id}")
    public int deleteArrangeById(int id);

    @Select("SELECT * FROM arrange_info where arrange_doc_id=#{docid}")
    public List<ArrangeInfo> selectBydocId(int docid);

    @Select("select * from arrange_info where arrange_date=#{date1}")
    public List<ArrangeInfo> selectBydate(Date date1);

    @Select("select * from arrange_info where arrange_date between #{startDate} AND #{endDate}")
    public List<ArrangeInfo> selectByDaterange(Date startDate, Date endDate);

    @Select("select arrange_timezone from arrange_info where arrange_doc_id=#{docid} AND arrange_date=#{date} AND arrange_balance!=0")
    public List<String>getAvailableSlots(int docid,Date date);

    @Select("select * from arrange_info where arrange_doc_id=#{docid} AND arrange_date=#{date}")
    public List<ArrangeInfo> getdetailinfo(int docid,Date date);

    @Select("select * from arrange_info where arrange_balance!=0")
    public List<ArrangeInfo> getremainingInfo();

    @Update("update arrange_info set arrange_balance=#{balance} where arrange_id=#{id}")
    public void updateBalance(int id,int balance);

    @Update("update arrange_info set arrange_balance=arrange_balance-#{amount}  where arrange_id=#{id}")
    public void decreaseBalance(int id,int amount);

    @Update("update arrange_info set arrange_balance=arrange_balance+#{amount}  where arrange_id=#{id}")
    public void increaseBalance(int id,int amount);

    @Select("select count(*)from arrange_info where arrange_doc_id=#{docid}")
    public long countbydocid(int docid);

    @Select("select count(*)from arrange_info where arrange_doc_id=#{docid} AND arrange_balance!=0")
    public long countremainingbydocid(int docid);


}
