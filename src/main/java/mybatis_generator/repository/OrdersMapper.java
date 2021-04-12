package mybatis_generator.repository;

import java.util.List;
import mybatis_generator.model.Orders;

public interface OrdersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core_data.orders
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core_data.orders
     *
     * @mbg.generated
     */
    int insert(Orders record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core_data.orders
     *
     * @mbg.generated
     */
    Orders selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core_data.orders
     *
     * @mbg.generated
     */
    List<Orders> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core_data.orders
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Orders record);
}