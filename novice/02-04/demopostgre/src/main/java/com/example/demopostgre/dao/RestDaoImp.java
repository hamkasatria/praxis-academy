package com.example.demopostgre.dao;

import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

@TransactionalTestExecutionListener
@Repository
public class RestDaoImp implements RestDao{
@Autowired
private JdbcTemplate jdbcTemplate;
//method dari interface
}

