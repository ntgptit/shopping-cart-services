package mybatis_generator.repository;

import java.util.List;
import mybatis_generator.model.Categories;

public interface CategoriesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core_data.categories
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core_data.categories
     *
     * @mbg.generated
     */
    int insert(Categories record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core_data.categories
     *
     * @mbg.generated
     */
    Categories selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core_data.categories
     *
     * @mbg.generated
     */
    List<Categories> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table core_data.categories
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Categories record);
}