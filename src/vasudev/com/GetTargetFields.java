package vasudev.com;

public class GetTargetFields

{
    private JdbcTemplate jdbcTemplate;
    private DataSource dataSource;

    public static ResultSet rs=null;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(this.dataSource);
    }

    public ResultSet getTargetField() // I know the code is wrong. But I tried this
    {
         ResultSet rs=jdbcTemplate.query("SELECT * from employee",
            ResultSet); //shows error. I want to get the result in ResultSet 
                //Or how the data will be stored in *Collector* and I can access each column fields?
     return rs;
    }

}